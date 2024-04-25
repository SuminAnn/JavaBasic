package extends1.ex1;

public class CarMain {
    
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
/*
 * 전기차와 가솔린차는 자동차의 구체적인 개념이다
 * 자동차는 전기차와 가솔린차를 포함하는 추상적인 개념이다
 * 공통 기능으로 move가 있다
 * 이런 경우 상속 관계를 사용하는 것이 효과적이다
 */