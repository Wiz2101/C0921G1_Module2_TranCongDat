package case_study.models;

public class Room extends Facility {
    private String freeService;

    public Room(String serviceName, double usableArea, int rentalCost, int maxCapacity, String rentalType, String freeService) {
        super(serviceName, usableArea, rentalCost, maxCapacity, rentalType);
        this.freeService = freeService;
    }
}

