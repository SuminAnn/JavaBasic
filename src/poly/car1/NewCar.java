package poly.car1;

public class NewCar implements Car{

    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine()");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine()");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator()");
    }

}
/*
 * OCP(Open-Closed principle)원칙
 * 좋은 객체 지향 설계 원칙 중 하나
 * Open for extension: 새로운 기능의 추가나 변경 사항이 생겼을 때, 기존 코드는 확장할 수 있어야 한다
 * Closed for modification: 기존의 코드는 수정되지 않아야 한다
 * 
 * 확장에는 열려있고 변경에는 닫혀 있다는 뜻
 * 기존 코드 수정 없이 새로운 기능을 추가할 수 있다는 의미
 * 클라이언트 코드를 변경 없이 확장할 수 있는
 * 다형성을 활용한
 * 
 * 전략패턴(Strategy Pattern)
 * 알고리즘을 클라이언트 코드의 변경 없이 쉽게 교체할 수 있다
 */
