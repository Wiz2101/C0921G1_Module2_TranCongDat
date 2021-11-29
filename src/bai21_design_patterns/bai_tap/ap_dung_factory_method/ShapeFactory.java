package bai21_design_patterns.bai_tap.ap_dung_factory_method;

public class ShapeFactory {

    public Shape getShape(String type) {
        switch (type) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
        }
        return null;
    }
}
