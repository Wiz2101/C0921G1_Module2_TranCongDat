package case_study.models;

public class House extends Facility{
    private String roomStandard;
    private int floor;

    public House(String serviceName, double usableArea, int rentalCost, int maxCapacity, String rentalType,String roomStandard, int floor) {
        super(serviceName,usableArea,rentalCost,maxCapacity,rentalType);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }
}
