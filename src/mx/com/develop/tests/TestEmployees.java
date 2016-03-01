package mx.com.develop.tests;
import mx.com.develop.models.*;

public class TestEmployees {
    public static void main(String[] args){
        //Declaracion
        Employee e1; //v. referencia
        //Inicializacion
        e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = e2;
        e1 = e2;
        e1.firstName = "Daniel";
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println("First Name: "+e2.firstName);
        //System.out.println("Age: "+e1.age);
    }
}
