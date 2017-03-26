/**
 * Validate inputting data.
 * Created by User on 17.03.2017.
 */
class Validator {

    /**
     * @param coordinate coordinate of checker.
     * @return answer on valid length of checker cell.
     */
    boolean length(String coordinate) {
        boolean answer = false;
        if (coordinate.length() == 2) {
            answer = true;
        }
        return answer;
    }

    /**
     * @param color
     * @return answer on a question: "Inputting color valid - equals 'w' or 'b'?"
     */
    boolean color(String color) {
        boolean answer = false;
        if (color.equals("w") | color.equals("b")) {
            answer = true;
        }
        return answer;
    }

    /**
     * Validate coordinate on range: a1-h8.
     * @param coordinate
     * @return answer on a question: "Inputting coordinate valid - included in the limit a1-h8?"
     */
    boolean cellCoordinate(String coordinate) {
        boolean answer = false;
        if (((int)coordinate.charAt(0) >= 98 & (int)coordinate.charAt(0) <= 105) & (Integer.valueOf(coordinate.charAt(1)) >= 49 & Integer.valueOf(coordinate.charAt(1)) <= 56)){
            answer = true;
        }
        return answer;
    }
}
