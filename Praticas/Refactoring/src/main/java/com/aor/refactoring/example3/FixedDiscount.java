package com.aor.refactoring.example3;

public class FixedDiscount implements Discount {
    private int discount;
    public FixedDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double price) {
        if(discount>price){
            return 0;
        }
        return price-discount;
    }
}
