import java.util.Scanner;

public class Tax_income_calculation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your income: ");

        int income = in.nextInt();

        Scanner in1 = new Scanner(System.in);
        System.out.println("What is your status: ");
        String status = in1.nextLine();

        if (status.equals("s") && (income <= 8350)) {//calculation for single

            double final_income = income - (income * 0.1);
            System.out.println(final_income);


        } else if (status.equals("mfj") || status.equals("qw") && income <= 16700) {

                double final_income = income - (income * 0.1);
                System.out.println(final_income);

            } else {

                if (status.equals("mfs") && income <= 8350) {

                    double final_income = income - (income * 0.1);
                    System.out.println(final_income);

                } else {

                    if (status.equals("hoh") && income <= 11950) {

                        double final_income = income - (income * 0.1);
                        System.out.println(final_income);

                    }else{
                        double final_income = income - (income * 0.15);
                        System.out.println(final_income);
                    }
                }
            }



        }

    }
