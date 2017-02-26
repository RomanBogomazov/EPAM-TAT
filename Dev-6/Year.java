import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/** Class to chose output of year. */

class Year
{
  Calendar date = new GregorianCalendar();
  NameOfMonth nom = new NameOfMonth();

/** Constructor only compare param of output and otput param. */

  Year(String text) {
    if(text.equals("y")) System.out.println(date.get(Calendar.YEAR) % 10);
    else if(text.equals("yy")) System.out.println(date.get(Calendar.YEAR) % 100);
    else if(text.equals("yyy")) System.out.println(date.get(Calendar.YEAR) % 1000);
    else if(text.equals("yyyy")) System.out.println(date.get(Calendar.YEAR) % 10000);
    else if(text.equals("yyyyy")) System.out.println("0" + date.get(Calendar.YEAR) % 10000);
  }
}