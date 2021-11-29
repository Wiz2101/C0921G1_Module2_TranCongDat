package case_study.models;

import java.util.Objects;

public class House extends Facility {
    private String roomStandard;
    private int floor;

    public House() {
    }

    public House(String serviceID, String serviceName, double usableArea, int rentalCost, int maxCapacity, String rentalType, String roomStandard, int floor) {
        super(serviceID, serviceName, usableArea, rentalCost, maxCapacity, rentalType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                ", roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floor == house.floor &&
                Objects.equals(roomStandard, house.roomStandard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomStandard, floor);
    }
}
