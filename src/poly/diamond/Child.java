package poly.diamond;

public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodB() {
        System.out.println("Child.methodB()");
    }

    @Override
    public void methodA() {
        System.out.println("Child.methodA()");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon()");
    }

}
/*
 * 인터페이스는 다중 구현 가능
 * methodCommon()의 경우 양쪽 인터페이스에 다 있지만 같은 메서드이므로 구현은 하나만 하면 된다
 */
