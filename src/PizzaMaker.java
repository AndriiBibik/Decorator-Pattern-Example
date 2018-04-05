/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fujitsu V6505
 */
public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSouce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingridients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
    }
}
