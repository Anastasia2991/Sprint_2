package service;

import model.Food;


public class ShoppingCart {
    private Food[] product;

    public ShoppingCart(Food[] product){
        this.product = product;
    }

    public double getTotalAmountWithoutDiscount() {
        double totalAmountWithoutDiscount = 0;
        for (Food product : product) {
            totalAmountWithoutDiscount = totalAmountWithoutDiscount + product.getTotalAmountWithoutDiscount();
        }
        return totalAmountWithoutDiscount;
    }

    public double getTotalAmountWithDiscount() {
        double totalAmountWithDiscount = 0;
        for (Food product : product) {
            totalAmountWithDiscount = totalAmountWithDiscount + product.getTotalAmountWithDiscount();
        }
        return totalAmountWithDiscount;
    }

    public double getTotalAmountIsVegetarian() {
        double totalAmountIsVegetarian = 0;
        for (Food product : product) {
            totalAmountIsVegetarian = totalAmountIsVegetarian + product.getTotalAmountIsVegetarian();
        }
        return totalAmountIsVegetarian;
    }

}
