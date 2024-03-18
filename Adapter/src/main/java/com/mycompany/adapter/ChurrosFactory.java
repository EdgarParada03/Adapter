/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author edgar
 */
public class ChurrosFactory {
    void prepareChurro(Food food){
        System.out.println("Starting process");
        System.out.println("Mixing");
        for(int i = 0; i < food.getIngredients().length; i++){
            System.out.println(food.getIngredients()[i] + " ");
        }
        
        System.out.println("\n" + food.getFood() + " prepared");
        System.out.println("---------------------------------");
    }
}
