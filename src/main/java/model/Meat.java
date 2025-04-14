package model;

import static model.constants.Discount.ALL_DISCOUNT;

public class Meat extends Food implements Discountable {

    public Meat(int amount, double price) {
        super(amount, price, false);
    }

    @Override
    public double getDiscount() {
        return ALL_DISCOUNT;}


}
