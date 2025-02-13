//Author @ ahmad fatah

//calculator in java


import java.util.Scanner;

public class Calculator{

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : " );

        String name = sc.nextLine();

        System.out.print("Enter the value of a : " );

        int a = sc.nextInt();

        System.out.print("Enter the value of b : ") ;

        int b = sc.nextInt();
 
        System.out.print("Enter the operator sign : ");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);
                break;
            case '%' : System.out.println(a%b);
                break;
            default: System.out.println("wrong operator");
            
        }

        System.out.println("This is : " + name + "'s Calculator");





    }
}