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
public class Entity {
    String name;
    Stat Strength;
    public Entity(String name, int strength){
        this.name = name;
        Strength = new Stat(strength,"Strength Stat, used for weapon damage");
    }
    public String getName(){return name;}
    private class Stat{
        int value;
        String description;
        Stat(int value, String description){
            this.value = value;
            this.description = description;
        }
        public int getStat(){return value;}
        public String getDesc(){return description;}
    }
}
