/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.develop.tests;
import mx.com.develop.models.*;
import java.util.Date;

/**
 *
 * @author danielorlandoharolozano
 */
public class TestEmployee {
    public static void main(String[] args) {
        Location lMexico = new Location("Av. Universidad, #333 Col. las viboras", "Colima", "Colima", "Mexico");
        lMexico.setId(6);
        Department dIT = new Department("Tecnologias de la Informacion", lMexico);
        dIT.setId(1);
        
        System.out.println("Calle de departamenteo de TI: "+dIT.getLocation().getStreetAddress());
        
        Job jProgrammer=new Job("Programmer", 20_000, 6_000);
        jProgrammer.setId(77);
        
        Employee e1 = new Employee("Daniel Orlando", "Haro Lozano", new Date());
        e1.setId(70);
        e1.setAge(26);
        e1.setEmail("daniel_haro@ucol.mx");
        e1.setDepartment(dIT);
        e1.setPhoneNumber("312-344-5678");
        e1.setJob(jProgrammer);
        e1.setSalary(25_000);
        
        System.out.println("Pais: "+e1.getDepartment().getLocation().getCountry());
        System.out.println("Maximo Salario: "+e1.getJob().getMaxSalary());
        System.out.println("Edad: "+e1.getAge());
        System.out.println("email: "+e1.getEmail());
        
        
        
        
        
    }
    
}
