package poly.basic;

public class CastingMain5 {
    
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent){
        if(parent instanceof Child){ //Java 16부터는 parent instanceof Child child를 통해서 인스턴스가 맞는 경우 직접 다운캐스팅 하는 코드를 생략할 수 있다
            System.out.println("Child 인스턴스");
            Child child = (Child)parent;
            child.childMehtod();
        }else{
            System.out.println("Child 인스턴스 X");
        }
        
    }
}
/*
 * instanceof
 * 다형성에서 참조형 변수는 이름 그대로 다양한 자식을 대상으로 참조할 수 있다
 * 참조하는 대상이 다양하기 때문에 어떤 인스턴스를 참조하고 있는지 확인할때 사용
 * 
 * instanceof를 사용해서 다운캐스팅을 수행하기 전 원하는 타입으로 변경이 가능한지 확인 후 다운캐스팅 수행하는 것이 안전하다
 */