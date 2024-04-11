package day03;

public class EX03 {
    public static void main(String[] args) {
        // class Garden
        // getSound(동물) : 매개변수로 전달받은 `동물`
        // class Dog, Cat extends Pet
        // cry()

        Dog dog = new Dog();
        Cat cat = new Cat();

        Garden garden = new Garden();
        garden.getSound(dog);
        garden.getSound(cat);
    }
}

class Garden {
    void getSound(Pet pet) {
//        if (pet instanceof Dog) {
//            System.out.println("멍멍");
//        } else if (pet instanceof Cat) {
//            System.out.println("냐옹");
//        }
        // 이렇게 하면 Pet에 추가되는 동물이 생길경우 조건을 또 달아줘야 한다.

        pet.cry();
    }
}

abstract class Pet {
    abstract void cry();
}

class Dog extends Pet {
    @Override
    void cry() {
        System.out.println("멍멍");
    }

    int hi() {
        return 1;
    }

    int hi(int a) {
        return a;
    }

//    double hi() {
//        return 1.1;
//    }
}

class Cat extends Pet {
    @Override
    void cry() {
        System.out.println("냐옹");
    }
}