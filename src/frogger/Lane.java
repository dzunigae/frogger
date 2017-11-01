/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public abstract class Lane extends Renderable{
    
    public Lane(int coordenadaY, String nombreArchivoImagen) {
        super(coordenadaY, nombreArchivoImagen);
        this.objetos = new ArrayList<>(0);
    }
    
    protected ArrayList<Thing> objetos;
}
