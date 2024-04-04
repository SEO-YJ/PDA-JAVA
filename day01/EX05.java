// 실행용 클래스
public class EX05 {
    public static void main(String[] args) {
//        new Product();
        Computer a = new Computer(10, 20);
        System.out.println(a);
        System.out.println(a.cpu);
        System.out.println(a.memory);


    }
}

// 상품 클래스
// 객체를 만들기 위한 클래스
class Product {
    // 생략 - 이걸로 어떻게 객체를 만들 수 있는지
    // 생성자 = 클래스로 객체를 만들 수 있는 방법
    Product() {

    }
}

// 컴퓨터 클래스
class Computer {
    int cpu;
    int memory;
    Computer(int cpu, int memory) {
        this.cpu = cpu;
        this.memory = memory;
    }
}