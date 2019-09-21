package Practical;
//The following code was written by vibhas. Therefore, no algo. It is the soln of Q1 of 2019 practical paper
//<-----------------------------  DO NOT COPY THIS CODE. I repeat, DO NOT COPY THIS CODE! ---------------------------------------->
import java.util.Scanner;
class Q1_2019 {
    static int dayNumber, year, daysToSkip;
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String monthNames[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static String date;

    boolean input() {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Day Number: ");
        dayNumber = sc.nextInt();
        System.out.print ("Year: ");
        year = sc.nextInt();
        System.out.print ("Date After (N days): " );
        daysToSkip = sc.nextInt();

        if (!(dayNumber >= 1 && dayNumber <= 366 )) {
            System.out.println ("Day no. out of range");
            return false;
        } else if (! (Integer.toString(year).length() == 4)) {
            System.out.println ("Invalid Year");
            return false;
        } else if (!(daysToSkip >= 1 && daysToSkip <= 100)) {
            System.out.println ("Date After (N Days) out of range");
            return false;
        } else {
            //Updating the days in february to 29 if it's a leap year
            if (year % 4 == 0)
                days[1] = 29;
            
            //Checking if the user has input day number 366 but not a leap year
            if ((dayNumber == 366) && (year % 4 != 0)) {
                System.out.println ("Day 366 is only possible in a leap year");
                return false;
            }
            return true;
        }
    }

    void findDate(int day) {//num is the number of days to skip before printing the new date
        //int initiate, month = 0; PMOD

        /*if (D == "")
            initiate = 0;   
        else {
            initiate = Integer.parseInt(D.substring(0, D.indexOf(' ') - 2)); 

            for (int x = 0; x < 12; x++) {
                if (monthNames[x].equals(D.substring(D.indexOf(' ') + 1, D.lastIndexOf(' ') - 1))) {
                    month = x;
                    break;
                }
            }
            D = ""; 
        }*/
        int daysCounted = 0;
        String date = "";
        for (int x = 0; x < 12; x++) {
            daysCounted += days[x];
            if (daysCounted >= day) {
                //D = D + (num - (sum - num)) + "th"; PMOD
                date = (days[x] - (daysCounted - day)) + "th";
                //D += " " + monthNames[month] + year; PMOD
                date += " " + monthNames[x] + ", " + year;
                break;
            }
        }

        this.date = date;
    }

    public static void main (String[] ar) {
        Q1_2019 ob = new Q1_2019();
        if (ob.input()) {
            ob.findDate(dayNumber);
            System.out.println ("DATE: "+date);
            ob.findDate(dayNumber + daysToSkip);
            System.out.println ("Date After " + daysToSkip + " days: "+date); 
        }
    }
}