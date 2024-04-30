package poly.basic;

public class CastingMain4 {
    
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child)parent1;
        child1.childMehtod();

        Parent parent2 = new Parent();
        Child chil2 = (Child)parent2; //런타임 오류 - ClassCastException
        chil2.childMehtod(); //실행 불가
    }
}
/*
 * 다운캐스팅은 잘못하면 심각한 런타임 오류가 발생할 수 있다
 * new Parent()로 부모 타입으로 객체를 생성하면 메모리 상에 자식 타입은 전혀 존재하지 않는다
 * 
 * 업캐스팅
 *  - 객체를 생성하면 해당 타입의 상위 부모 타입은 모두 함께 생성된다
 *  - 따라서 위로만 타입을 변경하는 업캐스팅은 메모리 상에 인스턴스가 모두 존재하기 때문에 안전하다
 * 
 * 다운캐스팅
 *  - 객체를 생성하면 부모 타입은 모두 함께 생성되지만 자식 타입은 생성되지 않는다
 *  - 인스턴스에 존재하지 않는 하위 타입으로 캐스팅하는 문제가 발생할 수 있다
 * 
 * 컴파일 오류 vs 런타임 오류
 * 컴파일 오류
 *  - 변수명 오타, 잘못된 클래스 이름 사용 등 자바 프로그램을 실행하기 전에 발생하는 오류
 *  - 이런 오류는 IDE에서 즉시 확인할 수 있기 때문에 안전하고 좋은 오류이다
 * 런타임 오류
 *  - 프로그램이 실행되고 있는 시점에 발생하는 오류
 *  - 매우 안좋은 오류이다 왜냐하면 보통 고객이 해당 프로그램을 실행하는 도중에 발생하기 때문
 * 
 */