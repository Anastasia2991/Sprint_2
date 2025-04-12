import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.greenApple;
import static model.constants.Colour.redApple;


public class main {
    public static void main(String[] args){
       Meat meat = new Meat (5, 100);
       Apple appleRed = new Apple(10, 50, redApple);
       Apple appleGreen = new Apple( 10, 50, greenApple);
       Food[] product = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart =  new ShoppingCart(product);

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalAmountWithoutDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой " + shoppingCart.getTotalAmountWithDiscount() + " руб.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.getTotalAmountIsVegetarian() + " руб.");
    }

}
