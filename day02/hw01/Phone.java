package day02.hw01;

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
        System.out.println("bbeep");
    }
}