
/**
 * Clase Velero - Subclase de barco, simula un barco velero
 *
 * @author (Fran Alvarez y Carlos Alvarez)
 * @version 1.0
 */
public class Velero extends Barco
{
    // instance variables
    private int numeroMastiles;
    // El numero de mastiles del velero
    /**
     * Constructor de objetos de la clase Velero
     * @param matricula la matricula del Velero
     * @param eslora la eslora del Velero
     * @param anoFabricacion el ano de fabricacion del Velero
     * @param propietario el propietario del Velero
     * @param numeroMastiles el numero de mastiles del Velero
     */
    public Velero(String matricula, double eslora, int anoFabricacion, Persona propietario, int numeroMastiles)
    {
        super(matricula,eslora,anoFabricacion,propietario);
        this.numeroMastiles = numeroMastiles;
    }
     
    /**
     * Devuelve el coeficiente bernua de la embarcacion
     * @return el coeficiente bernua
     */
    @Override
    public  int getCoeficienteBernua()
    {
        return numeroMastiles;
    }
    
    /**
     * Metodo toString de la clase Velero
     * @return la informacion del velero
     */
    @Override
    public String toString()
    {
        return super.toString() + " numero de mastiles: " + numeroMastiles;
    }
}
