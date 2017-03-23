import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class to input data from command line and .json - files.
 * Created by User on 09.03.2017.
 */
class Input {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> list;
    private String line;
    private BufferedReader reader;
    private ArrayList<Object> cashArrayList1;
    private ArrayList<Object> cashArrayList2;
    private ArrayList<String> valueList;

    /**
     * @return inputting from command line text
     */
    String getParam() {
        return scanner.nextLine();
    }

    /**
     * @param fileName containing name of .json-file.
     * @return data in list from .json-file.
     */
    ArrayList<String> getData(String fileName) {
        list = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * @param paramList list of params from .json-file.
     * @return list of value of each param.
     */
    ArrayList<String> setValue(ArrayList<Object> paramList){
        cashArrayList1 = new ArrayList<>();
        cashArrayList2 = new ArrayList<>();
        valueList = new ArrayList<>();

        for (int i = 0; i < paramList.size() - 1; i++) {
            if (paramList.get(i) instanceof String) {
                System.out.print("Input " + paramList.get(i) + ": ");
                if (paramList.get(i + 1) instanceof String) {
                    valueList.add(getParam());
                }
            }
            else {
                cashArrayList1 = (ArrayList<Object>) paramList.get(i);
                System.out.println();
                for (int j = 0; j < cashArrayList1.size(); j++) {
                    System.out.println("Input " + (j + 1) + " element of array: ");
                    cashArrayList2 = (ArrayList<Object>) cashArrayList1.get(j);
                    for (int k = 0; k < cashArrayList2.size(); k++) {
                        System.out.print("Input " + cashArrayList2.get(k) + ": ");
                        valueList.add(getParam());
                    }
                }
            }
        }
        if (paramList.get(paramList.size() - 1) instanceof String) {
            System.out.print("Input " + paramList.get(paramList.size() - 1) + ": ");
            valueList.add(getParam());
        }
        return valueList;
    }
}