package com.rental.main;

import com.rental.customer.Customer;
import com.rental.vehicle.Car;
import com.rental.rental.RentalAgency;
import com.rental.rental.RentalTransaction;

public class Main {
    public static void main(String[] args) {
        // Create a new rental agency
        RentalAgency agency = new RentalAgency();

        // Create a new car and add it to the agency
        Car car = new Car("GH-2234-24", "BMW M5 F90", 1000.0, true);
        agency.addVehicle(car);

        // Create a customer
        Customer customer = new Customer("Ashley Rexford Seth", "CUST001");

        // Rent the vehicle for 3 days if it's available
        if (car.isAvailableForRental()) {
            agency.rentVehicle(customer, "GH-2234-24", 3);

            // Create a rental transaction and process it
            RentalTransaction transaction = new RentalTransaction(customer, car, 3);
            transaction.processTransaction();

            // Simulate the return of the vehicle after the rental period
            transaction.returnVehicle(); // Returning the vehicle after rental
        } else {
            System.out.println("The vehicle is not available for rental.");
        }
    }
}
