/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

/**
 *
 * @author danie
 */
public class Species {
    public String Name;
    public int SurviveChance;
    public int ReproduceRate;
    public int Immunity;
    

    public Species(String Name, int SurviveChance, int ReproduceRate, int Immunity) {
        this.Name = Name;
        this.SurviveChance = SurviveChance;
        this.ReproduceRate = ReproduceRate;
        this.Immunity = Immunity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSurviveChance() {
        return SurviveChance;
    }

    public void setSurviveChance(int SurviveChance) {
        this.SurviveChance = SurviveChance;
    }

    public int getReproduceRate() {
        return ReproduceRate;
    }

    public void setReproduceRate(int ReproduceRate) {
        this.ReproduceRate = ReproduceRate;
    }

    public int getImmunity() {
        return Immunity;
    }

    public void setImmunity(int Immunity) {
        this.Immunity = Immunity;
    }
    
    
}
