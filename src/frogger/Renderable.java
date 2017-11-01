/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public abstract class Renderable {
    public Renderable(int coordenadaY, String nombreArchivoImagen) {
        this.coordenadaY = coordenadaY;
        this.nombreArchivoImagen = nombreArchivoImagen;
        this.imagenes = new ArrayList<>(0);
    }
    
    public abstract void moverY();
    
    protected int coordenadaY;
    protected String nombreArchivoImagen;
    protected ArrayList<Image> imagenes;
}
