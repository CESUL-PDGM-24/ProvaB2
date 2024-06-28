package br.cesul.events;

import java.time.LocalDate;

public class PublicEvent extends Event{

    private final Double ticketPrice;
    private final Double venueCost;
    private final Integer capacity;
    private final Integer minimumAudience;

    public PublicEvent(String client, LocalDate date, DrinkServiceType drinkService, DecorationType decoration, Double ticketPrice, Double venueCost, Integer capacity, Integer minimumAudience) {
        super(client, date, drinkService, decoration);
        this.ticketPrice = ticketPrice;
        this.venueCost = venueCost;
        this.capacity = capacity;
        this.minimumAudience = minimumAudience;
    }

    @Override
    public double calculateCost() {
        var ticketCost = (ticketPrice * minimumAudience) + ((getDecorationCost() + venueCost) / minimumAudience);
        return (ticketCost * minimumAudience) + (ticketCost * capacity * minimumAudience * 0.2);
    }

    private double getDecorationCost() {
        return switch (decoration) {
            case STANDARD -> 15000;
            case SUPERIOR -> 20000;
            case DELUXE -> 35000;
            case SUPER_DELUXE -> 50000;
        };
    }
    public Double getTicketPrice() {
        return ticketPrice;
    }

    public Double getVenueCost() {
        return venueCost;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getMinimumAudience() {
        return minimumAudience;
    }
}
