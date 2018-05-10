
/**
 * Clase alquiler, simula alquileres de los amarres de un puerto para barcos
 *
 * @author (Fran Alvarez y Carlos Alvarez)
 * @version 1.0
 */
public  class Alquiler
{
    // instance variables 
    private static final int MULTIPLICADOR_ESLORA = 10;
    // Multiplicador fijo de la eslora
    private static final int PRECIO_BASE = 300;
    // Precio base del alquiler en €
    private int numeroDias;
    // Numero de dias del alquiler
    private Barco barco;
    // El barco que realiza el alquiler
    
    /**
     * Constructor de objetos de la clase alquiler
     * @param numeroDias el numero de dias que alquila el amarre
     * @param barco el barco que alquila el amarre
     */
    public Alquiler(int numeroDias, Barco barco)
    {
        this.numeroDias = numeroDias;
        this.barco = barco;
    }

    /**
     *  Devuelve el costo del alquiler
     *  @return el precio a pagar por el alquiler
     */
    public double getPrecio()
    {
        return (numeroDias * (barco.getEslora() * MULTIPLICADOR_ESLORA)) + (PRECIO_BASE * barco.getCoeficienteBernua())  ;
    }
   
    /**
     * Metodo toString de la clase Alquiler
     * @return la informacion completa del alquiler
     */
    @Override
    public String toString()
    {
        return "El barco: " + barco + " ha realizado un alquiler de : " + numeroDias + " dias.";
    }

}
