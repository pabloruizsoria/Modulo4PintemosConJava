package geometria;
/**
 * @author Pablo Ruiz Soria
 */
public class Cuadrado extends Poligono {
    private int longitudLado;
    private int xOrigen;
    private int yOrigen;
    
    /**
     * @return the longitudLado
     */
    public int getLongitudLado() {
        return longitudLado;
    }

    /**
     * @param longitudLado the longitudLado to set
     */
    public void setLongitudLado(int longitudLado) {
        this.longitudLado = longitudLado;
    }

    /**
     * @return the xOrigen
     */
    public int getxOrigen() {
        return xOrigen;
    }

    /**
     * @param xOrigen the xOrigen to set
     */
    public void setxOrigen(int xOrigen) {
        this.xOrigen = xOrigen;
    }

    /**
     * @return the yOrigen
     */
    public int getyOrigen() {
        return yOrigen;
    }

    /**
     * @param yOrigen the yOrigen to set
     */
    public void setyOrigen(int yOrigen) {
        this.yOrigen = yOrigen;
    }
    
    
    @Override
    public double calcularArea() {
        return longitudLado * longitudLado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * longitudLado;
    }
    
}