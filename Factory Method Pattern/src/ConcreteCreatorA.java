public class ConcreteCreatorA implements Creator{
    @Override
    public Product createProduct(String type) {
        if(type == null) return null;
        else if (type.equalsIgnoreCase("CIRCLE")) {
            return new CircleProduct();
        } else if (type.equalsIgnoreCase("SQUARE")) {
            return new SquareProduct();
        }
        return null;
    }
}
