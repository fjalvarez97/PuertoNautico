
/**
 * Clase Barco - simula un barco
 *
 * @author (Fran Alvarez y Carlos Alvarez)
 * @version (1.0)
 */
public abstract class Barco
{
    // instance variables
    private String matricula;
    // Matricula del barco
    private double eslora;
    // Eslora del barco
    private int anoFabricacion;
    // Anio de fabricacion del barco
    private Persona propietario;
    // Nombre del propietario del barco

    /**
     * Constructor de objetos de la clase barco
     * @param matricula la matricula del barco
     * @param eslora la eslora del barco
     * @param anoFabricacion el anio de fabricacion del barco
     * @param propietario el propietario del barco
     */
    public Barco(String matricula, double eslora, int anoFabricacion, Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this.propietario = propietario;
    }
    
    /**
     * Devuelve el numero de eslora del barco
     * @return el numero de eslora
     */
    public double getEslora()
    {
        return eslora;
    }
    
    /**
     * Devuelve el coeficiente bernua de la embarcacion
     * @return el coeficiente bernua
     */
    public abstract int getCoeficienteBernua();
    
    /**
     * toString de la clase Barco
     * @return la informacion completa del barco
     */
    @Override
    public String toString()
    {
        return "Matricula: " + matricula + " eslora: " + eslora + " año de fabricacion: " + anoFabricacion + " propietario del barco: " + propietario;
    }  
}

