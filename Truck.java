package com.rental.vehicle;

public class Truck extends Vehicle {
    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days < 0) {
            throw new IllegalArgumentException("Days must be non-negative.");
        }
        // Apply a 10% surcharge for trucks rented for more than 5 days
        double cost = getBaseRentalRate() * days;
        if (days > 5) {
            cost *= 1.10; // 10% surcharge
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Truck [ID=" + getVehicleId() + ", Model=" + getModel() + ", Base Rate=" + getBaseRentalRate() +
                ", Available=" + isAvailable() + "]";
    }
}
