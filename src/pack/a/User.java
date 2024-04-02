package pack.a;

public class User {
    public User(){
        System.out.println("패키지 pack.a 회원 생성");
    }
}
/*
 * 생성자에 public을 사용하면 다른 패키지에서 이 클래스의 생성자를 호출 가능하다
 */