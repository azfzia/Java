
import java.util.Scanner;

// Author @ ahmad fatah
// take a year from user input and print whether that is leap year or not

public class Question5{

        public static void main(String [] args){


            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the year : ");

            int year = sc.nextInt();

            if (year %4 == 0 ){

                if(year % 100 == 0){
                    
                    if(year % 400 == 0) {
                        System.out.print("Leap year " + year);
                    }
                    else
                        System.out.print("Not leap year : ");
                }
                else 
                    System.out.print("Not leap year :");
                
            }
            else 
                System.out.print("This is not leap year : " + year);





        }

}