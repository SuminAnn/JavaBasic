package extends1.overriding;

public class Car {
    
    public void move(){
        System.out.println("차를 이동합니다");
    }

    //추가
    public void openDoor(){
        System.out.println("문을 엽니다");
    }
}
/*
 * 메서드 오버라이딩(Overriding) : 부모 타입의 기능을 자식에서 다르게 재정의 하는것
 * @Override를 사용하는 이유는 부모 클래스와 다른 명의 메서드를 사용하는 경우 compile 오류를 낸다(실수 방지를 위해, 코드의 명확성을 위해)
 * 
 * 오버로딩(Overloading) VS 오버라이딩(Overriding)
 * 오버로딩 : 메서드 이름이 같고 파라미터가 다른 메서드를 여러개 정의
 * 오버라이딩 : 하위 클래스에서 상위 클래스의 메서드를 재정의, 상속 관계에서 사용
 * 
 * 메서드 오버라이딩 조건
 *  - 메서드 이름이 같아야 한다
 *  - 메서드 매개변수(파라미터) 타입, 순서, 개수가 같아야 한다
 *  - 반환타입이 같아야 한다. 단 하위 클래스 타입일 수 있다
 *  - 접근 제어자는 상위 클래스의 메서드보다 더 제한적 일 수 없다(ex 상위 클래스가 protected이면 하위 클래서는 public, protected)
 *  - 상위 클래스의 메서드보다 더 많은 예외를 선언할 수 없다
 *  - static, final, private 키워드가 붙은 메서드는 오버라이딩 될 수 없다
 *    - static은 클래스 레벨에서 작동하므로
 *    - final은 재정의를 금지한다
 *    - private는 해당 클래스에서만 접근 가능하기 때문
 *  - 생성자는 오버라이딩 할 수 없다
 */
