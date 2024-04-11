package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2(); 
    }
}

class DefaultClass1{

}

class DefaultClass2{
    
}
/*
 * 클래스 레벨의 접근 제어자는 public, default만 사용할 수 있다
 * public클래스는 반드시 파일명과 같아햐한다
 * public클래스는 자바 파일에 하나만 등장할 수 있다
 * default클래스는 무한정 만들 수 있다
 */
