package SimpleFactory;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory spFactory = new SimplePizzaFactory();
        PizzaStore spStore = new PizzaStore(spFactory);
        spStore.orderPizza("veggie");
    }

}
