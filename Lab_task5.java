
package java_basic;


public class Lab_task5 {
    public static void main(String[] args) {
        int A = 5;
        int B = 6;
        int C = 7;
        int D = 8;

        // a. (A * B - C * D)
        int result_of_a = (A * B - C * D);
        System.out.println("Result of Equation a : " + result_of_a);

        // b. 2A - B + 3D
        int result_of_b = (2 * A) - B + (3 * D);
        System.out.println("Result of Equation b : " + result_of_b);

        // c. A^2 + B^2- C^2 + D^2
        int result_of_c = (A * A) + (B * B) - (C * C) + (D * D);
        System.out.println("Result of Equation c : " + result_of_c);

        // d. A^3 + B - C^2
        int result_of_d = (A * A * A) + B - (C * C);
        System.out.println("Result of Equation d : " + result_of_d);
    }
}

