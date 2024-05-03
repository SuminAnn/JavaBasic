package poly.ex5;

public interface InterfaceAnimal {
    double MY_PI = 3.14;
    void sound();
    void move();
    
}
/*
 * 인터페이스
 *  class가 아니라 interface 키워드를 사용한다
 *  메서드에 public abstract를 생략 가능 -> 상속 받는 곳에서 모든 메서드를 오버라이딩 해야 한다
 *  다중 구현(다중 상속)을 지원한다
 *  멤버 변수는 public, static, final이 모두 포함되었다고 간주, 한마디로 상수라 한다
 * 
 * 자바8에 등장한 default 메서드를 사용하면 인터페이스도 메서드를 구현할 수 있다. 단 예외적으로 아주 특별한 경우에만 사용해야 한다
 */
