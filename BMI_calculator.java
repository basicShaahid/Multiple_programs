import java.util.Scanner;

public class BMI_calculator {
//there is a problem here
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if (age >= 16 ){

            Scanner in1 = new Scanner(System.in);
            System.out.print("Enter your weight(kg): ");
            double weight = in1.nextDouble();
            System.out.print("Enter your height(m): ");
            double height = in1.nextDouble();

            double BMI = weight/((height)*(height));

            System.out.println("Your BMI is :" + BMI);

            if (BMI < 16){
                System.out.println("serious underweight");
            }
            else if (BMI < 18){
                System.out.println("underweight");
            }
            else if (BMI < 24){
                System.out.println("normal weight");
            }
            else if (BMI < 29){
                System.out.println("overweight");
            }
            else if (BMI <35){
                System.out.println("seriously overweight");
            }
            else {
                System.out.println("gravely overweight");
            }


        }
        else{

            System.out.println("You aren't eligible to review your BMI");

        }



    }

}
