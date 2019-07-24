package newtest;
import java.util.*;

/**
 * Created by zhaojing on 2019-07-24.
 */
public class CalendarTest {

    public  static void main (String[] args){
        //constract d as current date
        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);

        //set d to start date of the month

        d.set(Calendar.DAY_OF_MONTH,1);
        int weekday = d.get(Calendar.DAY_OF_WEEK);

        //print heading
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        //indent first line of calendar

        for (int i = Calendar.SUNDAY;i<weekday; i++)
            System.out.print("    ");

        //print the final end if necessary
        do{
            //print day
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d",day);

            //march the current with *
            if (day == today)
                System.out.print("*");
            else
                System.out.print(" ");

            if(weekday == Calendar.SATURDAY)
                System.out.println();

            d.add(Calendar.DAY_OF_MONTH,1);
            weekday =  d.get(Calendar.DAY_OF_WEEK);
        }while(d.get(Calendar.MONTH) == month);

        if(weekday != Calendar.SUNDAY)
            System.out.println();


    }
}
