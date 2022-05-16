package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void get_customer_balance_due(){
        Customer customer = new Customer("Angeline", "To");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Bathing", 25.00);
        testMap.put("Boarding", 40.00);

        double total = customer.getBalanceDue(testMap);

        Assert.assertEquals("The customer's balance due is not correct.", 65.00, total, 0.0);
    }

    @Test
    public void get_customer_balance_due_on_empty_map(){
        Customer customer = new Customer("Vicky", "Chen");
        Map<String, Double> testMap = new HashMap<>();

        double total = customer.getBalanceDue(testMap);

        Assert.assertEquals("The customer's balance due is not correct.", 0.00, total, 0.0);
    }

}
