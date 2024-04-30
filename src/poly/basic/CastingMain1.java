package poly.basic;

public class CastingMain1 {
   
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능은 호출할 수 없다 : 컴파일 오류
        //poly.childMehtod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMehtod();

    }
}
/*
 * poly.childMethod()를 호출하면 참조값을 사용해서 인스턴스를 찾는다
 * 인스턴스 안에서 사용할 타입을 찾아야 한다 poly는 Parent 타입이다
 * Parent는 최상위 부모이다 상속 관계는 부모로만 찾아서 올라갈 수 있다 childMehtod()는 자식 타입에 있으므로 호출할 수 없다 따라서 컴파일 오류 발생
 * 
 * 다운캐스팅
 * 호출하는 타입을 자식인 Child 타입으로 변경하면 인스턴스의 Child에 있는 childMethod()를 호출할 수 있다
 * 
 * 부모는 자식을 담을 수 있지만 자식은 부모를 담을 수 없다
 * Parent parent = new Child(); 부모는 자식을 담을 수 있다
 * Parent parent = child; 부모는 자식을 담을 수 있다
 * 
 * Child child = poly Parent poly변수 자식은 부모를 담을 수 없다
 * Child child = (Child) poly; 다운캐스팅
 * 
 * 실행 순서
 * Child chlid = (Child) poly; 다운캐스팅을 통해 부모타임을 자식 타입으로 변환한 다음에 대입 시도
 * Child child = (Child) x001; 참조값을 읽은 다음 자식 타입으로 지정
 * Child child = x001 최종결과
 * 
 * 캐스팅
 * 업캐스팅 : 부모 타입으로 변경
 * 다운캐스팅 : 자식 타입으로 변경
 */
