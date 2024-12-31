package com.rental.vehicle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCalculateRentalCost() {
        Car car = new Car("GH-2765-20", "Toyota Corolla", 50.0, true);
        assertEquals(150.0, car.calculateRentalCost(3), "Rental cost should be 150.0 for 3 days");
    }

    @Test
    void testIsAvailableForRental() {
        Car car = new Car("GH-1837-21", "Honda Accord", 60.0, false);
        assertFalse(car.isAvailableForRental(), "Car should not be available for rental");
    }
}
