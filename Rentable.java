package com.rental.rentable;

import com.rental.customer.Customer;

public interface Rentable {

    /**
     * Rent a vehicle to a customer for a specified number of days.
     *
     * @param customer The customer renting the vehicle
     * @param days The number of days the vehicle is being rented for
     * @throws IllegalArgumentException if the rental duration is invalid (e.g., negative or zero)
     */
    void rent(Customer customer, int days);

    /**
     * Return the vehicle and finalize the rental.
     */
    void returnVehicle();

    /**
     * Default method for checking the availability of the vehicle.
     * This could be overridden by individual vehicle types if needed.
     *
     * @return boolean indicating whether the vehicle is available for rent
     */
    default boolean isAvailableForRent() {
        return true; // Default availability, could be overridden in specific classes
    }
}
