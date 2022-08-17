package MyInterface;

import com.alibaba.druid.pool.vendor.SybaseExceptionSorter;

public class TestImpl implements  IA,IB{
    @Override
    public void printA() {
        System.out.println("TestImpl.printA");
    }

    @Override
    public void printB() {
        System.out.println("TestImpl.printB");
    }
    public  void printTest(){
        System.out.println("TestImpl.printTest");
    }

    public static void main(String[] args) {
        TestImpl test = new TestImpl();
        test.printTest();
        ((IA)test).printA();
        ((IB)test).printB();
    }
}
class   TestImplSub  extends   TestImpl{
    public void printTestImplSub(){
        System.out.println("TestImplSub.printTestImplSub");
    }


}