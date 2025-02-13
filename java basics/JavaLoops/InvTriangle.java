public class InvTriangle{


    public static void main(String[] args) {
        

        //inverted triangle
        int n = 5;

        for(int row = 1 ; row <= 5 ; row ++){

            
            for(int col = 1 ; col <= n-row ; col ++){
                System.out.print(" " );
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");


            }


           System.out.println();
        }
       // System.err.println("|");
    }


    
}