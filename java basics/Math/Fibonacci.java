//Author @ ahmad fatah.

// first 5 fibonacci numbers are 0, 1, 1, 2, 3.

public class Fibonacci{
    public static void main(String args[]){
        //first declare two first fibonacci
        // we need two number to start the series 
        // because its the sum of last two numbers
        int first = 0;
        int second = 1;
        int n = 5;

        for(int i = 0 ; i <= n ; i++ ){
            // now printing the first term.args
            System.out.print(first);
            //creating formula for third term or after that 
            // we have arlready the value of second term
            
            int next_term = first + second;
            // as we have the value of second 
            // we move it to first for print because we are printing first
            
            first = second;

            // as we move second value to first so third one will goes to second
            // this way again second one will go to first one
            second = next_term;


        }
        System.out.println();

       
           
        

            


       

       

    }

    
}