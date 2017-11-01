
package frogger;

public class SafeZone extends Lane{

    public SafeZone(int coordenadaY, String nombreArchivoImagen) {
        super(coordenadaY, nombreArchivoImagen);
    }

    @Override
    public void moverY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
