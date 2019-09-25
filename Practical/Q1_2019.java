package Practical;
/*
 *  ALGORITHM:
 *  1. Start
 *  2. Take input from the user
 *  3. Check for all the conditions specified by the question
 *  4. Find the date according to the day input
 *  5. Display the result
 *  6. Find the new date according to the number of days to skip
 *  7. Display the result
 *  8. Stop
   */
import java.util.Scanner;
class Q1_2019{
    int dayNum, year, N;
    String date;
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String monthNames[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    boolean input(){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Day Number: ");
        dayNum = sc.nextInt();

        System.out.print ("Year: ");
        year = sc.nextInt();

        System.out.print ("Day After(N days): ");
        N = sc.nextInt();

        if (dayNum < 1 || dayNum > 366){
            System.out.print ("Day number out of range");
            return false;
        } else if ((! (Integer.toString(year).length() == 4)) ){
            System.out.println ("Invalid Year");
            return false;
        } else if (!(N >= 1 && N <= 100)) {
            System.out.println ("Date After (N Days) out of range");
            return false;
        } else {
            //Updating the days in february to 29 if it's a leap year
            if (year % 4 == 0)
                days[1] = 29;
            
            //Checking if the user has input day number 366 but not a leap year
            if ((dayNum == 366) && (year % 4 != 0)) {
                System.out.println ("Day 366 is only possible in a leap year");
                return false;
            }
            return true;
        }
    }

    void findDate() {
        int daysCounted = 0;

        for (int i = 0; i < 12; i++){
            daysCounted += days[i];
            
            if (daysCounted >= dayNum){
                date = (days[i] - (daysCounted - dayNum)) + "th";
                date += " " + monthNames[i] + ", "+year;
                break;
            }
        }
        
        System.out.println (date);
    }

    void findNewDayNum() {
        dayNum += N;
        if(dayNum > 365){//Update the year number if the 'days after' part exceeds the limit
            year++;
            dayNum -= 365;
        }
    }
    
    public static void main (String args[]){
        Q1_2019 obj = new Q1_2019();
        if (obj.input()){
            System.out.print("Date: ");
            obj.findDate();
            obj.findNewDayNum();
            System.out.print("Date after "+obj.N+" days: ");
            obj.findDate();
        }
    }
}