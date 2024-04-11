package day03;

public class EX01 {
    public static void main(String[] args) {
        // Cow, Chicken : cry() - "음메" "꼬끼오"
        // Farm: getSound() - cow, chicken .cry()
        // Animal : 상속 - 오버라이딩

        //        Farm farm = new Farm();
        //        Cow cow = new Cow();
        //        Chicken chicken = new Chicken();
        //
        //
        //        farm.getSound(cow);
        //        farm.getSound(chicken);

        // main은 무조건 실행되야 하는 메서드 이기에, 객체는 여기서만 생성되도록(결합도를 낮추자.)


        Cow cow = new Cow();
        Chicken chicken = new Chicken();
        Farm farm = new Farm(cow, chicken);

        farm.getSound();
    }
}

class Farm {
    Cow cow;
    Chicken chicken;
    Farm(Cow cow, Chicken chicken) {
        this.cow = cow;
        this.chicken = chicken;
    }
//    void getSound(Animal animal) {
//        animal.cry();
//    }

//    void getSound() {
//        Cow cow = new Cow();
//        Chicken chicken = new Chicken();
//        cow.cry();
//        chicken.cry();
//    }

    void getSound() {
        cow.cry();
        chicken.cry();
    }
}
class Animal {
    void cry() {
        System.out.println("hi");
        // Q. 여기에는 뭐를 넣는게 좋을까?
        // A. 넣어도 되고 안 넣어도 됨.
        // => 추상 메서드(중괄호까지 날려버려도됨)
        // => 꼭 하위 클래스에서 생성해야 한다는 강제성을 줄 수 있다.
    }
}

class Cow extends Animal {
    @Override
    void cry() {
        System.out.println("음메");
    }
}

class Chicken extends Animal {
    @Override
    void cry() {
        System.out.println("꼬끼오");
    }
}

// 상속 클래스 순서
// 1. 자식 클래스를 먼저 생성한다.
// 2. 공통된 기능을 가지는 것을 상위 클래스로 올린다.

// @Override 어노테이션의 역할
//