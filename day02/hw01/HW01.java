package day02.hw01;

import java.util.HashMap;
import java.util.Map;

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
        kt.printPhoneList();

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
        kt.printPhoneList();
    }
}

class Person {
    String name;
    String country;
    Phone phone;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    void buyPhone(Phone phone) {
        System.out.println(String.format("%s가 핸드폰을 샀습니다.", name));
        setPhone(phone);
    }

    void turnOnPhone() {
        System.out.printf("%s: ", name);
        phone.turnOn();
    }

    void setPhone(Phone phone) {
        this.phone = phone;
    }
}

class Phone {
    String name;
    String brand;
    String country;

    public Phone(String name, String brand, String country) {
        this.name = name;
        this.brand = brand;
        this.country = country;
    }

    public String getName(){
        return name;
    }

    public void turnOn() {
    }
}


class SamsungPhone extends Phone {
    String name;
    String brand;
    String country;
    SamsungPhone(String name, String brand, String country) {
        super(name, brand, country);
    }

    public void turnOn(){
        System.out.println("야 내 핸드폰 켜볼게");
        System.out.println("삐비빅");
    }
}

class ApplePhone extends Phone{
    String name;
    String brand;
    String country;
    ApplePhone(String name, String brand, String country) {
        super(name, brand, country);
    }

    public void turnOn(){
        System.out.println("turn on");
        System.out.println("bbeep");
    }
}

class Store {
        // HashMap을 클래스의 필드로 선언
        private Map<Phone, Integer> phoneList;

        public Store() {
            // 필드를 초기화
            phoneList = new HashMap<>();
        }

        // 핸드폰 모델과 수량을 추가하는 메소드
        public void addPhone(Phone phone, int quantity) {
            // 이미 핸드폰 모델이 존재하는 경우, 수량을 더해준다.
            phoneList.put(phone, phoneList.getOrDefault(phone, 0) + quantity);
        }

        // 핸드폰 모델의 수량을 감소시키는 메소드
        public void removePhone(Phone phone, int quantity) {
            // 해당 모델이 존재하고, 수량이 충분한 경우에만 감소시킨다.
            if (phoneList.containsKey(phone) && phoneList.get(phone) >= quantity) {
                phoneList.put(phone, phoneList.get(phone) - quantity);
                // 수량이 0이 되면 항목을 제거한다.
                if (phoneList.get(phone) <= 0) {
                    phoneList.remove(phone);
                }
            } else {
                System.out.println("재고가 충분하지 않거나 모델이 존재하지 않습니다.");
            }
        }

        // 현재 핸드폰 모델과 수량을 반환하는 메소드
        public Map<Phone, Integer> getPhoneList() {
            return phoneList;
        }

        public void printPhoneList() {
            if (phoneList.isEmpty()){
                System.out.println("판매할 수 있는 핸드폰이 없습니다.");
                return;
            }
            for (Map.Entry<Phone, Integer> entry : phoneList.entrySet()) {
                Phone phone = entry.getKey();
                Integer quantity = entry.getValue();
                System.out.println("핸드폰 이름: " + phone.getName() + ", 수량: " + quantity);
            }
        }
}
