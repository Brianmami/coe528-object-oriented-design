/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author bmami
 */
public class Platinum extends Level{
    
    private final double fee = 0;

    
    
    //getter for the fee
    public double getFee() {
        return this.fee;
    }
    
    //method to change level 
    //done like this for all level classes to lessen writing and if statements
    /*(Instead of checking the price in main code, it checks it in this class and then does the 
    proper level creation*/
    @Override
    public void changeLevel(CustomerClass customer) {
        
        if(customer.readBalance() >= 10000 && customer.readBalance() < 20000){
            
            Level level = new Gold();

        }
        else if(customer.readBalance() < 10000){
            
            Level level = new Silver();
        }
        
        else if(customer.readBalance() >= 20000){
            
            Level level = new Platinum();
        }
    }
    //to string method to print out level
    @Override
    public String toString() {
        
        return "Platinum";
    }
    
    
    
    
    
}
