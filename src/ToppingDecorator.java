/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fujitsu V6505
 */
abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;
    
    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }
    
    public String getDescription() {
        return tempPizza.getDescription();
    }
    
    public double getCost() {
        return tempPizza.getCost();
    }
}
