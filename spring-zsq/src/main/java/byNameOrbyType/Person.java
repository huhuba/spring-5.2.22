package byNameOrbyType;

public class Person {
    public  Address  address;

    public Person() {
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                '}';
    }
}
