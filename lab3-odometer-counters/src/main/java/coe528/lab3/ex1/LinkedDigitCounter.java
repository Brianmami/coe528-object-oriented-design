/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3.ex1;

/**
 *
 * @author mami
 */
public class LinkedDigitCounter extends AbstractCounter {
    
    //creating the LeftNeighbour attribute
    Counter leftNeighbour;
    
    //constructor taking in leftneighbour, creating a value instance = 0 using super, and setting the leftneighbour
    public LinkedDigitCounter(Counter leftNeighbour){
        super();
        this.leftNeighbour = leftNeighbour;
    }
    
    
    /*overriding the interface methods through access of the abstract class to fit 
    for the linked digit counter*/
    @Override
    public String count() {
        return("" + this.value);
    }
    
    @Override
    public void increment() {
        //increases the value by 1 if less than 9, if 9, it will reset to 0.
        //only for linkeddigitcounter, the left neighbour will also be ran through increment checking the same before
        
        if(this.value < 9){
            
            this.value++;
        } else {
            
            this.value = 0;
            this.leftNeighbour.increment();
        }
    }
    
    @Override
    public void decrement() {
        //decreases the value by 1 if greater than 0, else it will set the number to 9 
        //only for linkeddigitcounter, the left neighbour will also be ran through decrement checking the same before
        
        
        if(this.value>0) {
            
            this.value--;
        } else {
            
            this.value=9;
            this.leftNeighbour.decrement();
        }
    }
    
    @Override
    public void reset() {
        
        this.value = 0;
    }
    
}
