/**
 * Created by aayush.an on 29/07/16.
 */

/**
 * A Template Method Pattern contains a method that provides
 * the steps of the algorithm. It allows subclasses to override
 * some of the methods
 */

public abstract class GenericBurger {

    /**
     * This is the Template Method
     * Declare this method final to keep subclasses from changing the algorithm
     */

    final void makeBurger(){

        cutBun();

        if(customerWantsMeat()){
            addMeat();
            System.out.println();
        }

        if(customerWantsCheese()){
            addCheese();
            System.out.println();
        }

        if(customerWantsVegetables()){
            addVegetables();
            System.out.println();
        }

        if(customerWantsCondiments()){
            addCondiments();
            System.out.println();
        }

        wrapTheBurger();

    }

    // These methods must be overridden by the extending subclasses

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();

    // These are called hooks
    // If the user wants to override these they can

    boolean customerWantsMeat() { return true; }
    boolean customerWantsCheese() { return true; }
    boolean customerWantsVegetables() { return true; }
    boolean customerWantsCondiments() { return true; }


    /**
     * Use abstract methods when you want to force the user
     * to override and use a hook when you want it to be optional
     */

    // Concrete methods

    public void wrapTheBurger(){
        System.out.println("Wrap the Burger");
    }

    public void cutBun(){
        System.out.println("The Burger is Cut");
    }

}
