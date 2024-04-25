package extends1.ex3;

public class Car {
    
    public void move(){
        System.out.println("차를 이동합니다");
    }

    //추가
    public void openDoor(){
        System.out.println("문을 엽니다");
    }
}
/*
 * 모든 차량에 문열기 기능을 추가할 때 상위 부모인 Car에 openDoor() 기능을 추가하면 된다
 * Car의 자식들은 해당 기능을 물려받게 된다, 상속 관계가 아니였다가 각각의 차량에 기능을 추가해야한다
 * 상속관계 덕분에 중복은 줄어들고, 편리하게 확장이 가능하다
 */
