//Author @ ahmad fatah.
//write a java programm to input week number (1-7) and print day of the week nmae using 
//switch case
import java.util.Scanner;
public class Question3{
    public static void main(String [] args){

       // String week = ("Monday","Tuesday","Wednesday","Thursday","Friday","Satureday","Sunday");
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the week number :" );

        int weeknumber = sc.nextInt();





        switch(weeknumber){
            case 1: System.out.print("Monday");
                    break;
            case 2: System.out.print("Tuesday");
                    break;
            case 3: System.out.print("Wednesday");
                    break;
            case 4: System.out.print("Thursday");
                    break;
            case 5: System.out.print("Friday");
                    break;
            case 6: System.out.print("Saturday");
                    break;
            case 7: System.out.print("Sunday");
                    break;
            default: System.out.print("Wrong number ");
        }

        //System.out.print(weeknumber);
    }
}