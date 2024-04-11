package day03;

public class EX02 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        parent1.method();

        Child child = new Child();
        child.method();
//        child.metod();

        // 이렇게는 언제쓰지?
//        Child1 child1 = new Child1();
//        Child2 child2 = new Child2();
//        function(child);
//        parent2.method();
////        parent2.metod();
//        // 별을 접는다는게 어떤 의미이지
//        // 부모 타입 변수 안에 자식 객체를 넣을 경우 별 바깥 부분의 기능은 접힌다.
//
//        Child child2 = (Child) parent2;
//        child2.metod();
        // 접혀있으니까 알아서 펴줘야 하는거 아니야?
//        Child child2 = parent2;

        System.out.println(child instanceof Child);
    }
}

//void function(Parent child) {
//    // ...
//}

// 부모 클래스
class Parent {
    void method() {
        System.out.println("부모 메소드");
    }
}

// 자식 클래스
class Child extends Parent {
    @Override
    void method() {
        System.out.println("자식 메소드");
    }

    void metod() {
        System.out.println("별이 펴졌다");
    }
}

// 어노테이션은 한 묶음에만 영향력을 끼친다.
// 1. 컴파일러에게 Syntax 에러를 잡을 수 있다.
