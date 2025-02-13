public class  Square {

    public static void main(String[] args) {

        Square1(5,5);


    }


    public static void Square1(int r, int c){

        for(int row = 1; row <= r; row++ ){

            //System.out.print("row");
            for(int col = 1; col <= c ; col ++){


                    //System.out.print("col");
                if(row == 1 || row == 5 || col == 1 || col == 5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 

    }



        
        
    
}