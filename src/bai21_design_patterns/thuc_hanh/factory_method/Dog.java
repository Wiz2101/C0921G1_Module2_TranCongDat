package bai21_design_patterns.thuc_hanh.factory_method;

public class Dog extends Animals {

    @Override
    public String makeSound() {
        return "Woof";
    }
}
