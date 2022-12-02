import java.util.Scanner;


public class Weight {
    public static void main(String[] args) {
        System.out.print("Enter weight in kilograms:");

        Scanner input = new Scanner(System.in);
        double Kg = input.nextDouble();


        double Ounces = Kg * 35.274;
//        double Truncated_Ounces = Math.floor(Ounces * 100) / 100;
        double pounds = Math.floor(Ounces/16);
        double Remaing_Ounces = Ounces - (16 * pounds);

        System.out.print("Equivalent imperial weight is " + String.format("%.0f", pounds) + " lb " + String.format("%.1f",Remaing_Ounces) + " oz");



    }
}
