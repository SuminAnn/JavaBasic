package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
/*
 * 
 * this는 인스턴스 자신을 의미한다
 * 지역 변수에 없는 경우에 멤버 변수에 접근
 * 지역 변수와 멤버 변수 명이 동일한 경우에 this를 사용한다
 * 생성자 : 객체를 생성하는 시점에 어떤 작업을 하고싶은 경우에 이용
 */
