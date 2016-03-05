package mx.com.develop.models;
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
    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public String phoneNumber;
    public double salary;
    public java.util.Date hireDate;
    public Department department;
    public Job job;
    
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
}