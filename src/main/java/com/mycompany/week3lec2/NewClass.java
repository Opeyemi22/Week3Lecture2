/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week3lec2;

public class NewClass {
    
    int getSum(int x, int y){
    
    return x + y; 
    }
    
    
    
    
    public static void main(String[]args){
    
        NewClass nc = new NewClass(); 
        int x = 100; 
        int y = 250;
        int sum = nc.getSum(x,y); 
        System.out.println("The Sum Is: " + sum);
    
    
    }
    
    
}
