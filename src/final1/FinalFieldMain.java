package final1;

public class FinalFieldMain {
    
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstruectInit construectInit1 = new ConstruectInit(10);
        ConstruectInit construectInit2 = new ConstruectInit(20);

        System.out.println(construectInit1.value);
        System.out.println(construectInit2.value);

        //final 필드 -필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
/*
 * ConstruectInit과 같이 생성자를 상용해서 final 필드를 초기화 하는 경우 각 필드에 다른 값을 할당할 수 있다. 대신 생성 이후에 변경은 불가
 * FieldInit과 같이 final 필들르 필드에서 초기화 하는 경우 모든 인스턴스가 같은 값을 가진다 결과적으로 메모리 낭비를 하게 된다
 * -> 이럴때 사용하기 좋은 것이 static 영역이다
 * static 영역은 단 하나만 존재하는 영역이다. 중복과 메모리 비효율 문제를 모두 해결할 수 있다
 */
