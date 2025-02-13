
public class ButterflyPattern {
    public static void main(String[] args) {

        int n = 5;

        for(int r =1; r <= n; r++){
            // printing star
            for(int c =1; c <= r ; c++ ){
                System.out.print("*");

            }
            // printing space;
            for(int c = 1; c <= 2*(n-r) ; c++){

                System.out.print(" ");
            }
            // printing star
            for(int c =1; c <= r ; c++ ){
                System.out.print("*");

            }

            System.out.println();


        }   
        // 2nd half
         for(int r=n; r>= 1; r--){

            // printing star

            for(int c =1; c <= r ; c++ ){
                System.out.print("*");

            }
            // printing space;

            for(int c = 1; c <= 2*(n-r) ; c++){

                System.out.print(" ");
            }
            // printing star

            for(int c =1; c <= r ; c++ ){
                System.out.print("*");

            }

            System.out.println();


        } 

  
    }
}