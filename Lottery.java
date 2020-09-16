import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        Random rand = new Random();

        int random_1 = rand.nextInt(9);
        int random_2 = rand.nextInt(9);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int first_guess = sc.nextInt();

        System.out.println("Enter your second number: ");
        int second_guess = sc.nextInt();




    }

}
