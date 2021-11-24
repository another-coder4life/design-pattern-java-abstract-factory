public class RegularShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String type) {
        if (type.equals("RECTANGLE")) {
            return new RegularRectangle();
        } else if (type.equals("SQUARE")) {
            return new RegularSquare();
        }

        return null;
    }

}
