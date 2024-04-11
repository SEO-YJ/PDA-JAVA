package day06;

public class HyundaiCar implements Car{
    @Override
    public void goForward(int velocity) {
        System.out.print(String.format("%s의 속력으로 직진합니다", velocity));
        System.out.println("출발~~~~");
    }
}

class Driver {
//    HyundaiCar car;
//      BenzCar car;
    Car car;
    public void drive(int velocity) {
        car.goForward(velocity);
    }

    public void changeCar(Car car) {
        this.car = car;
    }
}
