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
public class Player extends Entity{
    
    public Player(String name, int[] baseStats, int[] baseStatGrowths, int[] rollStatGrowths, int element){
        super(name,baseStats,baseStatGrowths,rollStatGrowths,element);
    }
}
