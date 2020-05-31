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
// interface project {
//     double revenue();
//     double total_tax();
//}
public class Public_class implements Interface_Project {

    public String _project;
    public double estimated_revenue;
    public double tax;

    public Public_class() {
    }

    public Public_class(String _project, double estimated_revenue, double tax) {
        this._project = _project;
        this.estimated_revenue = estimated_revenue;
        this.tax = tax;
    }

    @Override
    public double revenue() {
        return estimated_revenue * 0.9;
    }

    @Override
    public double total_tax() {
        return tax;
    }

}
