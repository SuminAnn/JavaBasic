package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        //DefaultClass1 defaultClass1 = new DefaultClass1(); 다른 패키지기 떄문에 접근 불가능
        //DefaultClass2 defaultClass2 = new DefaultClass2(); 다른 패키지기 떄문에 접근 불가능
    }
}
