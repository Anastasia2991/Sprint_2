package model;
import static model.constants.Colour.redApple;
import static model.constants.Discount.allDiscount;
import static model.constants.Discount.redDiscount;

public class Apple extends Food {

     @Override
     public double getDiscount() {
         if (colour.equals(redApple)) {
                return redDiscount;
            } else {
               return allDiscount;
            }
     }

     public Apple (int amount, double price, String colour) {
         super(amount, price, true, colour);

     }


}


