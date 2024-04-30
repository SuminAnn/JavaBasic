package poly.basic;

public class CastingMain5 {
    
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent){
        if(parent instanceof Child){
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
 */