public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String type) {
        if (type.equals("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (type.equals("SQUARE")) {
            return new RoundedSquare();
        }

        return null;
    }

}
