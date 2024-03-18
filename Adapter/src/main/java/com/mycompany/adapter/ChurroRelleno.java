/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author edgar
 */
public class ChurroRelleno implements DeliciousFood{
    String food = "Churro Relleno";
    String[] ingredients = {"Flour" , "Water" , "Chocolate"};

    @Override
    public String getChurrito() {
        return food;
    }

    @Override
    public String[] getChurroIngredients() {
        return ingredients;
    }
    
    
    
}
