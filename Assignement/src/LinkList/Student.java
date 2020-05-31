/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList;

/**
 *
 * @author shari
 */
public class Student implements Comparable<Student> {

    public int id;
    public String name;
    public double physics_marks;
    public double chemistry_marks;
    public double total_marks;

    Student() {
    }

    public Student(int id, String name, double physics_marks, double chemistry_marks) {
        this.id = id;
        this.name = name;
        this.physics_marks = physics_marks;
        this.chemistry_marks = chemistry_marks;
    }

    public Student(int id, String name, double physics_marks, double chemistry_marks, double total_marks) {
        this.id = id;
        this.name = name;
        this.physics_marks = physics_marks;
        this.chemistry_marks = chemistry_marks;
        this.total_marks = total_marks;
    }

    public int compareTo(Student st) {
        if (total_marks == st.total_marks) {
            return 0;
        } else if (total_marks < st.total_marks) {
            return 1;
        } else {
            return -1;
        }
    }
}
