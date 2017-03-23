import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/** Class to chose output of month. */

class Month
{
  Calendar date = new GregorianCalendar();
  NameOfMonth nom = new NameOfMonth();

/** Constructor only compare param of output and otput param. */

  Month(String text) {

    if(text.equals("M")) System.out.println(date.get(Calendar.MONTH) + 1);
    else if(text.equals("MM")) {
      if(date.get(Calendar.MONTH) < 10)
        System.out.println("0" + (date.get(Calendar.MONTH) + 1));
      else System.out.println((date.get(Calendar.MONTH) + 1));
    }
    else if(text.equals("MMM")) System.out.println(nom.getShort(date.get(Calendar.MONTH)));
    else if(text.equals("MMMM")) System.out.println(nom.getFull(date.get(Calendar.MONTH)));
  }
}