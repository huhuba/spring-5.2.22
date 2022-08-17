package byNameOrbyType;

public class Person2 {
    public  Address2  address2;

    public Person2() {
    }

    public Address2 getAddress2() {
        return address2;
    }

    public void setAddress2(Address2 address2) {
        this.address2 = address2;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "address2=" + address2 +
                '}';
    }
}
