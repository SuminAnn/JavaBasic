package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        //추가
        //인스턴스를 통한 접근(권장하지 않는다 -> 클래스 변수인지 인스턴스 변수인지 오해가 생길 수 있기 때문)
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        //클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
/*
 * static은 클래스에 직접 접근하는 것 처럼 느껴진다(ex Data3.count)
 * static이 붙은 멤버 변수는 메서드 영역에서 관리한다
 */
