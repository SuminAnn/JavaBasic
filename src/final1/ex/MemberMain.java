package final1.ex;

public class MemberMain {
    
    public static void main(String[] args) {
        Member member = new Member("myID", "kim");
        member.print();
        member.changeData(null, "seo");
        member.print();
    }
}
/*
 * final은 유용한 제약이다 특정 변수의 값을 할당한 이후에 변경하지 않아야 한다면 final을 사용하자
 * 예를들어 고객의 id를 변경하면 큰 문제가 발생한다면 final로 선언하고 생성자로 값을 할당하자
 * 만약 실수로 어디선가 id값을 변경한다면 컴파일러가 문제를 찾아준다
 */
