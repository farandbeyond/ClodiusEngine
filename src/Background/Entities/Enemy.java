/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background.Entities;

/**
 *
 * @author Connor
 */
public class Enemy extends Entity{
    int xpDropped, goldDropped;
    public Enemy(String name, int[] baseStats, int[] baseStatGrowths, int[] rollStatGrowths, int element,int xpDropped,int goldDropped){
        super(name,baseStats,baseStatGrowths,rollStatGrowths,element);
        this.xpDropped=xpDropped;
        this.goldDropped=goldDropped;
    }
    public int getXp(){return xpDropped;}
    public int getGold(){return goldDropped;}
}
