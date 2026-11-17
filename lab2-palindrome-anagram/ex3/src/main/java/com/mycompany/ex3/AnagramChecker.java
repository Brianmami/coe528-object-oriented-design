/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3;

import java.util.Arrays;

/**
 *
 * @author bmami
 */
public class AnagramChecker {
    
    //Requires: <Strings test1 and test2 must not be null and should be given>
    //Modifies: <the inputs are not necessarily mdiied, however, they are put into new Strings and modified to remove white spaces and uppercases and are sorted>
    //Effects: <if the new strings created from the original inputs are the same once modified, true is returned and they are anagrams, else false is returned and they are not anagrams>
    
    public static boolean areAnagrams (String test1, String test2){
        
        //first word
        String Complete1 = test1.replaceAll(" ", "").toLowerCase(); //remving any white spaces and uercase letters
        
        //second word
        String Complete2 = test2.replaceAll(" ", "").toLowerCase(); //remving any white spaces and uercase letters

        //changing the letters to an array for easier access
        char[] compArray1 = Complete1.toCharArray(); 
        char[] compArray2 = Complete2.toCharArray();

        //sorting the arrays
        Arrays.sort(compArray1);
        Arrays.sort(compArray2);
        
        
       return (Arrays.equals(compArray1, compArray2)); 
    }
    
    public static void main(String[] args) {
        
       if(args.length == 1) {
            if (args[0].equals("1"))
                System.out.println("test 1 is: " + areAnagrams("listen", "silent"));
            else if (args[0].equals("2"))
                System.out.println("test 2 is: " + areAnagrams("Hello", "World"));
            else if (args[0].equals("3"))
                System.out.println("test 3 is: " + areAnagrams("Dormitory", "Dirty room"));
            
        }
    }
}
