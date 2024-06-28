package br.cesul.events;

import java.time.LocalDate;

public abstract class Event {

    private final String client;
    private final LocalDate date;
    protected final DrinkServiceType drinkService;
    protected final DecorationType decoration;

    public Event(String client, LocalDate date, DrinkServiceType drinkService, DecorationType decoration) {
        this.client = client;
        this.date = date;
        this.drinkService = drinkService;
        this.decoration = decoration;
    }

    public abstract double calculateCost();

    public String getClient() {
        return client;
    }

    public LocalDate getDate() {
        return date;
    }

    public DrinkServiceType getDrinkService() {
        return drinkService;
    }

    public DecorationType getDecoration() {
        return decoration;
    }
}
