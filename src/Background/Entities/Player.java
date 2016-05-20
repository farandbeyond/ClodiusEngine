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
    
    //Weapon weapon;
    //Armor armor;
    //Boots boots;
    
    int level, exp, expRequiredToLevel;
    
    public Player(String name, int[] baseStats, int[] baseStatGrowths, int[] rollStatGrowths, int element,int level, int exp){
        super(name,baseStats,baseStatGrowths,rollStatGrowths,element);
    }
    //level controlling
    public void xpToLevel(){
        //doing this for now. subject to change later
        //triangular example
        expRequiredToLevel=0;
        for(int i=1;i<level+1;i++){
            for(int w=1;w<i+1;w++){
                expRequiredToLevel+=100*w;
            }
        }
    }
    public void giveExp(int expGained){
        exp+=expGained;
        checkForLevelUp();
    }
    public String checkForLevelUp(){
        int oldLevel = level;
        while(exp>=expRequiredToLevel){
            level++;
            //System.out.println("Level Up");
            levelUp();
            xpToLevel();
        }
        if(oldLevel!=level){
            return "Level up! "+name+" Reached level "+level;
        }else{
            return "";
        }
        
    }
    public void levelUp(){
        for(int i=0;i<9;i++){
            alterStat(i).levelUp();
        }
    }
    
}
