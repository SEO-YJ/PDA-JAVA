package day03;

public class EX04 {
    public static void main(String[] args) {
        // 레시피 - 슈퍼 : getInfo 이 레싶 00의 레싶
        // 파스타 레시피 - 자식 : makeSource
        // 스테이크 레시피 - 자식 : grill ~~
        Receipt pasta = new PastaReceipe("파스타");
        Receipt steak = new SteakReceipt("스테이크");

        pasta.getInfo();
        steak.getInfo();

//        pasta.makeSource();
//        steak.grill();
    }
}

abstract class Receipt {
    String name;

    Receipt(String name){
        this.name = name;
    }

    void getInfo() {
        System.out.println("이 레시피는 " + name + "쉐프님의 레시피입니다.");
    };
}

class PastaReceipe extends Receipt {
    // super(name);
    // 부모 클래스의 생성자
    PastaReceipe(String name) {
        super(name);
    }

    void makeSource() {
        System.out.println("파스타 소스 만들기");
    }
}

class SteakReceipt extends Receipt {
    SteakReceipt(String name) {
        super(name);
    }

    void grill() {
        System.out.println("스테이크 굽기");
    }
}