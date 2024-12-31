package com.rental.vehicle;

public class Car extends Vehicle {
    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public double calculateRentalCost(int days) {
        if (days < 0) {
            throw new IllegalArgumentException("Days must be non-negative.");
        }
        // Apply a flat GH₵100 cleaning fee for all car rentals
        double cost = getBaseRentalRate() * days;
        double cleaningFee = 100.0;
        return cost + cleaningFee;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Car [ID=" + getVehicleId() + ", Model=" + getModel() + ", Base Rate=" + getBaseRentalRate() +
                ", Available=" + isAvailable() + "]";
    }
}
