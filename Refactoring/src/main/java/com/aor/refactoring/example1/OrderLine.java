package com.aor.refactoring.example1;

public class OrderLine {
    private Product product;//public Product product;
    private int quantity;//public int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public double Total(){
        return product.getPrice() * quantity;
    }
    public String printOrderLine(){
        return product.getName() + "(x" + quantity + "): " + (product.getPrice() * quantity) + "\n";
    }
}
