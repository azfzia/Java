
import java.util.Scanner;

public class TernaryPass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Type the marks : ");
        int marks = sc.nextInt();

        String reportCard = marks >= 33 ? "Pass" : "Fail";

        System.out.println(reportCard); 
    }
}