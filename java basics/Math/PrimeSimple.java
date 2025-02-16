//author @ ahmad fatah.
// defination of prime number :
//a number is divided by itself or one only

// here efficient way is to think Math.sqrt(n)  ; n = number is prime.

// creating method to identify false .
// if false then it is prime  that's the logic.


public class PrimeSimple{
    public static void main (String args[]){

        System.out.println(isPrime1(6));


    }

    // creating a method for prime number in boolean

    public static boolean isPrime1(int n){
    
       if (n <= 1 ){
          return false;

        }
        

        else if ( n % 2 == 0){
            return false;

        }

        for ( int i = 2 ; i <= Math.sqrt(n); i++){

            if (n % i == 0){
                return  false;
            }
        }
        return true;
            



       
            
            
        
    }
}