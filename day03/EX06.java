package day03;

public class EX06 {
    public static void main(String[] args) {
        // ApplePhone : 배터리 용량(정수) 100, isOn = True, isOn = False
        // charge() + 10
        // useKakaotalk() - 5
        // useYoutube() - 10
        // 배터리 용량 확인
        // turnOn
        // turnOff

        // Person => ApplePhone 모든 기능

        // SamsungPhone ApplePhone이랑 똑같은 기능
        Person son = new Person();
        ApplePhone iphone16 = new ApplePhone();
        son.buyPhone(iphone16);

        SamsungPhone galaxy2223 = new SamsungPhone();
        son.buyPhone(galaxy2223);
    }
}

class ApplePhone implements Phone {
    private final static int BATTERY_MAX_CAPA = 100; // 배터리 최대용량
    private int capacity = 70; // 배터리 현재 용량
    private boolean isOn = true;

    public boolean getIsOn() {
        return isOn;
    }


    public void charge() {
        if (capacity == BATTERY_MAX_CAPA) {
            System.out.println("100%입니다.");
            return;
        } else if (capacity == 95) {
            capacity += 5;
        } else {
            capacity += 10;
        }
        System.out.println(capacity + "%가 되었습니다.");
    }

    // 카톡 사용
    public void operateKakaotalk() {
        if (isOn) {
            capacity -= 5;
            if (capacity == 0) {
                turnOff();
            }
        }
    }

    // 유튜브 사용
    public void useYoutube() {
        if (isOn) {
            capacity -= 10;
            if (capacity == 0) {
                turnOff();
            }
        }
    }

    // 배터리 용량 확인
    public void checkCapacity() {
        System.out.println("배터리 용량은" + capacity);
    }

    // 핸드폰 키기: turn on
    public void turnOn() {
        if(!isOn) {
            System.out.println("휴대폰이 켜집니다.");
            isOn = true;
        } else {
            System.out.println("휴대폰이 이미 켜져 있습니다.");
        }
    }

    // 핸드폰 끄기: turn off
    public void turnOff() {
        if(isOn){
            System.out.println("휴대폰이 꺼집니다.");
            isOn = false;
        } else {
            System.out.println("휴대폰이 이미 꺼져 있습니다.");
        }
    }
}

class SamsungPhone implements Phone {
    private final static int BATTERY_MAX_CAPA = 100; // 배터리 최대용량
    private int capacity = 70; // 배터리 현재 용량
    private boolean isOn = true;

    public boolean getIsOn() {
        return isOn;
    }

    public void charge() {
        if (capacity == BATTERY_MAX_CAPA) {
            System.out.println("100%입니다.");
            return;
        } else if (capacity == 95) {
            capacity += 5;
        } else {
            capacity += 10;
        }
        System.out.println(capacity + "%가 되었습니다.");
    }

    // 카톡 사용
    public void operateKakaotalk() {
        if (isOn) {
            capacity -= 5;
            if (capacity == 0) {
                turnOff();
            }
        }
    }

    // 유튜브 사용
    public void useYoutube() {
        if (isOn) {
            capacity -= 10;
            if (capacity == 0) {
                turnOff();
            }
        }
    }

    // 배터리 용량 확인
    public void checkCapacity() {
        System.out.println("배터리 용량은" + capacity);
    }

    // 핸드폰 키기: turn on
    public void turnOn() {
        if(!isOn) {
            System.out.println("휴대폰이 켜집니다.");
            isOn = true;
        } else {
            System.out.println("휴대폰이 이미 켜져 있습니다.");
        }
    }

    // 핸드폰 끄기: turn off
    public void turnOff() {
        if(isOn){
            System.out.println("휴대폰이 꺼집니다.");
            isOn = false;
        } else {
            System.out.println("휴대폰이 이미 꺼져 있습니다.");
        }
    }
}

interface Phone {
    // 1. 구현체가 어떤 게 오든 받아줄 수 있게 타입형태로 제시하기 위함
    // => implements Phone
    // * 추상 클래스는 extends 공통 기능 상속, 규약 구현
    // * 인터페이스는 implements 공통 규약, 구현
    // 2. 구현체(객체)를 필요 = 구현체 사용 = 메소드를 호출 => 메소드 선언(명, 매개변수) 통일
    // * 인터페이스는 implements 공통 규약, 구현
    // * 추상 클래스

    boolean getIsOn();
    void charge();
    void operateKakaotalk();
    void useYoutube();
    void checkCapacity();
    void turnOff();
    void turnOn();
}

class Person {
    // charge()
    // useKakaotalk()
    String name;
    Phone phone;

    // buyPhone()
    void buyPhone(Phone phone) {
        this.phone = phone;
    }

    void chargePhone() {
        // 내가 가지고 있는 폰을 charge 한다.
        phone.charge();
    }

    void useKakaotalk() {
        // 켜져있으면,
        if(phone.getIsOn())
        // 카톡 쓰면됨
        phone.operateKakaotalk();
    }

    // 유튜브 사용
    void usePhoneYoutube() {
        phone.useYoutube();
    }

    // 배터리 용량 확인
    void getPhoneCapacity() {
        phone.checkCapacity();
    }

    // 핸드폰 키기: turn on
    void turnOnPhone() {
       phone.turnOn();
    }

    // 핸드폰 끄기: turn off
    void turnOffPhone() {
        phone.turnOff();
    }
}

/*
 * interface What {
 *     abstract void abstractMethod1();
 *     abstract void abstractMethod2();
 * }
 */


