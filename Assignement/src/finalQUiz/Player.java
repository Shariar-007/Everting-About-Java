/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalQUiz;

/**
 *
 * @author shari
 */
public class Player {

    int jersey_number;
    double salary;
    int age;
    String name;

    public Player(){}
    
    public Player(int jersey_number, double salary, int age, String name) {
        this.jersey_number = jersey_number;
        this.salary = salary;
        this.age = age;
        this.name = name;
    }
}
