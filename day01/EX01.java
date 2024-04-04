public class EX01 {
    //// 현직자도 틀리는 문제
    // 점수를 받는 변수
    // 점수가 87점
    // 90점 이상 : A
    // 80점 이상 : B
    // 70점 이상 : C
    // 나머지 : F

    // JAVA의 요소
    // Field
    // Method
    // Constructor

    // PSVM
    public static void main(String[] args) {
        int score = 87;

        if (score < 0 || score > 100) {
            System.out.println("점수를 다시 입력하세요");
        } else if(score <= 100 && score >= 90) {
            System.out.println("A");
        } else if(score < 90 && score >= 80) {
            System.out.println("B");
        } else if(score <80 && score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }

}
