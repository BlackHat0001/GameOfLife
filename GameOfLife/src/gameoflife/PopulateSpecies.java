/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author danie
 */
public class PopulateSpecies extends SpawnSpecies {
    public static void start(boolean[][] lifeGrid, int fatherCell,ArrayList<CellPosData> PositionData, ArrayList<SpawnSpecies> CellData) {
        Random rand = new Random();
        boolean virus;
        int count = 0;
        boolean cellAlive = true;
        //Starts spawning cells around it
        int spawnDirection = (rand.nextInt(4)+1);
        int Xdata = PositionData.get(fatherCell).getXdata();
        int Ydata = PositionData.get(fatherCell).getYdata();
        String cell = PositionData.get(fatherCell).getSpecies();
        int cellLiveChance = CellData.get(cell).getSurviveChance();
        
        if (spawnDirection == 1) {
            lifeGrid[Xdata][Ydata + 1] = true; 
        } else if (spawnDirection == 2) {
            lifeGrid[Xdata + 1][Ydata] = true;
        } else if (spawnDirection == 3) {
            lifeGrid[Xdata][Ydata - 1] = true;
        } else {
            lifeGrid[Xdata - 1][Ydata] = true;
        }
        while (cellAlive == true) {
            
        }
    }
}
