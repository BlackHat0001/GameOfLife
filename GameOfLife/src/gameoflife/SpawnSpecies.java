/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;
import java.util.Random;
import java.util.*;


/**
 *
 * @author danie
 */
public class SpawnSpecies {

    public static void spawn(String CellSpecies) {
        ArrayList<CellPosData> PositionData = new ArrayList<CellPosData>();
        Random rand = new Random();
        boolean[][] lifeGrid = new boolean[1000][1000];
        int startX = rand.nextInt(1000);
        int startY = rand.nextInt(1000);
        lifeGrid[startX][startY] = true;
        CellPosData node1 = new CellPosData(CellSpecies, 1, startX, startY);
        PositionData.add(node1);
        start(startX, startY, PositionData);
    }


}
