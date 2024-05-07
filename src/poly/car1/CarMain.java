package poly.car1;

public class CarMain {

    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.dirve();

        //차량 변경(k3 -> model3)
        Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.dirve();

        //차량 변경(model3 -> newCar)
        Car newCar = new NewCar();
        driver.setCar(newCar);
        driver.dirve();
    }
}
