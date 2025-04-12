package model;

import static model.constants.Colour.redApple;
import static model.constants.Discount.redDiscount;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    protected String colour;

    @Override
    public double getDiscount() {
        return 0;
    }

    public Food(int amount, double price, boolean isVegetarian, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
        this.colour=colour;
    }

    public double getTotalAmountWithoutDiscount() {
        return price * amount;
    }
    public double getTotalAmountWithDiscount() {
        if (colour != null&&colour.equals(redApple)) {
            return getTotalAmountWithoutDiscount() - (getTotalAmountWithoutDiscount()*redDiscount);
        } else {
            return getTotalAmountWithoutDiscount();
        }
    }

    public double getTotalAmountIsVegetarian() {
        if (colour != null&&!colour.equals(redApple)&&isVegetarian) {
            return getTotalAmountWithoutDiscount();
        }
        return 0;
    }

}

