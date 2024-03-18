/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author edgar
 */
public class Churro implements Food{
    //
    String food = "Churro";
    String[] ingredients = {"Flour" , "Water"};
    
    
    @Override
    public String getFood() {
        return food;
    } //Nos regresa la comida

    @Override
    public String[] getIngredients() {
        return ingredients;
    } //Nos regresa los ingredientes
    
}
