package case_study.models;

import java.util.Objects;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceID, String serviceName, double usableArea, int rentalCost, int maxCapacity, String rentalType, String freeService) {
        super(serviceID, serviceName, usableArea, rentalCost, maxCapacity, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                ", freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(freeService, room.freeService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeService);
    }
}

