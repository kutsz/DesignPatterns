package AbstractFactory;

import AbstractFactory.ingredients.*;
import AbstractFactory.ingredients.veggies.*;
import AbstractFactory.ingredients.veggies.Veggies;

public class NYPizzaIngredientFactoty implements PizzaIngredientFactory {

    public Dough createDough(){
        return new ThinCrustDough();
    }

    public Sauce createSauce(){
        return new MarinaraSauce();
    }

    public Cheese createCheese(){
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies(){
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni(){
         return new SlicedPepperoni();
    }

    public Clams createClams(){
        return new FreshClams();
    }
}
