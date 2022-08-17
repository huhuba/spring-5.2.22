package circulardependency;

public class A {
    public  B  b;

    public A() {
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

	public    void   printA(){
		System.out.println("A.printA");
	}
}
