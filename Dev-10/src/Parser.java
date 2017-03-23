import java.util.ArrayList;

/**
 * Created by User on 09.03.2017.
 * Class to parse data from .json-files.
 */
class Parser {
    private ArrayList<Object> paramList = new ArrayList<>();
    private ArrayList<Object> cashArrayList = new ArrayList<>();
    private ArrayList<String> cashList = new ArrayList<>();
    private int counter = 0;

    /**
     * Method identify value on type. It's doing because in file containing values in quotes. Quotes is problem of parsing.
     * @param text is line from .json-file.
     * @param index is index on line.
     * @return index of line
     */
    private int identifyFirstValueSymbol(String text, int index){
        if (text.charAt(index + 4) == '"') {
            return index + 5;
        }
        else {
            return index + 4;
        }
    }

    /**
     * @param text is line from .json-file.
     * @return value of param from line.
     */
    String getValue(String text){
        int first = 0;
        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ':') {
                first = identifyFirstValueSymbol(text, i);
            }
            if (text.charAt(i) == ',') {
                text = text.substring(first, i - 1);
                break;
            }
            if (i == text.length() - 1) {
                text = text.substring(first, i);
                break;
            }
        }
        return text;
    }

    ArrayList<Object> getParams(ArrayList<String> list, int[][] paramPosition){
        for(int i = 1; i < list.size() - 1; i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if (list.get(i).charAt(j) == '"' & list.get(i).charAt(list.get(i).length() - 1) != '[') {
                    for (int k = j + 1; k < list.get(i).length(); k++) {
                        if (list.get(i).charAt(k) == '"') {
                            paramPosition[counter][0] = i;
                            paramPosition[counter][1] = k + 3;
                            counter++;
                            paramList.add(list.get(i).substring(j + 1, k));
                        }
                    }
                }
            }

            if (list.get(i).charAt(list.get(i).length() - 1) == '[') {
                for (int j = 0; j < list.get(i).length(); j++) {
                    if (list.get(i).charAt(j) == '"') {
                        for (int k = j + 1; k < list.get(i).length(); k++) {
                            if (list.get(i).charAt(k) == '"') {
                                paramList.add(list.get(i).substring(j + 1, k));
                            }
                        }
                    }
                }
                while (list.get(i).charAt(2) != ']') {
                    if (list.get(i + 1).length() > 4) {     //magic number "4" was choosing, because now I haven't ideas how to search this symbols.
                        if (list.get(i + 1).charAt(4) == '{') {
                            i++;
                            while (list.get(i + 1).charAt(4) != '}') {
                                for (int j = 0; j < list.get(i + 1).length(); j++) {
                                    if (list.get(i + 1).charAt(j) == '"') {
                                        for (int k = j + 1; k < list.get(i + 1).length(); k++) {
                                            if (list.get(i + 1).charAt(k) == '"') {
                                                paramPosition[counter][0] = i + 1;
                                                paramPosition[counter][1] = k + 3;
                                                counter++;
                                                cashList.add(list.get(i + 1).substring(j + 1, k));
                                                i++;
                                            }
                                        }
                                    }
                                }
                            }
                            cashArrayList.add(cashList);
                            cashList = new ArrayList<>();
                        }
                    }
                    i++;
                }
                paramList.add(cashArrayList);
            }
        }
        return paramList;
    }
}