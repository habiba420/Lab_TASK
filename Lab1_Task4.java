
package java_basic;

import java.util.Scanner;

public class Lab1_Task4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
    double radius,area;
    System.out.print("Enter a radius:");
    radius = input.nextDouble();
    area = 3.1416* radius * radius;
    
    System.out.println("Area of circle is: "+String.format("%.2f", area));
  }
}
