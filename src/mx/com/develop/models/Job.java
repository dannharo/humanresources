/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.models;

/**
 *
 * @author danielorlandoharolozano
 */
public class Job {
    public String tittle;
    public double maxSalary;
    public double minSalary;
    public void getDetails(){
        System.out.println("Tittle: "+tittle);
        System.out.println("Max Salary: "+maxSalary);
        System.out.println("Min Salary: "+minSalary);
    }
}
