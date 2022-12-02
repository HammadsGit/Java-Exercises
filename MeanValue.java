import java.util.Arrays;
import java.util.List;

public class MeanValue {
    public static double meanValue(double[] data) {
        double sum = 0;
        for(double i: data){
            sum += i;
        }
        double length = data.length;

        return sum / data.length;



    }

    public static void main(String[] args) {

        if(args.length == 0){
            System.err.print("Usage: java MeanValue <values...>");
            System.exit(1);
        }
        else if(args.length > 0) {
            double[] data = new double[args.length];
            for (int i = 0; i < args.length; i++) {
                data[i] = Double.parseDouble(args[i]);
            };

            double meanvalue = meanValue(data);
            System.out.printf("Mean value = %.3f", meanvalue);



        }


        }
    }

