/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week3lec2;

// Task 1 
public class NewClass {
    
    int getStrLngth(String name){
    
    int x = name.length(); 
     
    return x; 
    }
   
    
    
    public static void main(String[]args){
    
        NewClass nc = new NewClass(); 
        String str = ("Opeyemi");
        int t = nc.getStrLngth(str);
        System.out.println("The Number Of Characters There Are: " + t);
    
    
    }
    
    
}
