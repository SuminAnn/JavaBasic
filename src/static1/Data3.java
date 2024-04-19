package static1;

public class Data3 {
    public String name;
    public static int count;

    public Data3(String name){
        this.name = name;
        count++;
    }
}
/*
 * 객체가 생성되면 생성자에서 정적 변수 count의 값을 하나 증가시킨다
 * 
 * 인스턴스 변수 : static이 붙지 않은 멤버 변수 ex)name
 *   static이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다
 *   인스턴스 변수는 인스턴스 생성시 마다 새로 만들어진다
 * 클래스 변수 : static이 붙은 멤버 변수 ex)count
 *   클래스 변수, 정적 변수, static변수 등 다양한 용어로 사용한다
 *   static이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다
 *   클래스 변수는 자바 프로그램 시작할 때 딱 1개가 만들어진다
 * 
 * 지역 변수 : 스택 영역에 생성, 메서드 실행 시 생성, 메서드 종료 시 제거 
 * 인스턴스 변수 : 힙 영역에 생성, 인스턴스 생성 시 생성, GC 발생 시 제거
 * 클래스 변수 : 메서드 영역에 생성, JVM 로딩 시 생성, JVM 종료 시 제거
 */
