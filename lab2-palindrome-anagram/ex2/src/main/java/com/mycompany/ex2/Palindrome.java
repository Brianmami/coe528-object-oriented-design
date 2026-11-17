/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 *
 * @author bmami
 */
public class Palindrome {
    
//Requires: <String a cannot be null>
//Modifies: <not modifing any inputs directly, however, new character variables are made by using the input in the procedure to check if String a is a palindrome>
//Effects: <if the full string is checked to be a palindrome, true is returned and "true" is printed, else false will be returned and "false" is printed>
    
    public static boolean isPalindrome(String a) {
            
        if(a!=null){
            if(a.length()>0){
                for(int i=0;i<a.length();i++){
                    
                    Character firstChar = a.charAt(i); //grabbing the first character
                    Character secondChar = a.charAt(a.length()-1-i);//grabbing the character right before the first
                    
                    if(firstChar.equals(secondChar)){ //comparing the 2 characters to see if they are equal for every iteration of i
                        
                        return true; //if they are equal, return true
                        
                    }
                }                
            }
        }
        return false; //if they are not true, return false
    }
    
    public static void main(String[] args) {
        if(args.length == 1) {
            if (args[0].equals("1"))
                System.out.println(isPalindrome(null));
            else if (args[0].equals("2"))
                System.out.println(isPalindrome(""));
            else if (args[0].equals("3"))
                System.out.println(isPalindrome("deed"));
            else if (args[0].equals("4"))
                System.out.println(isPalindrome("abcd"));
        }
    }
}

 



