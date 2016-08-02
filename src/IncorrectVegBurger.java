/**
 * Created by aayush.an on 29/07/16.
 */
public class IncorrectVegBurger {

    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    public void makeBurger(){
        cutBun();
        addVegetables();
        addCondiments();
        wrapTheBurger();
    }

    public void addVegetables(){

        System.out.print("Adding the Vegetables: ");

        for (String vegetable : veggiesUsed){

            System.out.print(vegetable + " ");

        }
        System.out.println();

    }

    public void addCondiments(){

        System.out.print("Adding the Condiments: ");

        for (String condiment : condimentsUsed){

            System.out.print(condiment + " ");

        }
        System.out.println();

    }

    // Repeated Methods

    public void cutBun(){

        System.out.println("The Burger is Cut");

    }

    public void wrapTheBurger(){

        System.out.println("Wrap the Burger");

    }
}
