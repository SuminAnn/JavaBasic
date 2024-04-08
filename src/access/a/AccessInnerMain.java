package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출
        data.defaultField = 2;
        data.defaultMethod();
        
        //private 호출 불가
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess(); //innerAccess의 경우 public이기 때문에 접근 가능하고 이후에는 public 메서드 내부이기때문에 private도 호출이 가능하다
    }
   
}
