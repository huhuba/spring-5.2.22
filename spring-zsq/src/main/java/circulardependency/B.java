package circulardependency;

public class B {
    public  A a;

    public B() {
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
