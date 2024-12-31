package com.rental.vehicle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    // Mock class for abstract Vehicle class
    static class MockVehicle extends Vehicle {
        public MockVehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
            super(vehicleId, model, baseRentalRate, isAvailable);
        }

        @Override
        public double calculateRentalCost(int days) {
            return getBaseRentalRate() * days;
        }

        @Override
        public boolean isAvailableForRental() {
            return isAvailable();
        }
    }

    @Test
    void testCalculateRentalCost() {
        Vehicle vehicle = new MockVehicle("GH-2267-24", "Honda Civic", 40.0, true);
        assertEquals(120.0, vehicle.calculateRentalCost(3), "Rental cost should be 120.0 for 3 days");
    }

    @Test
    void testIsAvailableForRental() {
        Vehicle vehicle = new MockVehicle("GH-1654-23", "BMW X5", 1200.0, false);
        assertFalse(vehicle.isAvailableForRental(), "Vehicle should not be available for rental");
    }
}
