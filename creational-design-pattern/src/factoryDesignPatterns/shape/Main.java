package factoryDesignPatterns.shape;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeType.CIRCLE);
        Shape shape2 = ShapeFactory.getShape(ShapeType.SQUARE);
        shape1.draw();
        shape2.draw();
    }
}
