/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online3AboutInterface;

/**
 *
 * @author shari
 */
public class PrivateClassContainer {

    private class InnerClass implements Interface_Project {

        private String project_;
        private double estimated_revenue;
        private double tax;

        private InnerClass() {
        }

        private InnerClass(String project_, double estimated_revenue, double tax) {
            this.project_ = project_;
            this.estimated_revenue = estimated_revenue;
            this.tax = tax;
        }

        @Override
        public double revenue() {
            return estimated_revenue * 0.8;
        }

        @Override
        public double total_tax() {
            return tax * 1.1;
        }
    }
    
    public static void main(String[] args){
        Public_class public_class = new Public_class("project_",100.50, 0.5);
        System.out.println(public_class.revenue());
        System.out.println(public_class.total_tax());
        
//       As InnerClass is private so i can not acceess it from the outside of the class.
    }
}
