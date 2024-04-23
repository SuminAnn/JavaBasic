package final1;

public class FinalRefMain {
    
    public static void main(String[] args) {
        final Data data = new Data();

        //data = new Data(); 이미 참조값이 있기 때문에 참조값은 변경 불가

        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
/*
 * 참조형 변수에 final이 붙으면 참조값을 변경할 수 없지 인스턴스에 필드값은 변경 가능하다
 */
