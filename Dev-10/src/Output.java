import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Output data filled .json-file.
 * Created by User on 10.03.2017.
 */
class Output {
    private String cash = new String();
    private File file;

    /**
     * Method to rewrite input file on output with inputting from command line params.
     * @param inputList list of data from input.json.
     * @param valueList list of params values.
     * @param paramPosition positions to insert values.
     * @param fileName name of output file of format .json.
     */
    void get(ArrayList<String> inputList, ArrayList<String> valueList, int[][] paramPosition, String fileName) {
        for (int i = 0; i < valueList.size(); i++) {
            cash = "";
            cash += inputList.get(paramPosition[i][0]).substring(0, paramPosition[i][1]);
            cash += valueList.get(i);
            cash += inputList.get(paramPosition[i][0]).substring(paramPosition[i][1], inputList.get(paramPosition[i][0]).length());
            inputList.set(paramPosition[i][0], cash);
        }

        file = new File(fileName);
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                for (int i = 0; i < inputList.size(); i++) {
                    out.println(inputList.get(i));
                }
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}