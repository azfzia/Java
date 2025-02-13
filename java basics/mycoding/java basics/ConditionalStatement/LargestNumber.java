// largest three number
public class LargestNumber{
    public static void main(String[] args) {
        
    
    int A = 5;
    int B = 6;
    int C = 8;

    if (A > B && A > C){
        System.out.println("A is largest number");
    }
    // here A is false for while it indicates A is smaller than both B, C
    // Now comparison to B and C
    // so we do now between B , C

    else if (B > C){
          System.out.println("B is the largest number" + B);
    }
    // B is smaller than C and A is smaller than B,C. So.
    else
            System.out.println("C is the largest number:" + C);








    }

}