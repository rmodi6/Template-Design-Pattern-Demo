/**
 * Created by aayush.an on 29/07/16.
 */
public class IncorrectBurgerMaker {
    public static void main(String[] args){
        IncorrectNonVegBurger customer1 = new IncorrectNonVegBurger();
        customer1.makeBurger();
        System.out.println();
        IncorrectVegBurger customer2 = new IncorrectVegBurger();
        customer2.makeBurger();

    }
}
