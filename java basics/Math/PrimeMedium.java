//author @ ahmad fatah.

// write a programm that will find first 5 prime number .

public class PrimeMedium{
    public static void main(String args[]){

        // create programm to call number and check it throug method and
        // count the prime number ;
        //then print the prime number;
        int count = 0 ; // counting the prime number;
        int number = 2 ; // number which will increase;

        // now creating a loop that will run sequence of "number "
        // and call the isPrime method then print the Prime
        // untill count = 5 ;
        while(count < 5){        
            //checking number value through method
            if(isPrime(number)){
                // if true then print number.
                System.out.println(number);
                // then increase the counter for searching another prime.
                count++;

            }
            //increasing number until satisfying counter range.
            number++;
        }
        
     


    }

    //create a method that find prime number

    public static boolean isPrime(int n){

        if (n <= 1){
            return false;
        }
        for (int i=2 ; i <= Math.sqrt(n); i++){
            // keep in mind number's divisibility is checking by i ;
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
