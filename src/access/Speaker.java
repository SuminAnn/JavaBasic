package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void up(){
        if(volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        }else{
            volume += 10;
            System.out.println("음량을 10 증가합니다");
        }
        
    }

    void down(){
        volume -= 10;
        System.out.println("음량을 10 감소합니다");
    }

    void show(){
        System.out.println("현재 스피커 볼륨 : " + volume);
    }
}
/*
 * 접근 제어자를 사용하면 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 허용하거나 제한할 수 있다
 * 접근 제어자가 없는 경우에는 멤버 필드에 직접 접근이 가능하기 때문에 up 메서드에서의 조건이 의미가 없어질 수 있다
 * 
 * 접근 제어자
 * private : 모든 외부 호출을 막는다
 * default : 같은 패키지 안에서 호출은 허용한다
 * protected : 같은 패키지안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다
 * public : 모든 외부 호출을 허용한다
 */
