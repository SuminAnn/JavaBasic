package pack;

import pack.a.User;

public class PackageMain1 {
    
    public static void main(String[] args) {
        Data data = new Data();
        //pack.a.User user = new pack.a.User(); import 하지 않는 경우 패키지가 다른 경우에는 전체 경로를 포함해서 클래스를 적어주어야 한다
        User user = new User();
    }
}
/*
 * 코드 첫줄은 package를, 다음 줄에는 import를 사용할 수 있다
 */