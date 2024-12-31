package com.rental.rental;

import com.rental.vehicle.Vehicle;
import com.rental.customer.Customer;

import java.util.HashMap;
import java.util.Map;

public class RentalAgency {
    private Map<String, Vehicle> vehicles = new HashMap<>();
    private Map<String, Customer> rentedVehicles = new HashMap<>(); // Track which customer rented which vehicle

    // Add a vehicle to the agency's fleet
    public void addVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getVehicleId(), vehicle);
    }

    // Get a vehicle by its ID
    public Vehicle getVehicle(String vehicleId) {
        return vehicles.get(vehicleId);
    }

    // Rent a vehicle to a customer
    public void rentVehicle(Customer customer, String vehicleId, int days) {
        Vehicle vehicle = getVehicle(vehicleId);

        if (vehicle != null) {
            // Check if the vehicle is available for rental
            if (vehicle.isAvailableForRental() && !rentedVehicles.containsKey(vehicleId)) {
                rentedVehicles.put(vehicleId, customer); // Register the rental
                System.out.println("Renting " + vehicleId + " to customer " + customer.getName());
                System.out.println("Rental cost: GH₵" + vehicle.calculateRentalCost(days));

                // Optionally, you could update the vehicle's availability here
                // vehicle.setAvailable(false); // Example, assuming we add a setter for availability
            } else {
                System.out.println("Vehicle is not available for rental or is already rented.");
            }
        } else {
            System.out.println("Vehicle not found in the fleet.");
        }
    }

    // Return a rented vehicle
    public void returnVehicle(String vehicleId) {
        if (rentedVehicles.containsKey(vehicleId)) {
            Customer customer = rentedVehicles.remove(vehicleId);
            System.out.println("Vehicle " + vehicleId + " has been returned by customer " + customer.getName());
        } else {
            System.out.println("Vehicle " + vehicleId + " was not rented.");
        }
    }

    // Generate a report of all rented vehicles
    public void rentalReport() {
        if (rentedVehicles.isEmpty()) {
            System.out.println("No vehicles are currently rented.");
        } else {
            System.out.println("Rented Vehicles Report:");
            rentedVehicles.forEach((vehicleId, customer) -> {
                System.out.println("Vehicle: " + vehicleId + ", Rented by: " + customer.getName());
            });
        }
    }
}
