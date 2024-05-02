package poly.ex2;

public class AnimalSoundMain3 {
    
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
/*
 * 여기서 잘 보면 새로운 동물이 추가되었을 때 코드가 변하는 부분과 변하지 않는 부분이 있다
 * main()은 코드가 변하는 부분이다 새로운 동물을 생성하고 필요한 메서드를 호출하낟
 * soundAnimal()은 코드가 변하지 않는 부분이다
 * 
 * 새로운 기능이 추가되었을 때 변하는 부분을 최소화 하는것이 잘 작성된 코드이다
 * 이렇게 하기 위해서는 코드에서 변하는 부분과 변하지 않는 부분을 명확하게 구분하는 것이 좋다
 */
