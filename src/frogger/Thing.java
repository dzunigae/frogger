/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.awt.Rectangle;

/**
 *
 * @author Cristian
 */
public abstract class Thing extends Renderable{
    
    public Thing(int coordenadaY, int coordenadaX, String nombreArchivoImagen){
        super(coordenadaY, nombreArchivoImagen);
        this.coordenadaX = coordenadaX;
    }
    
    public int getCoordenadaX(){
        return this.coordenadaX;
    }
    
    protected Rectangle areaDeEfecto;
    protected int coordenadaX;
}
