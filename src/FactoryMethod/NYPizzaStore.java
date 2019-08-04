package FactoryMethod;
import FactoryMethod.NYPizza.*;
public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String item){

        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggieePizza();
        } else return null;
    }
}
