package construct;

public class MemberContruct {
    String name;
    int age;
    int grade;

    //추가(생성자 오버로딩)
    MemberContruct(String name, int age){
        this(name, age, 50); // 중복 변경 this()를 통해서 자신의 생성자를 호출할 수 있다, 생성자 첫출에서만 가능하다
        //this.name = name;
        //this.age = age;
        //this.grade = 50;
    }

    MemberContruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
/*
 * 생성자의 이름은 클래스 이름과 같아야 한다
 * 생성자는 반환 타입이 없다
 * 
 * 장점
 * 중복 호출 제거
 * 객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 만드시 호출해야 한다 -> 필수 값들은 생성자로 많이 받는다
 */