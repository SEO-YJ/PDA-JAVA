package day05;

public class EX02 {
    // 블루투스(스피커) 마이크

    // 인터페이스 or 추상 클래스
    // -> 블루투스 스피커 : BGM(음악)
    // -> 마이크 : 노래를 부를 수 있음
    // class BluetoothMic
    // 마이크 역할도 하고, 블루투스 역할도 한다.
    // -> 음악도 나오고,
    // -> 노래도 부를 수 있고

    public static void main(String[] args) {
        BluetoothMic bluetoothMic = new BluetoothMic();
        bluetoothMic.bgm();
        bluetoothMic.sing();
    }
}
interface Bluetooth {
    void bgm();
}

interface Mic {
    void sing();
}

class BluetoothMic implements Bluetooth, Mic {
    @Override
    public void bgm() {
        System.out.println("doong doong doong~");
    }
    @Override
    public void sing() {
        System.out.println("ralralral~");
    }
}

