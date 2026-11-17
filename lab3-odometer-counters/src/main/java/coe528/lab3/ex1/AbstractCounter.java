/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3.ex1;

/**
 *
 * @author mami
 */
public abstract class AbstractCounter implements Counter {
    
    int value; 
    
    //creating the constructor to set the value of this instance to 0
    public AbstractCounter(){
        
        this.value = 0;
        
    }
    
    //overriding the interface methods to allow the child classes of this abtract class to use them
    //in whatever way they need, ssince they are being overriden and abstract here
    @Override
    public abstract String count();
    
    @Override
    public abstract void increment();
    
    @Override
    public abstract void decrement();
    
    @Override
    public abstract void reset();
}
