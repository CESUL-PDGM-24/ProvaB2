package br.cesul.events;

import java.time.LocalDate;

public class PrivateEvent extends Event{

    private final Integer guests;

    public PrivateEvent(String client, LocalDate date, DrinkServiceType drinkService, DecorationType decoration, Integer guests) {
        super(client, date, drinkService, decoration);
        this.guests = guests;
    }

    @Override
    public double calculateCost() {
        var costPerGuest = 50 + getDrinkCost() + (getDecorationCost() / guests);
        return costPerGuest * guests * 1.3;
    }

    private double getDrinkCost() {
        return switch (drinkService) {
            case OPEN_BAR -> 50;
            case CONSUMPTION -> 20;
        };
    }

    private double getDecorationCost() {
        return switch (decoration) {
            case STANDARD -> 5000;
            case SUPERIOR -> 8000;
            case DELUXE -> 15000;
            case SUPER_DELUXE -> 25000;
        };
    }

    public Integer getGuests() {
        return guests;
    }
}
