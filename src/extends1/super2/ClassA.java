package extends1.super2;

public class ClassA {
    
    public ClassA(){
        System.out.println("ClassA 생성자");
    }
}
/*
 * 상속 관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야 한다(생성자 첫줄에서 호출)
 * 부모의 생성자를 호출할 때는 super(...)를 사용하면 된다
 * 부모 클래스의 생성자가 기본 생성자인 경우에는 super()를 생략할 수 있다
 */
