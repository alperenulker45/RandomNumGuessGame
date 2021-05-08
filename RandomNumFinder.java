package _1_;

import java.util.Scanner;

public class RandomNumFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("You have 5 rights. \nEnter the number range from 0 to? : ");
        int numRange = sc.nextInt();
        playRandomNumGame(numRange);

    }

    public static void playRandomNumGame(int numRange) {

        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random() * numRange + 1);
        int count = 5;
        int guess;

        do {
            System.out.println("Guess Random Num : ");
            guess = sc.nextInt();
            count--;

            if (guess < randomNum && count != 0) {
                System.out.println("Think bigger");
                System.out.println("You have " + count + " rights left");

            } else if (guess > randomNum && count != 0) {
                System.out.println("Think smaller");
                System.out.println("You have " + count + " rights left");

            } else if (guess == randomNum) {
                System.out.println("Congratulations, You won!!!");
                break;
            }

        } while (count > 0);

        if (guess != randomNum && count == 0) {
            System.out.println("Your rights are over. You lost!!!");
            System.out.println("Random Num is " + randomNum);
        }
    }
}
