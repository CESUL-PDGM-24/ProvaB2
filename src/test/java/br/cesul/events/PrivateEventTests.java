package br.cesul.events;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrivateEventTests {

    @Test
    public void testCalculateCostDrinkOpenBarDecorationStandard() {
        var event = new PrivateEvent("Client", null, DrinkServiceType.OPEN_BAR, DecorationType.STANDARD, 100);
        var cost = event.calculateCost();
        assertEquals(19500.0, cost);
    }

    @Test
    public void testCalculateCostDrinkOpenBarDecorationSuperior() {
        var event = new PrivateEvent("Client", null, DrinkServiceType.OPEN_BAR, DecorationType.SUPERIOR, 100);
        var cost = event.calculateCost();
        assertEquals(23400.0, cost);
    }

    @Test
    public void testCalculateCostDrinkOpenBarDecorationDeluxe() {
        var event = new PrivateEvent("Client", null, DrinkServiceType.OPEN_BAR, DecorationType.DELUXE, 100);
        var cost = event.calculateCost();
        assertEquals(32500.0, cost);
    }

    @Test
    public void testCalculateCostDrinkOpenBarDecorationSuperDeluxe() {
        var event = new PrivateEvent("Client", null, DrinkServiceType.OPEN_BAR, DecorationType.SUPER_DELUXE, 100);
        var cost = event.calculateCost();
        assertEquals(45500.0, cost);
    }

    @Test
    public void testCalculateCostDrinkConsumptionDecorationStandard() {
        var event = new PrivateEvent("Client", null, DrinkServiceType.CONSUMPTION, DecorationType.STANDARD, 100);
        var cost = event.calculateCost();
        assertEquals(15600.0, cost);
    }

    @Test
    public void testCalculateCostDrinkConsumptionDecorationSuperior() {
        var event = new PrivateEvent("Client", null, DrinkServiceType.CONSUMPTION, DecorationType.SUPERIOR, 100);
        var cost = event.calculateCost();
        assertEquals(19500.0, cost);
    }

    @Test
    public void testCalculateCostDrinkConsumptionDecorationDeluxe() {
        var event = new PrivateEvent("Client", null, DrinkServiceType.CONSUMPTION, DecorationType.DELUXE, 100);
        var cost = event.calculateCost();
        assertEquals(28600.0, cost);
    }

    @Test
    public void testCalculateCostDrinkConsumptionDecorationSuperDeluxe() {
        var event = new PrivateEvent("Client", null, DrinkServiceType.CONSUMPTION, DecorationType.SUPER_DELUXE, 100);
        var cost = event.calculateCost();
        assertEquals(41600.0, cost);
    }
}
