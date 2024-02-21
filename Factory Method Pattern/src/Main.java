// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ConcreteCreatorA concreteCreatorA = new ConcreteCreatorA();
        Product pr1 = concreteCreatorA.createProduct("circle");
        pr1.productType();
        Product pr2 = concreteCreatorA.createProduct("SQuare");
        pr2.productType();
    }
}