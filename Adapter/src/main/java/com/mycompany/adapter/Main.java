/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author edgar
 */
public class Main {
    //Client
    
    public static void main(String[] args){
        Churro simpleChurro = new Churro();
        ChurroRelleno churroRelleno = new ChurroRelleno();
        
        ChurrosFactory churroFactory = new ChurrosFactory();
        churroFactory.prepareChurro(simpleChurro);
        
        
        //Adapter
        DeliciousFoodToFood churroAdapter = new DeliciousFoodToFood(churroRelleno);
        churroFactory.prepareChurro(churroAdapter);
    }
    
    // From:https://www.youtube.com/watch?v=_mU6YAAACcI

}
