package Weight_in_Mars;

import java.util.Scanner;

public class weight_calculator {
	
	  

    public static void main(String[] args) throws Exception {
        calculateWeight();
    }
 
    private static void calculateWeight() throws Exception {
        System.out.print("Please enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        double weight = s.nextFloat();
        
         
        // multiplication by 100*100 for cm to m conversion
        double bmi = (weight/9.81)*3.711;
         
        System.out.println("Your weight in mars is: "+bmi);
      
         
    }
}
 
 

