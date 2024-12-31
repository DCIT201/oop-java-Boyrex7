package com.rental.rental;

import com.rental.customer.Customer;
import com.rental.vehicle.Vehicle;
import java.util.Date;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;
    private Date rentalDate;
    private double totalCost;
    private boolean isComplete;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.rentalDate = new Date(); // Capture the date when the transaction is created
        this.totalCost = vehicle.calculateRentalCost(rentalDays);
        this.isComplete = false; // Transaction is incomplete by default
    }

    public void processTransaction() {
        if (vehicle.isAvailableForRental()) {
            System.out.println("Processing rental for customer: " + customer.getName());
            System.out.println("Vehicle: " + vehicle.getModel());
            System.out.println("Rental Date: " + rentalDate);
            System.out.println("Rental Duration: " + rentalDays + " days");
            System.out.println("Total rental cost: GH₵" + totalCost);

            // Mark the transaction as complete after processing
            isComplete = true;

            // You can also update the vehicle availability here
            // For example, vehicle.setAvailable(false);
        } else {
            System.out.println("Sorry, the vehicle is not available for rental.");
        }
    }

    public void returnVehicle() {
        if (isComplete) {
            System.out.println("Vehicle returned by customer: " + customer.getName());
            System.out.println("Vehicle: " + vehicle.getModel());
            // You could also update the vehicle availability here
            // vehicle.setAvailable(true);
        } else {
            System.out.println("No transaction was processed for this vehicle.");
        }
    }

    // Getters and Setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
