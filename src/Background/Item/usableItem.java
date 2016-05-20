/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background.Item;

import Background.Entities.Player;

/**
 *
 * @author Giulio
 */
public abstract class usableItem extends Item{
    public usableItem(String name, String desc, int itemID, int sellingPrice, int buyingPrice, int quantity, int maxQuantity){
        super(name, desc, itemID, sellingPrice, buyingPrice, quantity, maxQuantity);
    }
    public usableItem(String name, String desc, int itemID, int sellingPrice, int buyingPrice, int quantity){
        super(name, desc, itemID, sellingPrice, buyingPrice, quantity);
    }
    public abstract void useItem(Player target); //This should do nothing because I should never use a "usable item"
}
