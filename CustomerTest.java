package com.rental.customer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testCustomerCreation() {
        Customer customer = new Customer("Ashley", "CUST001");
        assertEquals("Ashley", customer.getName());
        assertEquals("CUST001", customer.getCustomerId());
    }
}
