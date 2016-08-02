/**
 * Created by aayush.an on 29/07/16.
 */
public class BurgerMaker {

    public static void main(String[] args){

        GenericBurger customer1 = new NonVegBurger();
        customer1.makeBurger();

        System.out.println();

        GenericBurger customer2 = new VegBurger();
        customer2.makeBurger();

    }
}
