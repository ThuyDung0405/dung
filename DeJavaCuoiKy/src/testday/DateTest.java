/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testday;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author arohigh
 */
public class DateTest
{
    DateTest(){}

    public String getDateOfWeekDay(int weekId, int year, int weekDay){

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.WEEK_OF_YEAR, weekId);
        cal.set(Calendar.DAY_OF_WEEK, weekDay);


        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println("date="+sdf.format(cal.getTime())); 

        return  sdf.format(cal.getTime());    
    }

    public static void main(String args[])
    {
      DateTest dt = new DateTest();
      for (int weekCount = 1; weekCount <= 53; weekCount++) {
        dt.getDateOfWeekDay(weekCount,2010,Calendar.THURSDAY);
      }
    }

}