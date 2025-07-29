package factoryDesignPatterns.shape;

// Factory Class
public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
        };
    }
}
