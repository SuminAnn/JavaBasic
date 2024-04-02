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
 */
