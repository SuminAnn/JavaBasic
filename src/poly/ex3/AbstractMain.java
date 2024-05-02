package poly.ex3;

public class AbstractMain {
    
    public static void main(String[] args) {
        //AbstractAnimal abstractAnimal = new AbstractAnimal(); 추상클래스 생성 불가
        AbstractAnimal[] animals = {new Dog(), new Cat(), new Cow()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
