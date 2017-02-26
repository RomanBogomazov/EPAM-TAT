/** Class to chose output date. */

class Output
{

/** Constructor keep input line and compare in classes this string. */

  Output(String text) {
    new Day(text);
    new Month(text);
    new Year(text);
    new Hour(text);
    new Minute(text);
  }
}