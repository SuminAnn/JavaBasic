package static2;

public class DecoUtil2 {
    
    public static String deco(String str){
        String result = "*" + str + "*";
        return result;
    }
}
/*
 * deco() 메서드 앞에 static이 붙어있다. 이를 정적 메서드라 한다
 * 이 정적 메서드는 인스턴스 생성 없이 호출 가능하다
 * 
 * 클래스 메서드 : static이 붙은 메서드
 *   정적 메서드 혹은 클래스 메서드라 한다
 *   인스턴스 생성 없이 클래스를 통해 호출 가능하다
 * 
 * 인스턴스 메서드 : static이 붙지 않은 메서드
 *   인스턴스를 생성해야 호출 가능하다
 */
