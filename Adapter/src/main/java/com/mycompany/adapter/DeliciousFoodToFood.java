/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author edgar
 */
public class DeliciousFoodToFood implements Food{
    //ADAPTER
    public static DeliciousFood deliciousFood;
    
    DeliciousFoodToFood(DeliciousFood df){
        deliciousFood = df;
    }
    
    @Override
    public String getFood() {
        return deliciousFood.getChurrito();
    }

    @Override
    public String[] getIngredients() {
        return deliciousFood.getChurroIngredients();    
    }
    
}
