/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author mami
 */

import java.util.ArrayList;

//ADT can accept any variable type
public class ADT<E> {

// Overview: ADT are mutable, bounded
// collection of objects that operate in
// FIFO (First-In-First-Out) order.
//
// The abstraction function is:
// a) Write the abstraction function here
//    
// AF(stack) = { stack[i].element | 0 <= i < stack.size }
//
//
//
// The rep invariant is:
// b) Write the rep invariant here
// stack[i].element != null
// 
//
//
//

    //any variable type 
    private ArrayList < E > stack;


    public ADT() {
        
// EFFECTS: Create a new ADT object

        stack = new ArrayList < E >();
    }

    public void enqueue(E element) {
        
// MODIFIES: this
// EFFECTS: Appends the element at the bottom of the queue
    
        stack.add(element); 

    }

    public E dequeue() {
        
// MODIFIES: this
// EFFECTS: Removes an element from the top of the queue

        if (stack.isEmpty());
       
        return stack.remove(0);
    }
    

    public boolean repOK() {
        
// EFFECTS: Returns true if the rep invariant holds for this
// object; otherwise returns false
        
        return stack != null;
    }
    
    public boolean isEmpty() {
        
        return stack.isEmpty();
    }

    public String toString() {
        
// EFFECTS: Returns a string that contains the strings in the
// stack and the top element. Implements the abstraction function.


    String string = "";
    for(int i = 0; i < stack.size(); i++){
        
        string += stack.get(i) + " ";
    }
    
    return string;
    }
    
    
}

