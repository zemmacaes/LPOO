package com.aor.refactoring.example3;

public class NoDiscount extends Discount
{
    public NoDiscount(){}

    @Override
    public double applyDiscount(double price)
    {
        return price;
    }
}
