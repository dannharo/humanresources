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
        Location lMexico = new Location();
        lMexico.city = "Colima";
        lMexico.country = "Mexico";
        lMexico.id=6;
        lMexico.streetAddress = "Av. Universidad, #333 Col. las viboras";
        Department dIT = new Department();
        dIT.id = 1;
        dIT.name = "Tecnologias de la Informacion";
        dIT.location = lMexico;
        
        System.out.println("Calle de departamenteo de TI: "+dIT.location.streetAddress);
        
        Job jProgrammer=new Job();
        jProgrammer.id = 77;
        jProgrammer.title = "Programmer";
        jProgrammer.minSalary = 6_000.00;
        jProgrammer.maxSalary = 20_000.00;
        
        Employee e1 = new Employee();
        e1.id = 70;
        e1.firstName = "Ernesto Noe";
        e1.lastName = "Martinez Orozco";
        e1.age = 30;
        e1.email = "noe@ucol.com.mx";
        e1.department = dIT;
        e1.hireDate = new Date();
        e1.phoneNumber = "312-344-5678";
        e1.job =jProgrammer;
        e1.salary = 25_000;
        
        System.out.println("Pais: "+e1.department.location.country);
        System.out.println("Maximo Salario: "+e1.job.maxSalary);
        System.out.println("Edad: "+e1.age);
        
        
        
        
        
    }
    
}
