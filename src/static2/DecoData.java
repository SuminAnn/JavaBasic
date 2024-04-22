package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근

        //instanceValue++; 인스턴스 변수 접근, compile error
        //instanceMethod(); 인스턴스 메서드 접근, compile error
    }

    public void instanceCall(){
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
    
}
/*
 * 정적 메서드 사용법
 *  static 메서드는 static만 사용할 수 있다
 *   클래스 내부의 기능을 사용할 때, 정적 메서드는 static이 붙은 정적 메서드나 정적 변수만 사용할 수 있다
 *   클래스 내부의 기능을 사용할 때, 정적 메서드는 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다
 *  반대로 모든 곳에서 static을 호출할 수 있다
 *   정적 메서드는 공용 기능이다 따라서 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 static을 호출할 수 있다
 */