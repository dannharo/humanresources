package mx.com.develop.models;

/**
 *
 * @author danielorlandoharolozano
 */
public class Department {
    public int id;
    public String name;
    public Employee manager;
    public Location location;
    
    public void getDetails(){
        System.out.println("id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Manager: "+manager);
        System.out.println("Location: "+location);
    }
}
