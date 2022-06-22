package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;

import ru.yandex.praktikum.model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double pricePerKilo, String colour) {
        super(amount, pricePerKilo);
        this.colour = colour;
        isVegetarian = true;

    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED_APPLE)) {
            return Discount.SIXTY_PERCENT;
        } return Discount.NOTHING;
    }
}