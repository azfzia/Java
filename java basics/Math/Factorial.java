// author @ ahmad fatah.
// find the factorial of 5; 5! = 5*4*3*2*1 = 120
public class Factorial{

    public static void main(String[] args) {
        int factorial = 1;
        for(int i = 5; i >=1 ; i--){
            factorial = factorial * i;
              
        }
        System.out.println(factorial);
    }
}