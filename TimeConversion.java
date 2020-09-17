package JavaAlgorithms;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        //split imput time by ":"
        String[] time=s.split(":");
        //check if last element contains PM or AM to modify final time accordingly
        if (time[time.length-1].contains("PM"))
        {
            //change P.M time to + 12 format if hour is not 12
            if(!time[0].equals("12"))
            {
                Integer hour=Integer.parseInt(time[0])+12;
                time[0]=hour.toString();
            }
           
        }
        else
        {
            //change A.M time to 00 hour if hour is 12
            if(time[0].equals("12"))
            {
                time[0]="00";
            }
        }

        //remove AM or PM from final time string

        String finalTime=String.join(":",time);
        if(finalTime.contains("AM"))
        {
            finalTime=finalTime.substring(0,finalTime.indexOf("AM"));
            return finalTime;
        }
        else
        {
            finalTime=finalTime.substring(0,finalTime.indexOf("PM"));
            return finalTime;
        }
        
    }
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Jay\\Desktop\\Selenium and Drivers\\text text.txt"));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
