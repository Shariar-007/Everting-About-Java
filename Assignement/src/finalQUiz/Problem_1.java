/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalQUiz;

import java.util.Scanner;

/**
 *
 * @author shari
 */
public class Problem_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] array;
        int n, numbers_each_line_contains = 2;
        System.out.print("Enter The Value Of n: ");
        n = in.nextInt();

        System.out.println("Enter " + n + " Lines in Which Each Line Contains 2 Double Number Seperated By Space: ");
        array = new double[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < numbers_each_line_contains; j++) {
                array[i][j] = in.nextDouble();
            }
        }
        System.out.println("Output: ");
        for (int i = 0; i < n; i++) {
            if (array[i][1] == 0) {
                System.out.println("Division by Zero Error");
            } else {
                System.out.println(array[i][0] / array[i][1]);
            }

        }

    }
}
