/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background.Entities;

import Background.BattleActions.Element;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Connor
 */
public class EntityLoader {
    
    public static Entity entityLoader(int entityID){
        try{
            String contents = "";
            String filePath = String.format("EnemyInfo/enemyInfo.txt",entityID);
            InputStream input = new FileInputStream(filePath);
            InputStreamReader inputReader = new InputStreamReader(input);
            BufferedReader fileReader = new BufferedReader(inputReader);
            String line;
            String[] splitLine = {"",""};
            
            do{
                line=fileReader.readLine();
                splitLine = line.split(";");
            }while(Integer.parseInt(splitLine[0])!=entityID);
            contents+=splitLine[1]+":";
            
            for(int i=0;i<4;i++){
                line=fileReader.readLine();
                contents+=line+":";
            }
            
            fileReader.close();
            String[] entityLines = contents.split(":");
            String name = entityLines[0];
            String[] statInfo = {entityLines[1],entityLines[2],entityLines[3],entityLines[4]};
            String[][] statNumbers = {statInfo[0].split(" "),statInfo[1].split(" "),statInfo[2].split(" "),statInfo[3].split(" ")};
            int[][] statsArray = new int[3][9];
            for(int i=0;i<3;i++){
                for(int e=0;e<9;e++){
                    System.out.println(i+""+e);
                    statsArray[i][e] = Integer.parseInt(statNumbers[i][e]);
                    
                }
            }
            int xp = Integer.parseInt(statNumbers[3][0]);
            int gold = Integer.parseInt(statNumbers[3][1]);
            int element = Integer.parseInt(statNumbers[3][2]);
            System.out.println(Element.getElementName(element));
            System.out.println(xp+"exp/"+gold+"gold");
            return new Entity(name, statsArray[0],statsArray[1],statsArray[2],element);
            //MapTile[][] mapToLoad = new MapTile[tileIDs.length][tileIDs[0].length];
            //for(int i=0;i<tileIDs.length;i++){
            //    for(int p=0;p<tileIDs[0].length;p++){
            //        mapToLoad[i][p] = new MapTile(tileIDs[i][p]-48);
            //        //System.out.print(tileIDs[i][p]+":");
            //    }
            //    //System.out.print("\n");
                
            //}
            //return mapToLoad;
        }catch(IOException e){
            System.out.printf("Error loading Entity %d: %s",entityID,e);
            return null;
        }
    }
    public static void main(String[] args){
        Entity wilson = entityLoader(1);
        System.out.println(wilson.getName());
        System.out.println(wilson.getStat(0));
        System.out.println(wilson.getStat(5));
    }
}
