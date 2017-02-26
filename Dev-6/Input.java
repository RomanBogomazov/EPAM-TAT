import java.util.Scanner;

/** Class to chose input date. */

class Input
{

/** Method return date from consol. */

  String get() {
    Scanner scan = new Scanner(System.in);
    return scan.nextLine();
  }
}