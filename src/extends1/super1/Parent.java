package extends1.super1;

public class Parent {
    public String value = "parent";

    public void hello(){
        System.out.println("Parent.hello");
    }
}
/*
 * super
 * 부모와 자식의 필드명이 같거나 메서드가 오버라이딩 되어 있으면, 자식에서 부모의 필드나 메서드를 호출할 수 없다
 * 이때 super 키워드를 사용하면 부모를 참조할 수 있다
 */
