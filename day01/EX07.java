public class EX07 {
    public static void main(String[] args) {
        // 객체 생성 (브랜드)
        // 2개: 삼성, LG
        // 객체의 변수 (브랜드) 출력
        Notebook samsung = new Notebook("삼성");
        Notebook lg = new Notebook("LG");

        System.out.println(samsung.brandName);
        System.out.println(lg.brandName);

        // 자동 형변환
        byte a = 10;
        int b = a;
        System.out.println(b);

        // 수동 형변환
        int c = 128;
        byte d = (byte)c;
        System.out.println(d);

        long e = 2147483648L;
        int f = (int)e;
        System.out.println(f);
    }
}

// 노트북 클래스, 브랜드
class Notebook {
    String brandName;
    Notebook(String brandName) {
        this.brandName = brandName;
    }
}

