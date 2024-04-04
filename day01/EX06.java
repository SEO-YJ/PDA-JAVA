public class EX06 {
    public static void main(String[] args) {
        Person songa = new Person("손가", 10);
        Person kelly = new Person("켈리", 11);
        Person jason = new Person("제이슨", 12);
        System.out.println(songa.name + songa.age);
        System.out.println(kelly.name + kelly.age);
        System.out.println(jason.name + jason.age);
    }
}

class Person {
    // 변수 (=부품)
    String name;
    int age ;
    Person(String name, int age) {
        /////////////////
        this.name = name;
        this.age = age;
    }
}