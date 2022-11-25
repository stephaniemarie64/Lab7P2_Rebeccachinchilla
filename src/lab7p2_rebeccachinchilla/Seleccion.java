/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_rebeccachinchilla;
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class Seleccion {
       /*
    Contarán con un nombre, Partidos Jugados, Partidos Ganados (PG), Partidos Empatados (PE),  Partidos Perdidos (PP),
    Goles a Favor (GF), Goles en Contra (GC), Diferencia de Goles (Dif) y un  ArrayList que almacenará datos de tipo 
    Jugador con un size máximo de 26. 
    */
    
   // Jugador J = new Jugador();
    String Nombre; 
    int PJ;
    int PG;
    int PE;
    int GF;
    int GC;
    int dif; 
    Jugador[] ArrayJugadores;

    public Seleccion(String Nombre, int PJ, int PG, int PE, int GF, int GC, int dif) {
        this.Nombre = Nombre;
        this.PJ = PJ;
        this.PG = PG;
        this.PE = PE;
        this.GF = GF;
        this.GC = GC;
        this.dif = dif;
        ArrayJugadores = new Jugador[26];
    }

    
    
    
    
    
    //GETTERS
    
    
    public String getNombre() {
        return Nombre;
    }

    public int getPJ() {
        return PJ;
    }

    public int getPG() {
        return PG;
    }

    public int getPE() {
        return PE;
    }

    public int getGF() {
        return GF;
    }

    public int getGC() {
        return GC;
    }

    public int getDif() {
        return dif;
    }

    public Jugador[] getArrayJugadores() {
        return ArrayJugadores;
    }

    
    //SETTERS
    
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPJ(int PJ) {
        this.PJ = PJ;
    }

    public void setPG(int PG) {
        this.PG = PG;
    }

    public void setPE(int PE) {
        this.PE = PE;
    }

    public void setGF(int GF) {
        this.GF = GF;
    }

    public void setGC(int GC) {
        this.GC = GC;
    }

    public void setDif(int dif) {
        this.dif = dif;
    }

    public void setArrayJugadores(Jugador[] ArrayJugadores) {
        this.ArrayJugadores = ArrayJugadores;
    }
    
    
   
    
    
}
