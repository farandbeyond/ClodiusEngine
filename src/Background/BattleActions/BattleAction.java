/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background.BattleActions;

import Background.Entities.Entity;

/**
 *
 * @author Connor
 */
public abstract class BattleAction {
    public static final int HP=0, MP=1;
    private String name, description;
    private int cost;
    private Entity caster;
    
    public BattleAction(String name, String description, int cost){
        caster = null;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public BattleAction(Entity caster,String name, String description, int cost){
        this.caster = caster;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    
    public abstract String execute(Entity target);
    
    public Entity getCaster(){return caster;}
    public String getName(){return name;}
    public String getDescription(){return description;}
    public int getCost(){return cost;}
    public abstract int getCostType();
}
