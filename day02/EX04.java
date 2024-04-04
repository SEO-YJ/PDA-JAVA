package day02;

// 상속
public class EX04 {
    public static void main(String[] args){
        Bus bus = new Bus();
        bus.ride();
        bus.getWheelNum();
        bus.ring();

        Taxi taxi = new Taxi();
        taxi.ride();
        taxi.getWheelNum();
        taxi.ring();
    }
}

// 부모 클래스는 자식 클래스의 공통된 특징!
// 자식부터 설계 하고, 부모 설계 쉽다!
class Car {
    int wheel = 4;
    void getWheelNum() {
        System.out.println(String.format("바퀴 수는 %d개 입니다.", wheel));
    }

    void ride() {
        System.out.println("ㅑㅗㅑㅗ");
    }

    void ring() {
        System.out.println("삐-");
    }
}

// 버스
// 택시
// 메소드 : 달린다 (버스 - 부릉부릉, 택시 - 빵빵)
class Bus extends Car {
    Bus() {
        super();
    }
    void ride() {
        System.out.println("부릉부릉");
    }
}

class Taxi extends Car {
    void ride() {
        System.out.println("부아앙");
    }
}