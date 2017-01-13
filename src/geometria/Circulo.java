package geometria;
/**
 * @author Pablo Ruiz Soria
 */
public class Circulo extends Poligono {
    private int radio;
    private int xCentro;
    private int yCentro;

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * @return the xCentro
     */
    public int getxCentro() {
        return xCentro;
    }

    /**
     * @param xCentro the xCentro to set
     */
    public void setxCentro(int xCentro) {
        this.xCentro = xCentro;
    }

    /**
     * @return the yCentro
     */
    public int getyCentro() {
        return yCentro;
    }

    /**
     * @param yCentro the yCentro to set
     */
    public void setyCentro(int yCentro) {
        this.yCentro = yCentro;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    
}