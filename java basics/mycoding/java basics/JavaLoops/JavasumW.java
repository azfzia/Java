import java.util.Scanner;

public class JavasumW{

    public static void main(String[] args) {
        
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of range : ");

        int range = sc.nextInt();


        while (counter < range){

            System.out.println("he " + counter );
            counter++;

        }

        System.out.println("Total print ----"  + range);

        
    


    int n = 5;
        int sum = 0;
        
        while(counter <=n){

            sum = sum + counter;

            System.out.println(sum);
            counter++;


        }

        System.out.println("Total sum : " + sum);


     

        //print of first n natural numbers

        








    }



}