package memory;

public class JavaMemortMain1 {
    
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1){
        System.out.println("mehtod1 start");
        int cal = m1*2;
        method2(cal);
        System.out.println("mehtod1 end");
    }

    static void method2(int m2){
        System.out.println("mehtod2 start");
        System.out.println("mehtod2 end");
    }
}
/*
 * 자바 메모리 구조
 * 메서드영역, stack영역, heap영역
 * 
 * stack 영역
 *  - 처음 자바 프로그램을 실행하면 main() 실행한다. -> main() 스택 프레임은 내부에 args라는 매개변수를 가진다
 *  - main()는 method1()을 호출한다. method1() 스택 프레임이 생성된다 -> mehtod1()는 m1, cal 지역변수(매개변수 포함)들이 스택 프레임에 포함된다
 *  - method1()은 method2()를 호출한다 method2() 스택 프레임이 생성된다 -> mehtod2()는 m2 지역변수가 스택 프레임에 포함된다
 *  - method2()가 종료된다 -> method2() 스택 프레임이 제거되고 매개변수 m2도 제거된다 -> method1()로 돌아간다
 *  - method1()에서 method2()를 호출한 시점으로 돌아간다
 *  - method1()가 종료된다 -> method1() 스택 프레임이 제거되고 매개변수 m1, cal도 제거된다 -> main()로 돌아간다
 *  - main()이 종료된다 -> 더 이상 호출할 메서드가 없고, 스택 프레임도 완전히 비워졌다 자바는 프로그램을 정리하고 종료한다
 * 
 *  자바는 stack 영역을 사용해서 메서드 호출과 지역 변수를 관리한다 
 *  메서드를 호출하면 스택 프레임이 쌓인다
 *  스택 프레임이 종료되면 지역 변수도 제거된다
 *  스택 프레임이 모두 제거되면 프로그램도 종료된다 
 */