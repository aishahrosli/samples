package Weight_in_Mars;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class weight_calculator {
	
    public static void main(String[] args) throws Exception {
        calculateWeight();
    }
 
    private static void calculateWeight() throws Exception {
        System.out.print("Please enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        double weight = s.nextFloat();
      
        //Weight on Mars= (Weight on Earth/9.81m/s2) * 3.711m/s2.
        double a = (weight/9.81)*3.711;
         
        System.out.println("Your weight in mars is: " +a +" kg\n");
      
        Double[] array = {weight, a};


        List<Double> list = Arrays.asList(array);          
        System.out.println(list);
    }
}
 
 

