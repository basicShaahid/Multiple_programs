import java.util.Scanner;

public class problem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int input_user = input.nextInt();

        if (input_user % 5==0){
            System.out.println("HiFive");
        }

        else if (input_user % 2==0){
            System.out.println("HiEven");
        }

    }
}
