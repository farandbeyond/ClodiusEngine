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
    public Entity(String name){
        this.name = name;
    }
    public String getName(){return name;}
    private class stat{
        int value;
        String description;
        stat(int value, String description){
            this.value = value;
            this.description = description;
        }
        public int getStat(){return value;}
        public String getDesc(){return description;}
    }
}