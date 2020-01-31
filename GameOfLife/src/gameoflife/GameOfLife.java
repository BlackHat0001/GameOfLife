/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;
import java.util.*;
/**
 *
 * @author danie
 */
public class GameOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        //Cell Details
        System.out.println("Enter Species Name");
        String cellName = input.next();
        System.out.println("Enter Survive Chance Percentage (1 to 100)");
        int cellChance = input.nextInt();
        System.out.println("Enter Spawn Rate (Seconds)");
        int cellSpawnRate = input.nextInt();
        System.out.println("Enter Virus Survival Change Percentage (1 to 100)");
        int cellVirusChance = input.nextInt();
        ArrayList<Species> CellData = new ArrayList<Species>();
        Species Cell = new Species(cellName, cellChance, cellSpawnRate, cellVirusChance);
        CellData.add(Cell);
    }
    public static void start(int x,int y) {
        Random rand = new Random();
        boolean virus;
        //Starts spawning cells around it
        while(true) {
            
        }
    }
    
}
