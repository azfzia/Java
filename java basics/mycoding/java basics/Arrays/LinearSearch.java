

public class LinearSearch{

    public static int Linearf(int numbers[] , int key){

        for (int i = 0; i< numbers.length; i++){
            if (numbers[i] == key){

                return i;
            }
            
              
        }

        return -1;


        
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 9, 10};
        int key = 4;

        int index = Linearf(numbers, key);

        if (index == -1){
            System.out.println("not found");
        }else {
            System.out.println("key is at : " + index);

        }

       

    }
}