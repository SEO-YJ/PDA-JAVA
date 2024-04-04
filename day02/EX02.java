package day02;

public class EX02 {
    public static void main(String[] args) {
        /* 생성자 없이 넣는 방법
         * Coffee americano = new Coffee();
         * americano.price = 4500;
         * americano.temp = "ice";
         * americano.size = "tall";
         * 그러나, 위 방법은 좋지 않다.
         * 접근제어자와 관련된 이야기
         * ex> americano.price = 6000;
         * 위 방법은 문제가 있다.
         * Class 외부에서 클래스의 필드값을 변경할 수 있기 때문이다.
         *
         * 생성자에 매개변수가 없으면, JVM이 생성자를 자동을 만들어줌
         */

        /* setter는
         * 고민고민하다가 꼭 필요한 경우에만 만들자.
         * 습관처럼 만들면 꼭 질문 들어온다.
         */

//        Coffee americano = new Coffee(3000, "ice", "tall");
//        americano.getInfo();
//        americano.setPrice(6000);
//        americano.getInfo();

        Barista chunsik = new Barista("춘식");
        Coffee americano = new Coffee(5000, "ice", "tall");
        chunsik.getCoffeeInfo(americano);
        chunsik.makeCoffee();
    }
}

// 커피
// 필드 : 가격, 핫 or 아이스, 사이즈
// 메소드 : getInfo - sout(가격, 핫 or 아이스, 사이즈)

class Coffee {
    private int price;
    private String temp;
    private String size;

    Coffee(int price, String temp, String size) {
        this.price = price;
        this.temp = temp;
        this.size = size;
    }

    void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        }
        // 필드 값 설정 'set'
        // 변경할 값을 검증하는 용도로도 사용한다.
        // this.price = price;
    }

    void getInfo() {
        // 문자열 + 변수 + 문자열 인 경우 연산 속도가 더 느리기에 String.format을 사용하였습니다.
        System.out.println(String.format("이 커피의 가격은 %d, 온도는 %s, 크기는 %s입니다.", price, temp, size));
    }

    int getPrice() {
        return price;
    }
}

//
class Barista {
    // 필드
    String name; // 멤버 변수 = 필드

    Barista(String name) {
        this.name = name;
    }

    void getCoffeeInfo(Coffee coffee) {
        System.out.println(String.format("이 커피는 %d원 입니다", coffee.getPrice()));
   }

   void makeCoffee() {
        System.out.println("커피 여기 있습니다~");
    }
}