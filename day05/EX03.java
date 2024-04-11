package day05;

// 내부적으로 우리끼리만 사용할 코드
public class EX03 {
    int _quantity;
    int _itemPrice;
    int discountLevel;
    EX03(int _quantity, int _itemPrice, int discountLevel){
        this._itemPrice = _itemPrice;
        this._quantity = _quantity;
        this.discountLevel = discountLevel;
    }

    int getDiscountLevel() {
        return discountLevel;
    }

    double getDiscountedPrice(int basePrice, int discountLevel) {
        // discountLevel 스위치
        // 퍼센트율
        return basePrice * 0.8;
    }
    void method(){
        // 개발자도 많이 틀리는 문제
        // 정가 = 수량 * 물건가격

        // 지역 변수는 함수의 모든 부분에서 사용할 거 아니면 없어야 한다.
        // 딱 필요할 경우에만 메모리에 올릴려면 어떻게 해야할까?
        int basePrice = _quantity * _itemPrice;

        // 굳이 굳이 같은 클래스에 있는 변수를 getDiscountLevel 이라는 메서드로 호출하여 사용해야 할까?
        // 그냥 사용하면 되지.
        discountLevel = getDiscountLevel();

        // 같은 클래스에 있는데 굳이 굳이 여기서 매개 변수 전달해서 사용해야 할까?
        // 그냥 getDiscountedPrice 메서드 안에서 기능을 구현하면 안될까?
        double finalPrice = getDiscountedPrice(basePrice, discountLevel);
        System.out.println("최종 금액은 " + finalPrice + "달러 입니다.");
    }
    public static void main(String[] args) {

    }
}

