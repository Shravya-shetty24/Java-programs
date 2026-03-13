import java.util.Random;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int number=rand.nextInt(100)+1;
        int guess;
        int attempts=0;
        System.out.println("===Number Guessing Game===");
        System.out.println("guess a number between 1 to 100");
        do {
            System.out.println("enter your guess:");
            guess = sc.nextInt();
            attempts++;
            if (guess > number) {
                System.out.println("your guess is too high");
            } else if (guess < number) {
                System.out.println("your guess is too low");

            } else {
                System.out.println("your guess is correct");
            }
        }while(guess!=number);
        sc.close();
    }
}