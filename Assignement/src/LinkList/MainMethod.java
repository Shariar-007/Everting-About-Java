/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author shari
 */
public class MainMethod {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\shari\\Desktop\\Everting-About-Java\\Assignement\\src\\LinkList\\info.txt";
        String s, arr[];
        int count = 0, total_students = 0;
        LinkedList<Student> studentList = new LinkedList<Student>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((s = br.readLine()) != null) {
                if (count < 1) {
                    total_students = Integer.parseInt(s);
                } else if (count <= total_students && count > 0) {
                    arr = s.split(" ");
                    studentList.add(new Student(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                            (Double.parseDouble(arr[2]) + Double.parseDouble(arr[3]))));
                }
                count++;
            }
            Collections.sort(studentList);
            for (Student b : studentList) {
                System.out.println(b.id + " " + b.name + " " + b.physics_marks + " " + b.chemistry_marks + " " + b.total_marks);
            }
            br.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
