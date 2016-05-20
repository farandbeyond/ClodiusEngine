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
public abstract class Spell extends BattleAction{
    
    public Spell(String name, String description, int cost){
        super(name, description, cost);
    }
    public abstract String cast(Entity target);
    @Override
    public String execute(Entity target){
        return cast(target);
    }
}
