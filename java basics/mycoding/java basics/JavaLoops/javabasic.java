




public class javabasic {

                                             // creating factorial function .

    public static int factorial(int n){

        int fac = 1;
  
         for (int i=1; i<=n; i++){
            fac = fac*i;
        }

        return fac;
    }

                                                 // creating bionomial function.

    public static int bionomial(int n, int r){   // for ncr we need two argument values.

        int n_fac = factorial(n);                                         // nCr = n!/r!(n-r)!
        int r_fac = factorial(r);
        int n_r_fac = factorial(n-r);

        int ncr = n_fac/(r_fac * n_r_fac);

        return ncr;





    }

                                                //check number is prime or not 
                                                // helper functions
                                                //prime numbers are one divisible by itself and by 1

    public static boolean isPrime(int n){

        if (n ==2) {
            return true;
        }

        for(int i =2; i<=n-1; i++){

            if (n%2 == 0){
                return false;
            }
        }   return true;
    }



    public static void main(String[] args){


    // find the value of factoria 4

    //prime number basic call
        int n =2;

        System.out.println("The number " + n + " prime is " + isPrime(2));
        
    }
}