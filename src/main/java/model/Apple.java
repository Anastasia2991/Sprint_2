package model;
import static model.constants.Colour.RED_APPLE;
import static model.constants.Discount.ALL_DISCOUNT;
import static model.constants.Discount.RED_DISCOUNT;

public class Apple extends Food {
    protected String colour;

     @Override
     public double getDiscount() {
         if (colour.equals(RED_APPLE)) {
                return RED_DISCOUNT;
            } else {
               return ALL_DISCOUNT;
            }
     }

     public Apple (int amount, double price, String colour) {
         super(amount, price, true);
            this.colour = colour;
     }


}


