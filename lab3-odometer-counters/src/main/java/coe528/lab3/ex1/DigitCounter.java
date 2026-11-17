/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3.ex1;

/**
 *
 * @author mami
 */
public class DigitCounter extends AbstractCounter{
   
    //constructor
    public DigitCounter() {
        
        //creating a new variable by running the super method, accessing the abstractcounter constructor
        super();
        
    }
    
    
    /*overriding the interface methods through access of the abstract class to fit 
    for the digit counter*/
    @Override
    public String count() {
        
        return("" + this.value);
    }
    
    @Override
    public void increment() {
        
         //increases the value by 1 if less than 9, if 9, it will reset to 0.
         
        if(this.value<9) {
            this.value++;
        } else {
            
            this.value = 0;
        }
    }
    
    @Override
    public void decrement() {
        
        //decreases the value by 1 if greater than 0, else it will set the number to 9 

        if(this.value > 0) {
            
            this.value--;
        } else {
            
            this.value = 9;
        } 
    }
    
    @Override
    public void reset() {
        
        this.value = 0;
    }
    
}
