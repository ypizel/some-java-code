package ru.yandex.praktikum.model;


public abstract class Food implements Discountable  {
    protected int amount;
    protected double pricePerKilo;
    protected boolean isVegetarian;

    protected Food(int amount,double pricePerKilo) {
        this.amount = amount;
        this.pricePerKilo = pricePerKilo;
    }

    public double getTotalCost() { // стоимость товара
        return pricePerKilo * amount;
    }

    public double getTotalDiscountAmount(){ // скидка
        return getTotalCost() * getDiscount() / 100;
    }

    public double getTotalCostDiscounted(){ // цена со скидкой
        return getTotalCost() - getTotalDiscountAmount();
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }




}
