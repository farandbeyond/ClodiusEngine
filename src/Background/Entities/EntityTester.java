/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background.Entities;

import Background.BattleActions.Element;

/**
 *
 * @author Connor
 */
public class EntityTester {
    public static void main(String[] args){
        text("-----Test01-----");
        text("Creating an entity");
        int[] stats1 = {20,20,10,10,5,5,9,5,5};
        int[] stats2 = {2,2,4,4,0,1,2,0,1};
        int[] stats3 = {5,5,5,5,1,2,5,2,2};
        Player wilson = new Player("Wilson",stats1,stats2,stats3,Element.FIRE,1,0);
        text("-----Test02-----");
        text("various gets");
        System.out.println(wilson.getStat(Entity.STAMINA)+"/"+wilson.getStat(Entity.MAXSTAMINA)+"HP");
        System.out.println(wilson.getStat(Entity.ENERGY)+"/"+wilson.getStat(Entity.MAXENERGY)+"MP");
        System.out.println(wilson.getStat(Entity.FORTITUDE)+" STR");
        System.out.println(wilson.getStat(Entity.SWIFTNESS)+" DEX");
        System.out.println(wilson.getStat(Entity.CONSTITUTION)+" CON");
        System.out.println(wilson.getStat(Entity.TECHNICAL)+" INT");
        System.out.println(wilson.getStat(Entity.KNOWLEDGE)+" RES");
        System.out.println(wilson.getName());
        System.out.println(wilson.getElement());
        text("-----Test03-----");
        text("Damage and Healing");
        wilson.damage(9);
        System.out.println(wilson.getStat(Entity.STAMINA)+"/"+wilson.getStat(Entity.MAXSTAMINA)+"HP");
        wilson.heal(11);
        System.out.println(wilson.getStat(Entity.STAMINA)+"/"+wilson.getStat(Entity.MAXSTAMINA)+"HP");
        wilson.damage(25);
        System.out.println(wilson.getStat(Entity.STAMINA)+"/"+wilson.getStat(Entity.MAXSTAMINA)+"HP");
        System.out.println(wilson.isDead());
        wilson.heal(15);
        System.out.println(wilson.getStat(Entity.STAMINA)+"/"+wilson.getStat(Entity.MAXSTAMINA)+"HP");
        System.out.println(wilson.isDead());
        wilson.raise(15);
        System.out.println(wilson.getStat(Entity.STAMINA)+"/"+wilson.getStat(Entity.MAXSTAMINA)+"HP");
        System.out.println(wilson.isDead());
        text("-----Test04-----");
        text("Damage and Healing");
        
    }
    public static void text(String t){
        System.out.println(t);
    }
}
