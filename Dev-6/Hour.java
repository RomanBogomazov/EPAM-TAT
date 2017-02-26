import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Hour
{
  Calendar date = new GregorianCalendar();
  NameOfMonth nom = new NameOfMonth();

  Hour(String text) {

    if(text.equals("h")) System.out.println(date.get(Calendar.HOUR));
    else if(text.equals("hh")) {
      if(date.get(Calendar.HOUR) < 10)
        System.out.println("0" + date.get(Calendar.HOUR));
      else System.out.println(date.get(Calendar.HOUR));
    }
  }
}