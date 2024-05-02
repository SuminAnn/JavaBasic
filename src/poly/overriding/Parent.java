package poly.overriding;

public class Parent {

    public String value = "parent";

    public void method(){
        System.out.println("Parent.method()");
    }
    
}
/*
 * 다형성을 이루는 또 하나의 중요한 핵심 이론은 바로 매서드 오버라이딩이다
 * 오버라이딩 된 메서드가 항상 우선권을 가진다
 * 자식에서도 오버라이딩 하고 손자에서도 같은 메서드를 오버라이딩을 하면 손자의 오버라이딩 메서드가 우선권을 가진다
 * 더 하위 자식의 오버라이딩 된 메서드가 우선권을 가진다
 * 
 * Parent, Child 모두 value라는 같은 멤버 변수를 가진다
 *  - 멤버 변수는 오버라이딩 되지 않는다
 * Parent, Child 모두 method()라는 같은 메서드를 가지고 있다 Child에서 메서드를 오버라이딩 했다
 *  - 메서드는 오버라이딩 된다
 * 
 * 다형적 참조 : 하나의 변수 타입으로 다양한 자식 인스턴스를 참조할 수 있는 기능
 * 메서드 오버라이딩 : 기존 기능을 하위 타입에서 새로운 기능으로 재정의
 */
