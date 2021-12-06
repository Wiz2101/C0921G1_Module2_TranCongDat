package case_study.models;

import java.util.Objects;

public abstract class Facility {
    private String serviceID;
    private String serviceName;
    private double usableArea;
    private int rentalCost;
    private int maxCapacity;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceID, String serviceName, double usableArea, int rentalCost, int maxCapacity, String rentalType) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxCapacity = maxCapacity;
        this.rentalType = rentalType;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "serviceID='" + serviceID + '\'' +
                        ", serviceName='" + serviceName + '\'' +
                        ", usableArea=" + usableArea +
                        ", rentalCost=" + rentalCost +
                        ", maxCapacity=" + maxCapacity +
                        ", rentalType='" + rentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return serviceID.equals(facility.serviceID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceID);
    }
}
