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
    private int id;
    private String title;
    private double maxSalary;
    private double minSalary;

    public Job(String title, double maxSalary, double minSalary) {
        this.title = title;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }
    
    public void getDetails(){
        System.out.println("id: "+id);
        System.out.println("Tittle: "+title);
        System.out.println("Max Salary: "+maxSalary);
        System.out.println("Min Salary: "+minSalary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }
}
