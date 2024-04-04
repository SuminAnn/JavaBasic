package pack;

import pack.a.User;

public class PackageMain2 {
    
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
/*
 * 같은 이름의 클래스가 있다면 import는 둘중 하나만 할 수 있다. 
 * 이때 자주 사용하는 클래스를 import하고 나머지를 패키지를 포함한 전체 경로를 적어준다
 * 
 * 패키지 규칙
 * 패키지의 이름과 위치는 폴더(디렉토리) 위치와 같아야 한다
 * 패키지 이름은 모두 소문자를 사용한다
 * 패키지 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용한다 EX_ com.company.myapp
 */
