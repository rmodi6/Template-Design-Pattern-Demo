/**
 * Created by aayush.an on 29/07/16.
 */
public class VegBurger extends GenericBurger{

    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    // hook method

    @Override
    boolean customerWantsMeat() { return false; }

    @Override
    boolean customerWantsCheese() { return false; }

    // abstract methods

    public void addVegetables(){

        System.out.print("Adding the Vegetables: ");

        for (String vegetable : veggiesUsed){

            System.out.print(vegetable + " ");

        }

    }

    public void addCondiments(){

        System.out.print("Adding the Condiments: ");

        for (String condiment : condimentsUsed){

            System.out.print(condiment + " ");

        }

    }

    void addMeat() {}

    void addCheese() {}
}