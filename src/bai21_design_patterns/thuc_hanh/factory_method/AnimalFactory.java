package bai21_design_patterns.thuc_hanh.factory_method;

public class AnimalFactory {
    public Animals getAnimal(String type){
        if ("canine".equals(type)){
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
