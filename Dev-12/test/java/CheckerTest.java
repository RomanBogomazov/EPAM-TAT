import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by User on 17.03.2017.
 * Class test for Checker.class.
 */
public class CheckerTest {
    private Checker checker = new Checker();
    private Validator validator = new Validator();
    private char currentLetter;
    private char wishfulLetter;
    private int currentNumber;
    private int wishfulNumber;
    private int[] currentPosition = new int[2];
    private int[] wishfulPosition = new int[2];
    private String curr;
    private String wish;

    /**
     * Constructor create random two statements: current(a1-d4) and wishful(a5-d8).
     */
    public CheckerTest() {
        do {
            currentLetter = (char) ((int)(Math.random() * 3) + 98); //generate current letter between a and d
            currentNumber = (int)(Math.random() * 3 + 1); //generate current letter between 1 and 4
        } while (((currentLetter + 1) % 2 == 0 | currentNumber % 2 !=0) & ((currentLetter + 1) % 2 != 0 | currentNumber % 2 ==0));

        do {
            wishfulLetter = (char) ((int)(Math.random() * 3) + 98); //generate current letter between a and d
            wishfulNumber = (int)(Math.random() * 3 + 5); //generate current letter between 5 and 8
        } while (((wishfulLetter + 1) % 2 == 0 | wishfulNumber % 2 !=0) & ((wishfulLetter + 1) % 2 != 0 | wishfulNumber % 2 ==0));

        currentPosition[0] =  Integer.valueOf(currentLetter);
        currentPosition[1] = Integer.valueOf(currentNumber);
        wishfulPosition[0] =  Integer.valueOf(wishfulLetter);
        wishfulPosition[1] = Integer.valueOf(wishfulNumber);
        curr = String.valueOf((char) currentPosition[0]) + String.valueOf(currentPosition[1]);
        wish = String.valueOf((char)wishfulPosition[0]) + String.valueOf(wishfulPosition[1]);
    }

    @Test
    public void testCheckerCanLive() {
        assertEquals("current position was chosen white cell", true, checker.canLive(currentPosition));
        assertEquals("wishful position was chosen white cell", true, checker.canLive(wishfulPosition));
    }

    @Test
    public void testCheckerCanMovement() {
        assertEquals("current position can not movement on wishful position", true, checker.canMovement(currentPosition, wishfulPosition));
        assertEquals("wishful position can not movement on current position", true, checker.canMovement(wishfulPosition, currentPosition));
    }

    @Test
    public void testCheckerColorMovement() {
        assertEquals("current position can not movement on wishful position if white", true, checker.get("w", curr, wish));
        assertEquals("current position can not movement on wishful position if black", true, checker.get("b", wish, curr));
    }

    @Test
    public void testValidatorColor() {
        assertEquals("not invalid color statement", true, validator.color("w"));
    }

    @Test
    public void testValidatorCellCoordinate() {
        assertEquals("d4 isn't valid cell", true, validator.cellCoordinate("d4"));
        assertEquals("d3 is valid data", true, validator.cellCoordinate("d3"));
    }
}