package com.rental.rental;

import com.rental.customer.Customer;
import com.rental.vehicle.Car;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalAgencyTest {

    @Test
    void testAddVehicle() {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("GH-2234-24", "BMW M5 F90", 1000.0, true);
        agency.addVehicle(car);
        assertNotNull(agency.getVehicle("GH-2234-24"), "Vehicle should be added to the agency");
    }

    @Test
    void testRentVehicle() {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("GH-2234-24", "BMW M5 F90", 1000.0, true);
        agency.addVehicle(car);
        Customer customer = new Customer("Ashley Rexford Seth", "CUST001");
        agency.rentVehicle(customer, "GH-2234-24", 3);
        // Here you can assert the rental logic if needed, or test side effects
    }
}
