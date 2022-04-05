/**
 * Created by MAHA on 04/04/2022.
 */
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {

    public static String check_Ticket(Date d) throws ParseException
    {
        String type="";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        if(d.before(sdf.parse("9:30"))||(d.after(sdf.parse("16:00")))&&d.before(sdf.parse("19:31")))
            type="full";
        else
            type="saver";



        return type;
    }
  //  public static void main(String[] args) {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
//
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(dtf.format(now));
//        LocalTime myObj = LocalTime.of(9,30);
//        LocalTime mObj = LocalTime.of(8,30);
//
//        System.out.println(myObj);
//        Calendar now = new GregorianCalendar();
//        String am_pm;
//        int hour = now.get(Calendar.HOUR);
//        int minute = now.get(Calendar.MINUTE);
//        if (now.get(Calendar.AM_PM) == 0){
//            am_pm = "AM";
//        }
//        else{
//            am_pm = "PM";
//        }
//        String time = hour + ":" + minute + " " + am_pm;
//        String Scan_hour = "1:00 PM";
//        String Scan_hr = "7:45 PM";
//        System.out.println(time + " " + Scan_hour);
//
//        if (time.equals(Scan_hour)){
//            System.out.println("Time matchs");
//        }
//        else{
//            System.out.println("Time Doesn't Match");
//        }



  }

