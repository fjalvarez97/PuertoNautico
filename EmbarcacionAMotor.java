
/**
 * Clase EmbarcacionAMotor - Subclase de barco
 *
 * @author (Fran Alvarez y Carlos Alvarez)
 * @version 1.0
 */
public class EmbarcacionAMotor extends Barco
{
    // instance variables 
    private int potencia;
    // La potencia en CV de la embarcacion
    /**
     * Constructor de objetos de la clase EmbarcacionAMotor
     * @param matricula la matricula de la embarcacion
     * @param eslora la eslora de la embarcacion
     * @param anoFabricacion el anio de fabricacion de la embarcacion
     * @param propietario la Persona que posee la embarcacion
     * @param potencia la potencia de la embarcacion
     */
    public EmbarcacionAMotor(String matricula, double eslora, int anoFabricacion, Persona propietario, int potencia)
    {
        super(matricula,eslora,anoFabricacion,propietario);
        this.potencia = potencia;
    }

    /**
     * Devuelve el coeficiente bernua de la embarcacion
     * @return el coeficiente bernua
     */
    @Override
    public  int getCoeficienteBernua()
    {
        return potencia;
    }
    
    /**
     * Metodo toString de la clase EmbarcacionAMotor
     * @return la informacion de la embarcacion
     */
    @Override
    public String toString()
    {
        return super.toString() + " potencia: " + potencia;
    }
}
