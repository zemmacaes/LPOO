package com.aor.refactoring.example1;

public class OrderLine
{
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity)
    {
        this.setProduct(product);
        this.setQuantity(quantity);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal()
    {
        return this.product.getPrice()*this.quantity;
    }

    @Override
    public String toString()
    {
        StringBuffer printBuffer = new StringBuffer();

        printBuffer.append(this.getProduct().getName() + "(x" + this.getQuantity() + "): " + (this.getProduct().getPrice() * this.getQuantity()) + "\n");

        printBuffer.append("Total: " + getTotal());

        return printBuffer.toString();
    }
}
