import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/** Class to chose output of day. */

class Day
{
  Calendar date = new GregorianCalendar();
  DayOfWeek dof = new DayOfWeek();

/** Constructor only compare param of output and otput param. */

  Day(String text) {

    if(text.equals("d")) {
      if(date.get(Calendar.DAY_OF_MONTH) < 10)
        System.out.println("0" + date.get(Calendar.DAY_OF_MONTH));
      else System.out.println(date.get(Calendar.DAY_OF_MONTH));
    }
    else if(text.equals("dd")) System.out.println(date.get(Calendar.DAY_OF_MONTH));
    else if(text.equals("ddd")) System.out.println(dof.getShort(date.get(Calendar.DAY_OF_WEEK)) + " " + date.get(Calendar.DAY_OF_MONTH));
    else if(text.equals("dddd")) System.out.println(dof.getFull(date.get(Calendar.DAY_OF_WEEK)) + " " + date.get(Calendar.DAY_OF_MONTH));
  }
}