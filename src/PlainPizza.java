/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fujitsu V6505
 */
public class PlainPizza implements Pizza {

    public PlainPizza(){
        System.out.println("Adding Dough");
    }
    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
    
}
