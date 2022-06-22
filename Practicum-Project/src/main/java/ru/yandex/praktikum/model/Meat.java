package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Discount;
public class Meat extends Food {

    public Meat(int amount, double pricePerKilo) {
        super(amount, pricePerKilo);
        isVegetarian = false;
    }
    @Override
    public double getDiscount() {
        return Discount.NOTHING;
    }
}
