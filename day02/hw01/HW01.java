/*
 * 과제: 객체 0,0,0
 * 기능 : - - -
 * 어떤 객체 <-> 어떤 객체
 * A 객체 -> B 객체 사용(메소드 호출)
 */

package day02.hw01;

public class HW01 {
    public static void main(String[] args) {
        // 사람 생성
        Person sonny = new Person("쏘니", "한국");
        Person baeckam = new Person("베컴", "영국");

        // 핸드폰 생성
        SamsungPhone galaxy21 = new SamsungPhone("galaxy21", "Samsung", "한국");
        ApplePhone iphone15 = new ApplePhone("iphone15", "Apple", "미국");

        // 상점 생성
        Store kt = new Store();

        // 상점에 핸드폰 추가
        kt.addPhone(galaxy21, 1);
        kt.addPhone(iphone15, 1);

        // 상점 핸드폰 리스트
        // kt.printPhoneList();

        // 핸드폰 구매
        sonny.buyPhone(galaxy21);
        kt.removePhone(galaxy21, 1);
        baeckam.buyPhone(iphone15);
        kt.removePhone(iphone15,1);

        // 핸드폰 키기
        sonny.turnOnPhone();

        // 핸드폰 키기
        baeckam.turnOnPhone();

        // 상점 핸드폰 리스트
        // kt.printPhoneList();
    }
}





