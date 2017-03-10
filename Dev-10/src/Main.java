import java.util.ArrayList;

/**
 * Main class.
 * Created by User on 09.03.2017.
 */
public class Main {

    /**
     * Method to run project.
     * @param args
     */
    public static void main(String[] args){
        Input input = new Input();
        Parser parse = new Parser();
        String configureName = new String("tmp/configure.json");

        ArrayList<String> InputOutputName = input.getData(configureName);  //containing list of input and output name.

        ArrayList<String> inputList = input.getData(parse.getValue(InputOutputName.get(1)));    //magic number "1" mean that name of input.json has index == 1

        int[][] paramPosition = new int[inputList.size()][2];   //magic number "2" was choosing, because to insert in this structure value I was needed to know what line using to insert and what symbol.

        ArrayList<Object> paramList = parse.getParams(inputList, paramPosition);

        ArrayList<String> valueList = input.setValue(paramList);

        Output output = new Output();

        output.get(inputList, valueList, paramPosition, parse.getValue(InputOutputName.get(2)));    //magic number "2" mean that name of output.json has index == 2
    }
}