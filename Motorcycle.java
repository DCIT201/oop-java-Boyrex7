package com.rental.vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days < 0) {
            throw new IllegalArgumentException("Days must be non-negative.");
        }
        // Apply a discount of 5% for rentals longer than 3 days
        double cost = getBaseRentalRate() * days;
        if (days > 3) {
            cost *= 0.95; // 5% discount
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Motorcycle [ID=" + getVehicleId() + ", Model=" + getModel() + ", Base Rate=" + getBaseRentalRate() +
                ", Available=" + isAvailable() + "]";
    }
}
