
package frogger;


public abstract class Mobile extends Thing {
    protected int velocidad;
    protected boolean seIntersecta;

    public Mobile(int coordenadaY, int coordenadaX, String nombreArchivoImagen, int velocidad, boolean seIntersecta) {
        super(coordenadaY, coordenadaX, nombreArchivoImagen);
        this.velocidad=velocidad;
        this.seIntersecta=seIntersecta;
    }
    
    public abstract void moverX();

    public int getVelocidad() {
        return velocidad;
    }

    public boolean isSeIntersecta() {
        return seIntersecta;
    }
    
    
}
