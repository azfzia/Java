
import java.security.SecureRandom;
import java.util.Random;

// author @ ahmad fatah.
// formula *** a + Math.random()* b -> return between a and a+b , excluding a a+b
// (int )Math.random()* 10 -> between 0 to 9;
/* some escape sequences. -> special characters.
\b Backspace \u0008 8
\t Tab \u0009 9
\n Linefeed \u000A 10
\f Formfeed \u000C 12
\r Carriage Return \u000D 13
\\ Backslash \u005C 92
\" Double Quote
*/

public class RandomBasic{
    public static void main (String args[]){

    System.out.println("Random number single digit " + Randem_single( ));
    System.out.println("Random number in range " + Random_range());
    char randomChar = Random_str();
    System.out.println("Random character: " + randomChar);
    System.out.println("Random character: " + Random_obb());
     Random_sec();

                        

    }

    // 1#this is random method . create a random number from 
    //a range. using Math.Random().
    public static int Randem_single(){

        // finding 10 random number
        int  b =10;
        // ***this (int)(Math.random() * number) creates random numbers for number
        // exam: for 10 it will create 0- 9 numbers .
        int c = (int)(Math.random()*b);

        return c;

    }

    //2#
    public static char Random_char(){

        // remembering char : how it works and means:



        return 'a';
    }
    //3#
     public static int Random_range(){

        // this return random number from 3 to 7 ** how => 3 + 5 = 8; exclude last digit .
        // 3 to 7
        //a + Math.random() * b
        /* that the book's language ->* Returns a random number between a
          and a + b, excluding a + b.
        */

        int c = 3 + (int)(Math.random() * 5);

        return c;

    }
    //4#
    public static char Random_str(){
        // Generate a random number between 0 (inclusive) and 1 (exclusive).
        double randomNumber = Math.random();
        // Multiply by 26 (number of letters in the alphabet) and add 'A' (ASCII value 65).
        // This gives a random number between 'A' and 'Z' (inclusive).
        // Cast to char to get the character representation.
        return (char) ('A' + (int) (randomNumber * 26));
    }


      
    

    //5#random class 

    public static char Random_obb(){

        /*
        'A' + (int) (randomNumber * 26): This adds the integer value 
        to the ASCII value of 'A' (which is 65), resulting in a value 
        between 65 ('A') and 90 ('Z').
        (char) ('A' + (int) (randomNumber * 26)):
         Finally, this casts the integer value to a char

        */

         Random random = new Random();
         return (char) ('A' + random.nextInt(26));


       

    }

    //6# random secure class
    public static void Random_sec(){

        SecureRandom secureRandom = new SecureRandom();

        // Generate a random integer within a specific range (e.g., 0 to 99)
        int randomInRange = secureRandom.nextInt(100);
        System.out.println("Random Integer in Range: " + randomInRange);

      
    }

    //#7 Helper method to convert byte array to hexadecimal string
    //8# hashing 

    //9#  creating encryption
    //10# extra for basic
}