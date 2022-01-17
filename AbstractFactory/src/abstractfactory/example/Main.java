package abstractfactory.example;

public class Main {

    public static void main(String[] args) {
	    AbstractFactory factory = FactoryProducer.GetFactory(true);

        factory.GetShape("rectangle").Draw();

        factory = FactoryProducer.GetFactory(false);

        factory.GetShape("rectangle").Draw();
    }
}
