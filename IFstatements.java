import java.util.Scanner;

public class IFstatements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter from a to c");

        String user_input = input.nextLine();

        if (user_input.equals("a")){
            System.out.println("apple");
        }

        else if (user_input.equals("b")){
            System.out.println("bus");
        }

        else if (user_input.equals("c")){
            System.out.println("car");
        }

        else {
            System.out.println("wrong input");
        }
    }
}
