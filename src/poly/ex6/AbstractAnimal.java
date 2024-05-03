package poly.ex6;

public abstract class AbstractAnimal {

    abstract void sound(); //추상
    void move(){
        System.out.println("동물이 이동합니다");
    } //상속 목적
}
