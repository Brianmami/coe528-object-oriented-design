/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.flightbooking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bmami
 */
public class FlightTest {
    
    private Flight Flight;
    
    
    public FlightTest() {
    }
    
    

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testConstructor() {
        System.out.println("Constructor");
        Flight = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234);
        //make sure all instance variables were set correctly
        assertEquals(1, Flight.getFlightNumber());
        assertSame("Toronto", Flight.getOrigin());
        assertSame("New York", Flight.getDestination());
        assertSame("01/20/2024 5:20 pm", Flight.getDepartureTime());
        assertEquals(10,Flight.getCapacity());
        assertEquals(10,Flight.getNumberOfSeatsLeft());
        assertEquals(1234,Flight.getOriginalPrice(), 0.001);
    }
    
    /**
     * Test of constructor method (check that exception is thrown correctly), of class Flight.
     */
    @Test
    public void testInvalidConstructor() {
        System.out.println("InvalidConstructor");
        boolean test = false;
        boolean expTest = true;
        try{
            Flight = new Flight(1, 10, 15, "Toronto", "Toronto", "01/20/2024 5:20 pm", 1234.56);
        }
        catch(IllegalArgumentException f){
            test = true;
        }
        assertSame(expTest, test);
    }
    
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(4, 10, 10, "Toronto", "Tokyo", "02/23/2024 3:10 am", 1000);
        String expResult = "Flight 4, Toronto to Tokyo, 02/23/2024 3:10 am, original price: 1000.0$";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        int expResult = 10;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        int expResult = 10;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        String expResult = "New York";
        String result = instance.getDestination();
        assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        String expResult = "01/20/2024 5:20 pm";
        String result = instance.getDepartureTime();
        assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        double expResult = 1234.56;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 1;
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        instance.setFlightNumber(flightNumber);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 10;
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 15;
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Toronto";
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        instance.setOrigin(origin);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "New York";
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        instance.setDestination(destination);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "01/20/2024 5:20 pm";
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        instance.setDepartureTime(departureTime);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        Double originalPrice = 1234.56;
        Flight instance = new Flight(1, 10, 15, "Toronto", "New York", "01/20/2024 5:20 pm", 1234.56);
        instance.setOriginalPrice(originalPrice);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
