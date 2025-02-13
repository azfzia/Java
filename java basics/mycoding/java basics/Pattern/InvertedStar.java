

// author @ ahmad fatah

public class InvertedStar{

    public static void main(String[] args) {

        //making outter loop 
        int n = 6;
        for(int i =1; i<=n; i++){
        

            //printing space 
            for(int j =1; j<=(n-i); j++){

                System.out.print(" ");

            }
            //printing star
            for (int j=1; j<=(2*i -1); j++) {

                System.out.print("*");
                
            }
        System.out.println(); 
         
        }

         // printing next line
        //System.out.println();

        // second half of star
        // making outer loop.

        for(int i =n; i>=1; i--){
        

            //printing space 
            for(int j =1;j <=(n-i); j++){

                System.out.print(" ");

            }
            //printing star/
            // keep in mind row 1 and column number are not equal.'
            
            for (int j=1; j<=(2*i -1); j++) {

                System.out.print("*");
                
            }
        System.out.println(); 
         
        }



    }
}