/**
 * Name:  Melanie Johnson (johnsonm)
 * Course:  CSCI-241 - Computer Science I
 * Section: 002
 * Assignment: 9
 * 
 * Project/Class Description :
 * This project is used to create a clock that runs in a 24 - hour format. 
 * 
 * Known Bugs:  none.
 */

import java.util.*;
// This class is the ClockTime class. It is designed to take in hours, minutes, and seconds and formats the time. 
// It also compares two times and allows you to add seconds to the time as well. 
public class ClockTime
{
    private int hour;
    private int minute;
    private int second;

    // This is a constructor method that is designed to initialized the private variables to zero. 
    
    public ClockTime ()
    {
        hour = 0;
        minute = 0;
        second = 0;
    }

    // This constructor takes in hours, minutes, and seconds. It then sets the variables to those values. 
    // This constructor is also designed to take excessive seconds and turn them into minutes.
    // It does the same for minutes to hours as well. .
    
    public ClockTime (int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        if (second > 59) // If the seconds are over 60, it'll convert them to minutes and retain the left over seconds. 
        {
            minute += second / 60;
            second = second % 60;
        }
        else if (second < 0) // If seconds are entered as a negative number, it'll zero the value out. 
        {
            second = 0;
        }

        if (minute > 59) // If the minutes are over 60, it'll convert them to hours and retain the left over minutes.
        {
            hour += minute / 60;
            minute = minute % 60;
        }
        else if (minute < 0) // If minutes are entered as a negative number, it'll zero the value out. 
        {
            minute = 0;
        }

        if (hour > 24) //If the hours exceed 24, we need to use modulous that way the clock starts at 1 again. 
        {
            hour = hour % 24;
        }
        else if (hour < 0) // If hours are entered as a negative number, it'll zero the value out. 
        {
            hour = 0;
        }
    }

    // This method is used to retrieve the hour variable
    
    public int getHour() 
    {
        return hour;
    }

    // This method is used to retrieve the minutes variable
    
    public int getMinute()
    {
        return minute;
    }

    // This method is used to retrieve the seconds variable
    
    public int getSecond()
    {
        return second;
    }

    // This method is used to set the hour variable
    
    public void setHour(int hour)
    {
        this.hour = hour;

        if (hour > 24)
        {
            hour = hour % 24;
        }
        else if (hour < 0)
        {
            hour = 0;
        }
    }

    // This method is used to set the minutes variable
    
    public void setMinute(int minute)
    {
        this.minute = minute;

        if (minute > 59)
        {
            hour += minute / 60;
            minute = minute % 60;
        }
        else if (minute < 0)
        {
            minute = 0;
        }
    }

    // This method is used to set the seconds variable
    
    public void setSecond (int second)
    {
        this.second = second;

        if (second > 59)
        {
            minute += second / 60;
            second = second % 60;
        }
        else if (second < 0)
        {
            second = 0;
        }
    }

    // This method is used to create a two string method that will show the time in a 24 hour period.
    
    public String toString()
    {
        int h = getHour(); // h stands for hours
        int m = getMinute(); // m stands for minutes
        int s = getSecond(); // s stands for seconds
        String hr= new String(); // We are initializing a new string for hr, which stands for hours
        String min= new String(); // We are initializing a new string for min, which stands for minutes
        String sec= new String(); // We are initializing a new string for sec, which stands for seconds

        if (h < 10) // If there is a single digit number, a 0 will be added in front of it using this if statement
            hr = "0" + h;
        else
            hr = Integer.toString (h); // If the number is already 2 digits, this will allow two digits to be entered

        if (m < 10) // If there is a single digit number, a 0 will be added in front of it using this if statement
            min = "0" + m;
        else
            min = Integer.toString (m); // If the number is already 2 digits, this will allow two digits to be entered

        if (s < 10) // If there is a single digit number, a 0 will be added in front of it using this if statement
            sec = "0" + s;
        else
            sec = Integer.toString (s); // If the number is already 2 digits, this will allow two digits to be entered

        return hr + ":" + min + ":" + sec;
    }

    // This method is very similar to the method above except it converts the 24 hour time frame to a 12 hour time frame. 
    
    public String toString12()
    {
        int h2 = getHour(); // h2 stands for hours
        int m2 = getMinute(); // m2 stands for minutes
        int s2 = getSecond(); // s2 stands for seconds
        String hr= new String(); // string for hours
        String min= new String(); // string for minutes 
        String sec= new String(); // string for seconds
        String amOrPm = new String(); // String that determines AM or PM

        if (h2 > 12) // If the hours are more than 12 it'll be pm otherwise it's am
            amOrPm = "P.M";

        else
            amOrPm = "A.M";

        if (h2 > 12) // If the hours are larger than 12 you will use modulous 12 to have it start at 1 again
            h2 = h2 % 12;

        if (h2 < 10) // This will determine if a 0 needs to be added to the front or not
            hr = "0" + h2;
        else
            hr = Integer.toString (h2);

        if (m2 < 10) // This will determine if a 0 needs to be added to the front or not
            min = "0" + m2;
        else
            min = Integer.toString (m2);

        if (s2 < 10) // This will determine if a 0 needs to be added to the front or not
            sec = "0" + s2;
        else
            sec = Integer.toString (s2);

        return hr + ":" + min + ":" + sec + " " + amOrPm;
    }

    // This method is being use to add seconds to the time. It can then determine if the seconds need to be converted
    // to minutes and hours. 
    
    public void advance (int addedSec)
    {
        this.hour = getHour();
        this.minute = getMinute();
        this.second = getSecond();

        second = second + addedSec;

        // Once the seconds have been added, you will use the steps below to convert them to minutes and hours as needed. 
        if (second > 59)
        {
            minute += second / 60;
            second = second % 60;
        }
        else if (second < 0)
        {
            second = 0;
        }

        if (minute > 59)
        {
            hour += minute / 60;
            minute = minute % 60;
        }
        else if (minute < 0)
        {
            minute = 0;
        }

        if (hour > 24)
        {
            hour = hour % 24;
        }
        else if (hour < 0)
        {
            hour = 0;
        }
    }

    // This method compares two times to determine if they are equal or not
    
    public boolean equals (ClockTime clockA)
    {
        // We initialize the boolean to false to begin with. 
        boolean result = false;
        
        // We bring in the current time to have something to compare to. 
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
        // We will need to separate the time that is collected from the clock inputed by hours, minutes, and seconds
        
        int hourA = clockA.getHour();
        int minuteA = clockA.getMinute();
        int secondA = clockA.getSecond();
        
        // We will compare the original time to the time that was inputted to see if they are equal.

        if (hour == hourA && minute == minuteA && second == secondA)

        {
            result = true; 
        }
        return result;
    }
}