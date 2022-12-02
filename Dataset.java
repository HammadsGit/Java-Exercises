import java.io.Console;
import java.io.File;
import java.net.FileNameMap;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.Scanner;

public class Dataset {



    private List<Double> data = new ArrayList<>();

    public Dataset(String File) throws IOException {
        Scanner input = new Scanner(Paths.get(File));

        while(input.hasNextDouble()){
            Double line = input.nextDouble();
            data.add(line);
        }
    }

    public Integer size(){
        int length = data.size();
        return length;
    }

    public double meanValue(){
        double sum = 0;

        if(data.size() == 0 || data.contains(null)){
            throw new ArithmeticException();
        }
        else{
            for(double eachVaule:data){
                sum += eachVaule;
            }
        }





        return (sum/ data.size());
    }
        







}
