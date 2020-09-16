import java.util.Scanner;

public class Time_conversation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Type in the number of seconds: ");

        int total_seconds = in.nextInt();
        int minute = total_seconds/60;
        int seconds = total_seconds % 60;


        System.out.print(minute + ":" + seconds);
        System.out.print("\n");
    }
}
