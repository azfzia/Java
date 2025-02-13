// adding sum.

public class ArraySum{

    public static void main(String[] args) {

        int A [][] ={{1,2,3},
                     {2,3,5},
                     {3,5,5}};

        int B [][] = {{3,3,5},
                      {3,3,5},
                      {3,5,3}};

        //new matrix from the above

        int C [][] = new int [3][3];


        for(int i =0; i<A.length; i++){

            for(int j=0; j<A[i].length; j++){


                C[i][j] = A[i][j]+B[i][j];
                
            }
        }

         


        for (int i=0; i<C.length; i++){

            for(int j=0; j<C[i].length; j++){

                System.out.print(C[i][j]);
            }


            System.out.println();

        }


        

    }


}