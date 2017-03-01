package task09;

import java.util.ArrayList;

/**
 * Class Checker
 */
public class Checker {

  private final int indexOfDay = 0;
  private final int indexOfMonth = 1;
  private final int indexOfYear = 2;
  private final int indexOfHours = 3;
  private final int indexOfMinutes = 4;
  private final int indexOfSeconds = 5;

  // mask for date and time
  // \\d{1,2} - one or two numbers
  // \\/ - separator /
  // \\s - separator space
  // \\: - separator :
  // \\d+ - minimum one number
  private static final String regexForDateAndTime = "^\\d{1,2}\\/\\d{1,2}\\/\\d+\\s{1}\\d{1,2}\\:\\d{1,2}\\:\\d{1,2}";


  /**
   * Method check input string for null and valid format: (1 or 2numbers)/(1 or 2numbers)/(minimym one numbers)(space) (1 or 2numbers):(1 or 2numbers):(1 or 2numbers)
   * params String @string for check
   */
  public void check(String string) throws Exception {
    if (string == null) {
      throw new Exception("String is null");
    }
    if (string == "") {
      throw new Exception("String is not have elements");
    }
    if (!string.matches(regexForDateAndTime)) {
      throw new Exception("String is not valid format.");
    }
  }

  /**
   * Method for first check elements for null or negative number
   * params ArrayList @list for check
   * return true or false (valid/invalid)
   */
  public boolean firstGeneralCheck(ArrayList list) throws Exception {
    for (int i = 0; i < list.size(); i++) {
      int element = Integer.parseInt((String) list.get(i));
      if (list.get(i) == null) {
        throw new Exception("element is null");
      }
      if (element < 0) {
        throw new Exception("element is < 0");
      }
    }
    return true;
  }

  /**
   * Method for check elements for valid values(date,time)
   * params ArrayList @list for check
   * return true or false (valid/invalid)
   */
  public boolean generalCheck(ArrayList list) throws Exception {
    System.out.println(checkForTime(list));
    if (checkForTime(list)) {
      System.out.println(checkForDate(list));
      if (checkForDate(list)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Method for check elements for valid time(minutes,seconds between 0-59; hours between 0 - 23)
   * params ArrayList @list for check
   * return true or false (valid/invalid)
   */
  private boolean checkForTime(ArrayList list) {
    int numberOfSecond = Integer.parseInt((String) list.get(indexOfSeconds));
    if (0 < numberOfSecond && 60 > numberOfSecond) {
      int numberOfMinutes = Integer.parseInt((String) list.get(indexOfMinutes));
      if (-1 < numberOfMinutes && 60 > numberOfMinutes) {
        int numberOfHours = Integer.parseInt((String) list.get(indexOfHours));
        if (-1 < numberOfHours && 24 > numberOfMinutes) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Method for check elements for valid date (year > 0; month between 1 - 12; days between 1 - (28|29|30}31))
   * params ArrayList @list for check
   * return true or false (valid/invalid)
   */
  private boolean checkForDate(ArrayList list) throws Exception {
    int numberOfYear = Integer.parseInt((String) list.get(indexOfYear));
    if (numberOfYear < 0) {
      System.out.println(false);
      return false;
    }
    return checkMonth(list);
  }

  /**
   * Method for check elements for valid numbers of days in month
   * params ArrayList @list for check
   * return true or false (valid/invalid)
   */
  private boolean checkMonth(ArrayList list) throws Exception {
    if (checkMonthWith31(list) || checkMonthWith30(list) || checkFebruary(list)) {
      return true;
    } else {
      System.out.println(false);
      return false;
    }
  }

  /**
   * Method for check elements for numbers of days(1-31) in 1,3,5,8,10,12 months
   * params ArrayList @list for check
   * return true or false (valid/invalid)
   */
  private boolean checkMonthWith31(ArrayList list) throws Exception {
    int numberOfDay = Integer.parseInt((String) list.get(indexOfDay));
    int numberOfMonth = Integer.parseInt((String) list.get(indexOfMonth));
    if(numberOfMonth==1||numberOfMonth==3||numberOfMonth==5||numberOfMonth==8||numberOfMonth==10||numberOfMonth==12) {
      if (numberOfDay < 32 && numberOfDay > 0) {
        return true;
      } else {
        throw new Exception("Days is not valid numbers");
      }
    } else {
      return false;
    }
  }

  /**
   * Method for check elements for numbers of days(1-30) in 4,6,7,9,11 months
   * params ArrayList @list for check
   * return true or false (valid/invalid)
   */
  private boolean checkMonthWith30(ArrayList list) throws Exception {
    int numberOfDay = Integer.parseInt((String) list.get(indexOfDay));
    int numberOfMonth = Integer.parseInt((String) list.get(indexOfMonth));
    if(numberOfMonth==4||numberOfMonth==6||numberOfMonth==7||numberOfMonth==9||numberOfMonth==11) {
      if (numberOfDay < 31 && numberOfDay > 0) {
        return true;
      } else {
        throw new Exception("Days is not valid numbers");
      }
    } else {
      return false;
    }
  }

  /**
   * Method for check elements for numbers of days(1-28(29)) in second months
   * params ArrayList @list for check
   * return true or false (valid/invalid)
   */
  private boolean checkFebruary(ArrayList list) throws Exception {
    int numberOfYear = Integer.parseInt((String) list.get(indexOfYear));
    int numberOfDay = Integer.parseInt((String) list.get(indexOfDay));
    int numberOfMonth = Integer.parseInt((String) list.get(indexOfMonth));
    if (numberOfMonth == 2) {
      if (numberOfYear % 4 == 0) {
        if (numberOfDay < 30 && numberOfDay > 0) {
          return true;
        } else {
          throw new Exception("Days in february is not valid numbers");
        }
      } else {
        if (numberOfDay < 29 && numberOfDay > 0) {
          return false;
        } else {
          throw new Exception("Days in february is not valid numbers");
        }
      }
    } else {
      return false;
    }
  }
}

