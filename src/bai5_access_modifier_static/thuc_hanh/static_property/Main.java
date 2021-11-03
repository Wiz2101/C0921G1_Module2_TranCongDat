package bai5_access_modifier_static.thuc_hanh.static_property;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "V8 Turbo");
        Car car2 = new Car("McLaren", "V12 SuperCharge");
        System.out.println(Car.numberOfCars);
        System.out.println(Car.numberOfCars);
    }
}
