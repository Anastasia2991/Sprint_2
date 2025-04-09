package model;

import static model.constants.Discount.*;

public class Meat extends Food implements Discountable {

    public Meat(int amount, double price) {
        super(amount, price, false, null);
    }

    @Override
    public double getDiscount() {
        return allDiscount;}


}
