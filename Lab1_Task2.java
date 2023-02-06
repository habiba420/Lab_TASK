
package java_basic;

import java.util.Scanner;

public class Lab1_Task2 {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int num1,num2;
  System.out.println("Input the first number: ");
  num1 = input.nextInt();
  System.out.println("Input the second number: ");
  num2 = input.nextInt();
  int summation = num1 + num2;
  int subtraction = num1 - num2;
  int multiplication = num1 * num2;
  int division = num1 / num2;
 
  System.out.println("summation ="+summation+"\nsubtraction ="+subtraction+"\nmultiplication ="+multiplication+"\ndivision ="+division);
 }
}
