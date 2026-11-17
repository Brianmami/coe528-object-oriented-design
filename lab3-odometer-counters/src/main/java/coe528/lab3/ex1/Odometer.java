/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3.ex1;

/**
 *
 * @author mami
 */
public class Odometer implements Counter {
    
    //creating the digitcounter number, and the array for the n-1 set of numbers for linked digit counter
    DigitCounter DigitCounter;
    LinkedDigitCounter[] LinkedDigitCounters;
    
    //the integer n for the amount of numbers given
    int n;
    
    //odometer constructor 
    public Odometer(int n){
        
        this.n = n;
        
        if (n < 1) {
            
            //if n is less than 1, throw an error since there must be a + value for the odometer
            throw new IllegalArgumentException();
        }
        //creating the counters
        this.LinkedDigitCounters = new LinkedDigitCounter[n-1]; //linked is all except 1 (n-1)
        this.DigitCounter = new DigitCounter();//digit is one instance
        
        /*setting the left most value in the linked array equal to the digit counter,
        since digit counter represents that first value without a left neighbouring number*/
        LinkedDigitCounters[0] = new LinkedDigitCounter(this.DigitCounter);
        
        //setting the rest of the array, knwoing the left most is the digitcounter value
        for(int i = 1; i < n-1; i++){
            
            LinkedDigitCounters[i]= new LinkedDigitCounter(LinkedDigitCounters[i-1]);
        }
    }
    
    /*overriding the interface methods through access of the abstract class to fit 
    for the Odometer*/
    @Override
    public String count() {
        
        //concatenating the value of the left most digit first
        String leftMost = "";
        leftMost += this.DigitCounter.value;
        
        //concatenating the rest of the digits into the array for the value of n, other than the first spot
        for(int i = 0; i < n-1; i++) {
            
            leftMost += LinkedDigitCounters[i].value;
        }
        return leftMost;
    }
    
    @Override
    public void increment() {
        
        //
        LinkedDigitCounters[n-2].increment();
    }
    
    @Override
    public void decrement() {
        
        LinkedDigitCounters[n-2].decrement();
    }
    
    @Override
    public void reset() {
        
        this.DigitCounter.reset();
        
        for(int i = 0; i < n-1; i++) {
            
            LinkedDigitCounters[i].reset();
        }
    }
    
}
