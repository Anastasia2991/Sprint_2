import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_APPLE;
import static model.constants.Colour.RED_APPLE;


public class Main {
    public static void main(String[] args){
       Meat meat = new Meat (5, 100);
       Apple appleRed = new Apple(10, 50, RED_APPLE);
       Apple appleGreen = new Apple( 8, 60, GREEN_APPLE);
       Food[] product = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart =  new ShoppingCart(product);

        System.out.format("Общая сумма товаров без скидки: %s руб.\n", shoppingCart.getTotalAmountWithoutDiscount());
        System.out.format("Общая сумма товаров со скидкой: %s руб.\n", shoppingCart.getTotalAmountWithDiscount());
        System.out.format("Сумма всех вегетарианских продуктов без скидки: %s руб.\n", shoppingCart.getTotalAmountIsVegetarian());
    }

}
