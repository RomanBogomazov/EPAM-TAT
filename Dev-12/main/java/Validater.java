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
        if (coordinate.length() == 2) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @param color
     * @return
     */
    boolean color(String color) {
        if (color.equals("w") | color.equals("b")) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Validate coordinate on range: a1-h8.
     * @param coordinate
     * @return
     */
    boolean cellCoordinate(String coordinate) {
        if (((int)coordinate.charAt(0) >= 98 & (int)coordinate.charAt(0) <= 105) & (Integer.valueOf(coordinate.charAt(1)) >= 49 & Integer.valueOf(coordinate.charAt(1)) <= 56)){
            return true;
        }
        else {
            return false;
        }
    }
}
