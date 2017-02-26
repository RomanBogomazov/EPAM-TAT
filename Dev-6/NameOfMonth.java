/** Class to chose name of day for output day on formats "ddd" and "dddd" of Day. */

class NameOfMonth
{
  String month = new String();

/** Method return short name of week day. */

  String getShort(int monthNumber) {
    switch(monthNumber) {
      case 0: month = "Jan";
              break;
      case 1: month = "Feb";
              break;
      case 2: month = "Mar";
              break;
      case 3: month = "Apr";
              break;
      case 4: month = "May";
              break;
      case 5: month = "Jun";
              break;
      case 6: month = "Jul";
              break;
      case 7: month = "Aug";
              break;
      case 8: month = "Sep";
              break;
      case 9: month = "Oct";
              break;
      case 10: month = "Nov";
              break;
      case 11: month = "Dec";
              break;
    }

    return month;
  }

/** Method return full name of week day. */

  String getFull(int monthNumber) {
    switch(monthNumber) {
      case 0: month = "January";
              break;
      case 1: month = "February";
              break;
      case 2: month = "March";
              break;
      case 3: month = "April";
              break;
      case 4: month = "May";
              break;
      case 5: month = "June";
              break;
      case 6: month = "July";
              break;
      case 7: month = "August";
              break;
      case 8: month = "September";
              break;
      case 9: month = "October";
              break;
      case 10: month = "November";
              break;
      case 11: month = "December";
              break;
    }

    return month;
  }
}