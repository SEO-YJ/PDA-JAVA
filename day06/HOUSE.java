//package day06;
//
//abstract class House {
//    private String location;
//    private String address;
//    private String roof;
//    private Door door;
//
//    abstract Door getDoor();
//
//    abstract void setDoor(Door door);
//}
//
//interface Door {
//    void openDoor();
//    void closeDoor();
//}
//
//class RedRoofHouse extends House {
//    private Door door;
//    @Override
//    Door getDoor() {
//        return this.door;
//    }
//}