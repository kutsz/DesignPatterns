package SimpleFactory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing");
    }

    void bake(){
        System.out.println("bake");
    }

    void cut(){
        System.out.println("cut");
    }

    void box(){
        System.out.println("box");
    }

}
