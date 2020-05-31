/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusAssignment;

import java.util.Scanner;

/**
 *
 * @author shari
 */
public class SubStringFrequency {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        String text = "AABCCAAADCBBAADBBC";
        System.out.print("Enter a String: ");
        String text = in.nextLine();

        System.out.print("Enter a Sub String: ");
        String str = in.nextLine();

        System.out.println("Output:");
        int count = countMatches(text, str);
        System.out.println(count);
    }

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static int countMatches(String text, String str) {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }

        int index = 0, count = 0;
        while (true) {
            index = text.indexOf(str, index);
            if (index != -1) {
                count++;
                index += str.length();
            } else {
                break;
            }
        }

        return count;
    }
}
