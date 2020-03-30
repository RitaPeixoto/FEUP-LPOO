package com.aor.refactoring.example3;

public class PercentageDiscount implements Discount {
    private double discount;
    public PercentageDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double price) {
        if (discount > 0)
            return  price - price * discount;
        return price;
    }
}
