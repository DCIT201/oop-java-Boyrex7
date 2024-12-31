package com.rental.customer;

public class Customer {
    private String name;
    private String customerId;
    private int loyaltyPoints; // Added loyalty points

    public Customer(String name, String customerId) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (customerId == null || customerId.isEmpty()) {
            throw new IllegalArgumentException("Customer ID cannot be null or empty.");
        }

        this.name = name;
        this.customerId = customerId;
        this.loyaltyPoints = 0; // Default loyalty points
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    public void setCustomerId(String customerId) {
        if (customerId == null || customerId.isEmpty()) {
            throw new IllegalArgumentException("Customer ID cannot be null or empty.");
        }
        this.customerId = customerId;
    }

    // Add loyalty points (for loyalty program)
    public void addLoyaltyPoints(int points) {
        if (points < 0) {
            throw new IllegalArgumentException("Points cannot be negative.");
        }
        this.loyaltyPoints += points;
    }

    @Override
    public String toString() {
        return "Customer [Name=" + name + ", Customer ID=" + customerId + ", Loyalty Points=" + loyaltyPoints + "]";
    }
}
