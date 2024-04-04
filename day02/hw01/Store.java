package day02.hw01;

import java.util.HashMap;
import java.util.Map;

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