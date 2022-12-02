import java.util.Scanner;


public class Spheroid {
    public static void main(String[] args) {
        System.out.print("Enter equatorial radius in km: ");

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();

        System.out.print("Enter polar radius in km: ");


        double c = input.nextDouble();

        double e = Math.sqrt(1-(c*c)/(a*a));

        double Volume = (4 * Math.PI * (a*a) * c) /3;

        System.out.printf("Eccentricity = %.3f\n", e);
        System.out.printf("Volume = %.6g cubic km", Volume);
    }
}
