package memory;

public class JavaMemoryMain2 {
    
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("mehtod1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("mehtod1 end");
    }

    static void method2(Data data1) {
        System.out.println("mehtod2 start");
        System.out.println("data1.getValue : " + data1.getValue());
        System.out.println("mehtod2 end");
    }
}
/*
 * main() 실행 -> main() 스택 프레임 생성
 * main()에서 method1() 실행 -> method1() 스택 프레임 생성
 * method1()은 지역 변수로 Data data1을 가지고 있다. 이 지역 변수도 스택 프레임에 포함된다
 * method1()은 new Data(10)를 사용해서 힙 영역에 Data 인스턴스를 생성한다. 참조값을 data1에 보관한다
 * method1()은 method2()를 호출하면서 Data data1 매개변수에 data1 참조값을 넘긴다
 * method1()에 있는 data1과 method2()에 있는 data1 지역 변수는 둘다 같은 인스턴스를 참조한다
 * method2()가 종료된다 -> method2() 스택 프레임이 제거된다
 * method1()가 종료된다 -> method1() 스택 프레임이 제거된다
 * Data 인스턴스를 참조하는 곳이 더이상 없다 -> 이런 객체는 GC가 찾아서 메모리에서 제거한다
 * 
 * 지역변수는 스택영역에, 객체(인스턴스)는 힙 영역에 관리한다
 */
