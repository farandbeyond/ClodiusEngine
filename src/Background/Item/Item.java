/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background.Item;

/**
 *
 * @author Giulio
 */
public abstract class Item {
    private final String name, desc;
    private final int itemID, sellingPrice, buyingPrice;
    private int quantity, maxQuatity;
    Item(String name, String desc, int itemID, int sellingPrice, int buyingPrice, int quantity, int maxQuantity){
        this.name = name;
        this.desc = desc;
        this.itemID = itemID;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.quantity = quantity;
        this.maxQuatity = maxQuantity;
    }
    Item(String name, String desc, int itemID, int sellingPrice, int buyingPrice, int quantity){
        this.name = name;
        this.desc = desc;
        this.itemID = itemID;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.quantity = quantity;
        this.maxQuatity = 99;
    }
    public String getName(){
        return this.name;
    }
    public String getDesc(){
        return this.desc;
    }
    public int getID(){
        return this.itemID;
    }
    public int getSellingPrice(){
        return this.sellingPrice;
    }
    public int getBuyingPrice(){
        return this.buyingPrice;
    }
    public void changeQuantity(int num)
    {
        quantity += num;
    }
}   
