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

//abstract level class
public abstract class Level {
    
    //abstracts methods to be overridden in child classes
    public abstract double getFee();
    
    public abstract void changeLevel(CustomerClass customer);
    
    public abstract String toString();
}
