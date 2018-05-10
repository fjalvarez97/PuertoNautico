/**
 * Clase Persona - simula una persona propietaria de un barco
 *
 * @author (Fran Alvarez y Carlos alvarez)
 * @version 1.0
 */
public class Persona
{
    // instance variables
    private String nombre;
    // El nombre de la persona
    private String dni;
    // El dni de la persona
    /**
     * Constructor de objetos de la clase Persona
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;       
    }

    /**
     * Metodo toString de la clase Persona
     * @return los datos de la persona nombre + dni
     */
    @Override
    public String toString()
    {
        return "Nombre: " + nombre + " DNI: " + dni;
    }
}
