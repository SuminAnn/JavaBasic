package final1;

public class Constant {
    
    //수학 상수
    public static final double PI = 3.14;

    //시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_DAY = 60;
    public static final int SECONDS_IN_DAY = 60;

    //애플리케이션 설정 상수
    public static final int MAX_USERS = 1000;
}
/*
 * 상수 : 변하지 않고 항상 일정한 값을 갖는 수
 * static final을 사용한다
 * 일반적으로 변수와 상수를 구분하기 위해 대문자를 사용하고 구분은 _로 한다
 * 상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적이다
 * 필드를 직접 접근해서 사용한다 -> 직접 접근해도 값을 변경할 수 없기 때문에 문제가 발생하지 않는다 
 * 
 * 보통 이런 상수들은 전반에서 사용되기 때문에 public을 자주 사용한다
 * 중앙에서 값을 하나로 관리할 수 있다는 장점도 있다
 * 
 */