package final1;

public class FinalLocalMain {
    
    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; 컴파일 오류

        //final 지역 변수 2
        final int data2 = 10;
        //data2 = 20; 컴파일 오류

        mehtod(10);

    }

    static void mehtod(final int param){
        //param = 20; 컴파일 오류
    }
}
/*
 * 변수에 final 키워드가 붙으면 더는 값을 변경할 수 없다
 * final은 class, method를 포함한 여러 곳에 붙을 수 있다
 */
