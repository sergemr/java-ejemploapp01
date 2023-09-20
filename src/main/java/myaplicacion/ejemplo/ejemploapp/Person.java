package myaplicacion.ejemplo.ejemploapp;

public class Person {
    private String name;
    private String lastName;
    private String id;

    public Person() {
    }

    public Person(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    // Getter and Setter methods for name, lastName, and id

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
