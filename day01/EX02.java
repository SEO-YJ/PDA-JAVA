public class EX02 {
    public static void main(String[] args) {
        // num 변수의 값이 9면 "A"
        // 8이면 "B"
        // 7이면 "C"
        // 6이하면 "F"

        int num = 8;

        switch (num) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
                break;
        }

        int age = 27;

        switch (age) {
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39:
                System.out.println("30대 입니다.");
                break;
            case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
                System.out.println("20대 입니다.");
                break;
            case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                System.out.println("10대 입니다.");
                break;
            default:
                System.out.println("어린이입니다.");
        }
    }
}
