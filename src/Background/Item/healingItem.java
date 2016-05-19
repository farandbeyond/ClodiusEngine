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
public class healingItem extends usableItem{
    private final int amountHealed, potionType;
    private final boolean canRevive;
    healingItem(String name, String desc, int itemID, int sellingPrice, int buyingPrice, int quantity, int maxQuantity, int amountHealed, int potionType, boolean canRevive){
        super(name, desc, itemID, sellingPrice, buyingPrice, quantity, maxQuantity);
        this.amountHealed = amountHealed;
        this.potionType = potionType;   //Potion type 0 for HP, potion type 1 for MP, potion type 2 for HP and MP
        this.canRevive = canRevive;
    }
    healingItem(String name, String desc, int itemID, int sellingPrice, int buyingPrice, int quantity, int amountHealed, int potionType, boolean canRevive){
        super(name, desc, itemID, sellingPrice, buyingPrice, quantity);
        this.amountHealed = amountHealed;
        this.potionType = potionType;   //Potion type 0 for HP, potion type 1 for MP, potion type 2 for HP and MP
        this.canRevive = canRevive;
    }
    public void useItem(Player target){
        if (target.isDead() && !canRevive){
            //exit the use item thingy
        }
        else{
            if (potionType == 0){
                if (canRevive){
                    target.raise(amountHealed);
                }
                else{
                    target.heal(amountHealed);
                }
            }
            else if (potionType == 1){
                target.restoreEnergy(amountHealed);
            }
            else if (potionType == 2){
                target.heal(amountHealed);
                target.restoreEnergy(amountHealed);
            }
        }
    }
}
