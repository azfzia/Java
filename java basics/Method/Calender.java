
import java.util.Scanner;



public class Calender{
        public static void  main(String args[]){

            //We need to create a calendar /
            //default days. rows.
            //>>user input 1. year  2. month.
            //Now the year is leap year.
            // month is 30 or 31 or 28 or 29.
            // week starting  day and front space.
            //month starting  date and  end day .
           // think the uml diagram 
                // create all necessary methods 

            Scanner sc = new Scanner( System.in);

            System.out.println("Enter month as number between 1 and 12 : ");
            int month = sc.nextInt();

            System.out.println("Enter the full year e.g : 2012");
            int year = sc.nextInt();

            

            printMonth(year, month);


        }

        public static void printMonth(int year, int month ){
                // heading of calender
           printMonthTitle(year, month);

               // body of calender
           printMonthBody(year, month);

            
        }

        public static void printMonthTitle(int year , int month ){

            System.out.println("           " + getMonthName(month)
            + " " + year);
            
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        }

        public static String getMonthName(int month){

            String monthName ;

            monthName = switch (month) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "";
            };
            return monthName;

        }

        public static void printMonthBody(int year, int month) {
            // first day of the month
            int startDay = getStartDay(year, month);
            //get number of days in the month

            int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

            // int i = 0; // Removed redundant variable declaration
            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }

            for (int day = 1; day <= numberOfDaysInMonth; day++) {
                System.out.printf("%4d", day);

                if ((day + startDay) % 7 == 0)
                    System.out.println();
            }
            
            System.out.println();
        }
        

        public static int getStartDay(int year , int month){
            final int START_DAY_FOR_JANUARY_1_1800 = 3;

            int totalNumberOfDays = getTotalNumberOfDays(year,  month);


            return (totalNumberOfDays + START_DAY_FOR_JANUARY_1_1800)% 7;

        }

        public static int getTotalNumberOfDays(int year, int month){
            int total = 0;
            // get total day from 1800 to 1/1 / yaer
            for(int i =1800; i<year; i++){
                if(isLeapYear(i)){
                    total = total + 366;
                }
                else{
                    total = total + 365;
                }

            }

            for(int i = 1; i< month; i++){
                total = total + getNumberOfDaysInMonth(year, i);
              
            }
            return total;
        }

        // Get the number of days in a month
        public static int getNumberOfDaysInMonth(int year, int month) {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> isLeapYear(year) ? 29 : 28;
                default -> 0; // if month is incorrect
            };
        }

        

        public static Boolean isLeapYear(int year){
            return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
                
            

            
        }



    



}




