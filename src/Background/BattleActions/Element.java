/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background.BattleActions;

/**
 *
 * @author Connor
 */
public class Element {
    public static final int FIRE=0,EARTH=1,LIGHTNING=2,WATER=3,NEUTRAL=4;
    public static double elementHandler(int attackingElement, int defendingElement){
        //case 1: either element is neutral, or both elements are the same. result: 1x damage
        if(attackingElement==NEUTRAL||defendingElement==NEUTRAL||attackingElement==defendingElement){
            return 1.0;
        }
        //case 2: if the element follows the square. (eg water attacks fire)  result: 2x damage
        if(attackingElement-defendingElement==3||attackingElement-defendingElement==-1){
            return 2.0;
        }
        //case 3: if the element goes against the square (eg fire attacks water) result: 0.5x damage
        if(attackingElement-defendingElement==1||attackingElement-defendingElement==-3){
            return 0.5;
        }
        //case 4: anything else not caught
        return 1.0;
    }
    public static String getElementName(int element){
        switch(element){
            case FIRE:return "Fire";
            case EARTH:return "Earth";
            case LIGHTNING:return "Lightning";
            case WATER:return "Water";
            case NEUTRAL:return "Neutral";
        }
        return "Not an Element";
    }
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int e=0;e<5;e++){
                System.out.printf("%s attacking %s\n",getElementName(i),getElementName(e));
                System.out.printf("The damage multiplier is %f\n\n",elementHandler(i,e));
            }
        }
    }
}
