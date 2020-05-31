/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalQUiz;

import java.io.BufferedReader;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author shari
 */
public class Problem_2 {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\shari\\Desktop\\Everting-About-Java\\Assignement\\src\\finalQUiz\\input.txt";
        String s, arr[];
        int count = 0, total_players = 0, jersey_number;
//        int hashKey = 101;
        HashMap<Integer, Player> map = new HashMap<Integer, Player>();
        Scanner in = new Scanner(System.in);

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((s = br.readLine()) != null) {
                if (count < 1) {
                    total_players = Integer.parseInt(s);
                } else if (count <= total_players && count > 0) {
                    arr = s.split(" ");
                    map.put(Integer.parseInt(arr[0]), new Player(Integer.parseInt(arr[0]), Double.parseDouble(arr[1]),
                            Integer.parseInt(arr[2]), arr[3]));
                }
                count++;
            }

            System.out.print("Enter a player’s jersey number: ");
            jersey_number = in.nextInt();
            System.out.println("Output => ");
            for (Map.Entry<Integer, Player> entry : map.entrySet()) {
                int key = entry.getKey();
                Player p = entry.getValue();
                if (jersey_number == p.jersey_number) {
                    System.out.println("Player’s Name: " + p.name);
                    System.out.println("Jersey Number: " + p.jersey_number);
                    System.out.println("Salary: " + p.salary);
                    System.out.println("Age: " + p.age);
                    break;
                }
//                System.out.println(p.jersey_number + " " + p.salary + " " + p.age + " " + p.name);
            }
            br.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
