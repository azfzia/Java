
public class InvHalfPyramid{

    public static void main(String[] args) {
        
        //creating inverted pyramid of number.

        int n = 6;


        for (int row = 1; row <=n ; row ++) {
            for(int col = 1; col <= n - row; col++){
                System.out.print(col);

            }
            System.out.println();
            
        }
    }
}