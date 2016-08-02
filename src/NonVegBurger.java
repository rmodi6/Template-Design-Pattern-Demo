/**
 * Created by aayush.an on 29/07/16.
 */
public class NonVegBurger extends GenericBurger {

    String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
    String[] cheeseUsed = { "Provolone" };
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    // abstract methods
    public void addMeat(){

        System.out.print("Adding the Meat: ");

        for (String meat : meatUsed){

            System.out.print(meat + " ");

        }

    }

    public void addCheese(){

        System.out.print("Adding the Cheese: ");

        for (String cheese : cheeseUsed){

            System.out.print(cheese + " ");

        }

    }

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

}
