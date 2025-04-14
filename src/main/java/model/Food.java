package model;

import static model.constants.Colour.RED_APPLE;
import static model.constants.Discount.RED_DISCOUNT;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public double getDiscount() {
        return 0;
    }

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getTotalAmountWithoutDiscount() {
        return price * amount;
    }

    public double getTotalAmountWithDiscount() {
        if (getDiscount() > 0.00) {
            return getTotalAmountWithoutDiscount() - (getTotalAmountWithoutDiscount()* RED_DISCOUNT);
        } else {
            return getTotalAmountWithoutDiscount();
        }
    }

    public double getTotalAmountIsVegetarian() {
        if (isVegetarian) {
            return getTotalAmountWithoutDiscount();
        }
        return 0;
    }

}

