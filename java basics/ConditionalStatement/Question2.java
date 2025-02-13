// Author @ Ahmad Fatah
//question you have a fever if you have temperature above 100.
import java.util.Scanner;
public class Question2{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");

        double temp = sc.nextDouble();
        //double temp = 103.5;

        String fever = (temp>100)? "You have fever" : "You don't have fever";

        System.out.print(fever);

         





    }
}