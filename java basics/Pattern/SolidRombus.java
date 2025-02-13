

public class SolidRombus{
    public static void main(String[] args) {
        
        //creating Rombus
        
        int n = 5;
        
        for(int r = 1; r <=n ; r++){
            //space n-i
            for(int c = 1; c <= (n-r); c++){

                System.out.print(" ");

            }

            //Star 
            for (int c = 1 ; c <= n; c++){

                System.out.print("*");
            }
        System.out.println("");

        }
    }
}