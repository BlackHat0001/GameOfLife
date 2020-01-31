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
public class CellPosData {
    public String Species;
    public int CellIdentifier;
    public int Xdata;
    public int Ydata;

    public CellPosData(String Species, int CellIdentifier, int Xdata, int Ydata) {
        this.Species = Species;
        this.CellIdentifier = CellIdentifier;
        this.Xdata = Xdata;
        this.Ydata = Ydata;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String Species) {
        this.Species = Species;
    }

    public int getCellIdentifier() {
        return CellIdentifier;
    }

    public void setCellIdentifier(int CellIdentifier) {
        this.CellIdentifier = CellIdentifier;
    }

    public int getXdata() {
        return Xdata;
    }

    public void setXdata(int Xdata) {
        this.Xdata = Xdata;
    }

    public int getYdata() {
        return Ydata;
    }

    public void setYdata(int Ydata) {
        this.Ydata = Ydata;
    }
    
}