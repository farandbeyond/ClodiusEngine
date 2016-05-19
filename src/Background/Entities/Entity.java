/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background.Entities;

import java.util.Random;

/**
 *
 * @author Connor
 */
public class Entity {
    public static final int 
            STAMINA=0, 
            MAXSTAMINA=1, 
            ENERGY=2, 
            MAXENERGY=3, 
            FORTITUDE = 4, 
            CONSTITUTION=5, 
            TECHNICAL = 6, 
            KNOWLEDGE = 7, 
            SWIFTNESS = 8;
    String name;
    Stat[] allStats;
    /**
     * Creation of a new Entity
     * @param name
     * @param baseStats
     * @param baseGrowths
     * @param randGrowths
     */
    public Entity(String name, int[] baseStats, int[] baseGrowths, int[] randGrowths){
        this.name = name;
        for(int i=0;i<9;i++){
            allStats[i] = new Stat(baseStats[i],baseGrowths[i],randGrowths[i]);
        }
    }
    /**
     * Loading a saved entity
     * @param name
     * @param baseStats
     * @param currentStats
     * @param baseGrowths
     * @param randGrowths
     */
    public Entity(String name, int[] baseStats,int[] currentStats, int baseGrowths[], int[] randGrowths){
        this.name = name;
        for(int i=0;i<9;i++){
            allStats[i] = new Stat(baseStats[i],baseGrowths[i],randGrowths[i],currentStats[i]);
        }
    }
    
    public int getBaseStat(int stat){return allStats[stat].getBaseStat();}
    public int getStat(int stat){return allStats[stat].getCurrentStat();}
    
    public String getName(){return name;}
    private class Stat{
        int baseStat, currentStat;
	int baseGrowth, randGrowth;
        Random rand;
        /**
         * used during character creation
         */
        Stat(int base, int baseGrowth, int randGrowth){
            rand = new Random();
            baseStat = base;
            currentStat = base;
            this.baseGrowth = baseGrowth;
            this.randGrowth = randGrowth;
        }
        /**
         * used when loading a game
         */
        Stat(int base, int bGrowth, int rGrowth, int currentStat){
            baseStat = base;
            baseGrowth = bGrowth;
            randGrowth = rGrowth;
            this.currentStat = currentStat;
            rand = new Random();
        }
        //gets
        public int getBaseStat(){return baseStat;}
        public int getCurrentStat(){return currentStat;}
        public int getBaseGrowth(){return baseGrowth;}
        public int getRandGrowth(){return randGrowth;}
        //sets and stat controlling
        public void levelUp(){
            baseStat+=baseGrowth+rand.nextInt(randGrowth);
        }
        public void setStat(int newStat){baseStat = newStat;}
        public void increaseStat(int increase){currentStat+=increase;}
        public void decreaseStat(int decrease){currentStat-=decrease;}
    }
}
