package poly.ex1;

public class AnimalSoundMain {
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
/*
 * 동물이 추가될때마다 중복이 증가한다
 * 배열과 for문 사용해서 중복을 제거하려고 해도 배열의 타입을 Dog, Cat, Cow 중에 하나로 지정해야 한다
 * 결과적으로 지금 상황에서는 해결 방법이 없다
 * 새로운 동물이 추가될 때 마다 더 많은 중복 코드를 작성해야 한다
 * 
 * 문제의 핵심은 바로 타입이 다르다는 점이다
 * 
 * 다형성의 핵심은 다형적 참조와 메서드 오버라이딩이다. 이 둘을 활용하면 Dog, Cat, Cow가 모두 같은 타입을 사용하고, 각자 자신의 메소드도 호출할 수 있다
 */
