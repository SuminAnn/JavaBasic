package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
/*
 * 다형성이 없는 경우의 문제점
 * 자동차가 늘어날수록 운전자의 코드를 계속 수정 및 추가를 해줘야한다
 */
