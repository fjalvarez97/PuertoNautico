
/**
 * Clase Yate - Subclase de EmbarcacionAMotor, representa una embarcacion a motor 
 * de lujo o yate
 *
 * @author (Fran Alvarez y Carlos Alvarez)
 * @version 1.0
 */
public class Yate extends EmbarcacionAMotor
{
    // instance variables 
    private int numCamarotes;
    // El numero de camarotes del yate
    /**
     * Constructor for objects of class Yate
     * @param matricula la matricula del Yate
     * @param eslora la eslora del Yate
     * @param anoFabricacion el ano de fabricacion del Yate
     * @param propietario el propietario del Yate
     * @param potencia la potencia del Yate
     * @param numCamarotes el numero de camarotes del Yate
     */
    public Yate(String matricula, double eslora, int anoFabricacion, Persona propietario, int potencia, int numCamarotes)
    {
        super(matricula, eslora, anoFabricacion, propietario, potencia);
        this.numCamarotes = numCamarotes;
    }
    
    /**
     * Devuelve el coeficiente bernua de la embarcacion
     * @return el coeficiente bernua
     */
    @Override
    public  int getCoeficienteBernua()
    {
        return super.getCoeficienteBernua() + numCamarotes;
    }
      
    /**
     * Metodo toString de la clase Yate
     * @return la informacion del yate
     */
    @Override
    public String toString()
    {
        return super.toString() + " numero de camarotes: " + numCamarotes; 
    }
}
