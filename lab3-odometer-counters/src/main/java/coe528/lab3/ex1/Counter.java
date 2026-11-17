/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package coe528.lab3.ex1;

/**
 *
 * @author mami
 */
//creating the functions accesible only to the child classes of Counter

/* A basic up-down counter. */
public interface Counter {
    
//The current value of this Counter as a String of digits.
String count();

//Increment this Counter.
void increment();

//Decrement this Counter.
void decrement();

//Reset this Counter.
void reset();
}


 