/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fujitsu V6505
 */
public class TomatoSouce extends ToppingDecorator {
    
    public TomatoSouce(Pizza newPizza){
        super(newPizza);
        
        System.out.println("Adding Tomato Souce");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Souce";
    }
    
    public double getCost() {
        return tempPizza.getCost() + .40;
    } 
}
