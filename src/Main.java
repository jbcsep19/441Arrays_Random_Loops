import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // making a array(list) of strings with a size of 10 items and calling it words
        String[] words  = new String[10];
        //creating scanner class variable named input
        Scanner input = new Scanner(System.in);
        //declare variable called word
        String word;
        //going through the loop and taking a value and setting it in the array
        for(int i = 0; i < words.length; i++){
            System.out.println("Please enter word number " + (i) + ":");
            word = input.nextLine();
            words[i] = word;
        }
        //checking what is inside the array called words
        for(int i = 0; i < 10; i++){
            System.out.println(words[i]);
        }

        //creating a random class variable named random
        Random random = new Random();
        //creating a random number and storing it to randomNumber variable
        int randomNumber = random.nextInt(10);
        // print random number
        System.out.println(randomNumber);
        //print the value in words array at the index position of the randomNumber
        System.out.println(words[randomNumber]);

        // to do a while loop version
//        int i = 0;
//        while( i < words.length ){
//            System.out.println("Please enter word number " + (i+1) + ":");
//            word = input.nextLine();
//            words[i] = word;
//            i++;
//        }

    }
}
