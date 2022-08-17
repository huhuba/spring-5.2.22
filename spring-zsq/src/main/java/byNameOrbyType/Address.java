package byNameOrbyType;


public class Address {
    public   String  name;
    public  String  location;

    public Address(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
