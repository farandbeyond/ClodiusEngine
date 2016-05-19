/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background.Entities;

/**
 *
 * @author Giulio
 */
public class item {
    String name;
    String desc;
    int heal;
    int itemID;
    item(String name, String desc, int heal, int itemID)
    {
        this.name = name;
        this.desc = desc;
        this.heal = heal;
        this.itemID = itemID;
    }
}
