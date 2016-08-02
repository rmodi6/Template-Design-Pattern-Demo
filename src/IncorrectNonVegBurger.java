/**
 * Created by aayush.an on 29/07/16.
 */
public class IncorrectNonVegBurger {

    String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
    String[] cheeseUsed = { "Provolone" };
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    // Sequence might change - so chance of error
    public void makeBurger(){
        cutBun();
        addMeat();
        addCheese();
        addVegetables();
        addCondiments();
        wrapTheBurger();
    }

    public void addMeat(){

        System.out.print("Adding the Meat: ");

        for (String meat : meatUsed){

            System.out.print(meat + " ");

        }
        System.out.println();

    }

    public void addCheese(){

        System.out.print("Adding the Cheese: ");

        for (String cheese : cheeseUsed){

            System.out.print(cheese + " ");

        }
        System.out.println();

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