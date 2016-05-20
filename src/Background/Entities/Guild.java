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
public class Guild {
    int size;
    Player[] guild;
    public Guild(int size){
        this.size = size;
        guild = new Player[size];
    }
    public void add(Player p){
        for(int i=0;i<size;i++){
            if(guild[i]==null){
                guild[i]=p;
                return;
            }
        }
    }
    public void remove(int i){
        guild[i]=null;
        sort();
    }
    public void sort(){
        for(int i=0;i<size-1;i++){
            if(guild[i]==null){
                guild[i]=guild[i+1];
                guild[i+1]=null;
                guild[i].setGuildPosition(i);
            }
        }
        if(guild[size-2]==guild[size-1])
            guild[size-1]=null;
    }
    
    public Player getMember(int i){
        return guild[i];
    }
}
