/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Cristian
 */
public abstract class Renderable {
    public Renderable(int coordenadaY, String nombreArchivoImagen) {
        this.coordenadaY = coordenadaY;
        this.nombreArchivoImagen = nombreArchivoImagen;
        this.imagen = null;
    }
    
    public abstract void moverY();
    
    public void cargarImagen(){
        ImageIcon iconoImagen = new ImageIcon(this.nombreArchivoImagen);
        this.imagen = iconoImagen.getImage();
    }
    
    public int getCoordenadaY(){
        return this.coordenadaY;
    }
    
    public Image getImagen(){
        return this.imagen;
    }
    
    protected int coordenadaY;
    protected String nombreArchivoImagen;
    protected Image imagen;
}
