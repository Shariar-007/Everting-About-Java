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
public class SubString {

    private int insex_1;
    private int insex_2;

// int index_1, index_2;
    public void subString() {
        String str;
        String final_string = "";
        String sub_string = "apple";
        System.out.print("Enter a Line: ");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        if (isEmpty(str)) {
            System.out.println("String can not be Emply");
        }

        int count = countMatches(str, sub_string);
//        System.out.println(count);
        if (count < 2) {
            System.out.println("Not Applicable.");
        } else {
            final_string = str.substring(insex_1, insex_2);
            System.out.println(final_string);
        }
    }

    public boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public int countMatches(String str, String sub_string) {
        if (isEmpty(str) || isEmpty(sub_string)) {
            return 0;
        }

        int index = 0, count = 0;
        while (true) {
            index = str.indexOf(sub_string, index);
            if (index != -1) {
                count++;
                if (count == 1) {
                    this.insex_1 = index + sub_string.length();
                }
                if (count == 2) {
                    this.insex_2 = index;
                }
                index += sub_string.length();
            } else {
                break;
            }
        }

        return count;
    }
}
