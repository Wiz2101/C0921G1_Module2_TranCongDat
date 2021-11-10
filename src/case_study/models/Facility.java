package case_study.models;

public abstract class Facility {
    private String serviceName;
    private double usableArea;
    private int rentalCost;
    private int maxCapacity;
    private String rentalType;

    public Facility(String serviceName, double usableArea, int rentalCost, int maxCapacity, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxCapacity = maxCapacity;
        this.rentalType = rentalType;
    }
}
