package day02.hw01;

class Person {
    String name;
    String country;
    Phone phone;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Person(String name, String country, Phone phone) {
        this.name = name;
        this.country = country;
        this.phone = phone;
    }

    void buyPhone(Phone phone) {
        System.out.println(String.format("%s가 핸드폰을 샀습니다.", name));
        setPhone(phone);
    }

    void turnOnPhone() {
        if(country == "한국"){
            System.out.println("야 내 핸드폰 켜볼게");
        } else if (country == "영국") {
            System.out.println("turn on");
        }
        phone.turnOn();
    }

    void setPhone(Phone phone) {
        this.phone = phone;
    }
}
