package bai21_design_patterns.bai_tap.ap_dung_factory_method;

public class FactoryPatternDemo {

    private static Shape Circle;

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();


    }
}
