package poly.ex2;

public class AnimalSoundMain {
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();


        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
/*
 * 이 코드의 핵심은 Animal animal 부분이다
 * 다형적 참조 덕분에 animal 변수는 자식인 Dog, Cat, Cow의 인스턴스를 참조할 수 있다
 * 메서드 오버라이딩 덕분에 animal.sound()를 호출해도 각 인스턴스의 메서드를 호출할 수 있다
 * 
 * 현재 코드의 문제점은
 *  1. Animal 클래스를 생성할 수 있는 문제
 *  2. sound()를 Override를 하지 않는 가능성
 * -> 추상 클래스와 추상 메서드를 사용하면 이 문제를 해결할 수 있다
 */
