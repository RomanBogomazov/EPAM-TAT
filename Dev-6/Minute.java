import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Minute
{
  Calendar date = new GregorianCalendar();
  NameOfMonth nom = new NameOfMonth();

  Minute(String text) {

    if(text.equals("m")) System.out.println(date.get(Calendar.MINUTE));
    else if(text.equals("mm")) {
      if(date.get(Calendar.MINUTE) < 10)
        System.out.println("0" + date.get(Calendar.MINUTE));
      else System.out.println(date.get(Calendar.MINUTE));
    }
  }
}