package mx.com.develop.models;

/**
 *
 * @author danielorlandoharolozano
 */
public class Department {
    public String name;
    public String manager;
    public String location;
    
    public void getDetails(){
        System.out.println("Name: "+name);
        System.out.println("Manager: "+manager);
        System.out.println("Location: "+location);
    }
}
