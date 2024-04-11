package test;

abstract class House {
    private String wall = "House wall";
    private String roof = "House roof";
    private Door door;


    void setDoor(Door door) {
        this.door = door;
    }

    Door getDoor() {
        return door;
    }

    void openDoor() {
        System.out.println("Basic door opened");
    }

    void closeDoor() {
        System.out.println("Basic door closed");
    }
}

interface Door {
    void openDoor();
    void closeDoor();
}

class BasicHouse extends House {

}

class MyHouse extends House {
    @Override
    void openDoor() {
        getDoor().openDoor();
    }

    @Override
    void closeDoor() {
        getDoor().closeDoor();
    }
}

class myDoor implements Door {
    @Override
    public void openDoor() {
        System.out.println("My Door Opened");
    }

    @Override
    public void closeDoor() {
        System.out.println("My Door closed");
    }
}

public class Main {
    public static void main(String[] args) {
        House basicHouse = new BasicHouse();

        basicHouse.openDoor();
        basicHouse.closeDoor();

        House myHouse = new MyHouse();
        Door myDoor = new myDoor();

        myHouse.setDoor(myDoor);

        myHouse.openDoor();
        myHouse.closeDoor();
    }
}