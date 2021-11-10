package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floor;

    public Villa(String serviceName, double usableArea, int rentalCost, int maxCapacity, String rentalType, String roomStandard, double poolArea, int floor) {
        super(serviceName, usableArea, rentalCost, maxCapacity, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floor = floor;
    }
}
