public class Main {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryCreator.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        AbstractFactory roundedShapeFactory = FactoryCreator.getFactory(true);

        Shape roundedShape1 = roundedShapeFactory.getShape("RECTANGLE");
        roundedShape1.draw();
        Shape roundedShape2 = roundedShapeFactory.getShape("SQUARE");
        roundedShape2.draw();

    }

}
