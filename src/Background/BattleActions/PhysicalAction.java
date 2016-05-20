/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background.BattleActions;

import Background.Entities.Entity;
import java.util.Random;

/**
 *
 * @author Connor
 */
public class PhysicalAction extends BattleAction{
    int baseDamage, rollDamage;
    int element;
    Random rand;
    Entity caster;
    public PhysicalAction(String name, String description, int cost, int baseDamage, int rollDamage, int element){
        super(name,description,cost);
        this.baseDamage=baseDamage;
        this.rollDamage=rollDamage;
        this.element=element;
    }
    @Override
    public String execute(Entity target) {
        int damage = 0;
        //implement getWeaponDamage here
        damage+=baseDamage+rand.nextInt(rollDamage);
        //get entity element here
        damage*=Element.elementHandler(element, element);
        //damage the entity here
        return damage+"";
    }
    public int getCostType(){
        return HP;
    }
}
