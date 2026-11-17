/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coe528.lab3.ex1;

/**
 *
 * @author mami
 */
import java.util.ArrayList;
public class StackOfDistinctStrings {
    
// Overview: StacksOfDistinctStrings are mutable, bounded
// collection of distinct strings that operate in
// LIFO (Last-In-First-Out) order.
//
// The abstraction function is:
// a) Write the abstraction function here
//           the set of items.get(i)" such that the predicate "0 <= i < items.size()" is true  
//
// AF (items) = { items.get(i) | 0 <= i < items.size() }
//
//
// The rep invariant is:
// b) Write the rep invariant here
//
// RI(items) = items.get(i) != null && 
// for all strings i, items.get(i) is a string && 
// for all integers i and j, (0 <= i < j < items.size() => items.get(i) != items.get(j))
//
//
//the rep
private ArrayList<String> items;


// constructor
public StackOfDistinctStrings() {
    
// EFFECTS: Creates a new StackOfDistinctStrings object
items = new ArrayList<String>();

}
public void push(String element) throws Exception {
    
// MODIFIES: this
// EFFECTS: Appends the element at the top of the stack
// if the element is not in the stack, otherwise
// does nothing.

if(element == null) throw new Exception();

if(false == items.contains(element))
items.add(element);

}

public String pop() throws Exception {
    
// MODIFIES: this
// EFFECTS: Removes an element from the top of the stack

if (items.size() == 0) throw new Exception();

return items.remove(items.size()-1);
}

public boolean repOK() {
    
// EFFECTS: Returns true if the rep invariant holds for this
// object; otherwise returns false
// c) Write the code for the repOK() here

for(int i = 0; i < items.size(); i++){
    
        for(int j = i + 1; j < items.size(); j++){
            
             //checking if all items.get(i) are strings
             if (items.get(i) == null || !(items.get(i) instanceof String)) {
             // If the item at index i is not a string or null, return false
             return false;
                }
             //checking the equality of i and j 
             if(items.get(i).equals((items.get(j)))){
                return false;
            }
        }
       
    }

    return true;
}

public String toString() {
    
// EFFECTS: Returns a string that contains the strings in the
// stack and the top element. Implements the
// abstraction function.
// d) Write the code for the toString() here

String string = "";

    for(int i = 0; i < items.size(); i++){
        
        string += items;
        return string;
    }
    
    return string;

}



public static void main(String[] args) throws Exception {
    
    
    
    StackOfDistinctStrings stack = new StackOfDistinctStrings();
    
            stack.push("ab");
            stack.push("cd");
            stack.push("ae");
            stack.push("bd");
            
            System.out.println("The stacks elements are: " + stack.toString() + "\n");

            stack.pop();
            System.out.println("Popped top item: " + stack.toString() + "\n");

            stack.push("bc");
            System.out.println("Pushing new element: " + stack.toString() + "\n");

            System.out.println("is repOK true or false?: " + stack.repOK() + "\n"); 
    }
    
}





