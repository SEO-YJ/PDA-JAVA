package day02;

// 하나의 클래스에는 main method가 1개
public class EX01 {
    public static void main(String[] args) {
        Animal cow = new Animal("소오", "음메");
        System.out.println(cow.name);
        cow.cry();

        Animal dog = new Animal("뽀삐", "멍멍");
        System.out.println(dog.name);
        dog.cry();
    }
}

// 동물 클래스
// 필드
//      이름(생성자, 필드 활용)
// 메서드
//      울음소리(엉엉)

class Animal {
    String name;
    String sound;
    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    void cry() {
        System.out.println(sound);
    }

    /*
     * 메서드 형식
     *
     * 1. 접근 제어자가 있는 경우
     * 접근제어자 반환타입 동사() {
     *
     * }
     *
     * 2. 접근 제어자가 없는 경우
     * 반환타입 동사() {
     *
     * }
     *
     */
}