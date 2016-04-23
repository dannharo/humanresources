package mx.com.develop.models;

/**
 *
 * @author danielorlandoharolozano
 */
public class Department {
    private int id;
    private String name;
    private Employee manager;
    private Location location;

    public Department(String name, Location location) {
        this.name = name;
        this.location = location;
    }
    
    public void getDetails(){
        System.out.println("id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Manager: "+manager);
        System.out.println("Location: "+location);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
