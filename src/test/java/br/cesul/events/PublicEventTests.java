package br.cesul.events;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PublicEventTests {

    @Test
    public void testCalculateCostDrinkOpenBarDecorationStandard() {
        var event = new PublicEvent("Client", null, DrinkServiceType.OPEN_BAR, DecorationType.STANDARD, 100.0, 1000.0, 100, 50);
        var cost = event.calculateCost();
        assertEquals(5586000.0, cost);
    }

    @Test
    public void testCalculateCostDrinkOpenBarDecorationSuperior() {
        var event = new PublicEvent("Client", null, DrinkServiceType.OPEN_BAR, DecorationType.SUPERIOR, 100.0, 1000.0, 100, 50);
        var cost = event.calculateCost();
        assertEquals(5691000.0, cost);
    }

    @Test
    public void testCalculateCostDrinkOpenBarDecorationDeluxe() {
        var event = new PublicEvent("Client", null, DrinkServiceType.OPEN_BAR, DecorationType.DELUXE, 100.0, 1000.0, 100, 50);
        var cost = event.calculateCost();
        assertEquals(6006000.0, cost);
    }

    @Test
    public void testCalculateCostDrinkOpenBarDecorationSuperDeluxe() {
        var event = new PublicEvent("Client", null, DrinkServiceType.OPEN_BAR, DecorationType.SUPER_DELUXE, 100.0, 1000.0, 100, 50);
        var cost = event.calculateCost();
        assertEquals(6321000.0, cost);
    }

    @Test
    public void testCalculateCostDrinkConsumptionDecorationStandard() {
        var event = new PublicEvent("Client", null, DrinkServiceType.CONSUMPTION, DecorationType.STANDARD, 100.0, 1000.0, 100, 50);
        var cost = event.calculateCost();
        assertEquals(5586000.0, cost);
    }

    @Test
    public void testCalculateCostDrinkConsumptionDecorationSuperior() {
        var event = new PublicEvent("Client", null, DrinkServiceType.CONSUMPTION, DecorationType.SUPERIOR, 100.0, 1000.0, 100, 50);
        var cost = event.calculateCost();
        assertEquals(5691000.0, cost);
    }

    @Test
    public void testCalculateCostDrinkConsumptionDecorationDeluxe() {
        var event = new PublicEvent("Client", null, DrinkServiceType.CONSUMPTION, DecorationType.DELUXE, 100.0, 1000.0, 100, 50);
        var cost = event.calculateCost();
        assertEquals(6006000.0, cost);
    }

    @Test
    public void testCalculateCostDrinkConsumptionDecorationSuperDeluxe() {
        var event = new PublicEvent("Client", null, DrinkServiceType.CONSUMPTION, DecorationType.SUPER_DELUXE, 100.0, 1000.0, 100, 50);
        var cost = event.calculateCost();
        assertEquals(6321000.0, cost);
    }

}
