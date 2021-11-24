public class FactoryCreator {

    public static AbstractFactory getFactory(boolean roundedShape) {
        if (roundedShape) {
            return new RoundedShapeFactory();
        } else {
            return new RegularShapeFactory();
        }
    }

}
