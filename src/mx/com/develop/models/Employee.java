package mx.com.develop.models;

import java.util.Date;

/**
 * Clase que contiene el modelo de un empleado
 * para la empresa Develop del sistema de 
 * HumanResource
 * @author danielorlandoharolozano
 * @see <a href="http://www.develop.com.mx">Link</a>
 * @since 1.4 JDK.
 * @version 0.1
 */
public class Employee{
    //Atributos, campos, Variables de instacias
    // 4 modificadores
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private double salary;
    private java.util.Date hireDate;
    private Department department;
    private Job job;

    public Employee(String firstName, String lastName, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
    }
    
    //Metodos, acciones, comportamientos
    //4 modificadores
    /**
     * Metodo que imprime una descripcion de los atributos de la clase empleado.
     */
    public void getDetails(){
        System.out.println("Id: "+id);
        System.out.println("First Name: " +firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Age: "+age);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Salary: "+salary);
        System.out.println("Hire Date: "+hireDate);
        System.out.println("Department: "+department);
        System.out.println("Job: "+job);
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age >65) {
            System.out.println("Edad no valida");
        } else {
            this.age = age;
        }
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@ucol.mx") && !"@ucol.mx".equals(email)) {
                this.email = email;            
        } else {
            this.email = "Not e-mail found";
        }
        
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public java.util.Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(java.util.Date hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}