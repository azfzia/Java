// Author @ ahmad fatah
//finding the posetive number

import java.util.Scanner;


public class Question1{
    public static void main (String [] args) {

        // if nubmer is greater than 0 than posetive other wise negative.

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number : ");

        int number = sc.nextInt();


        String answer = (number >0) ? "Posetive" : "Negative";


        System.out.print(answer);





    }
}