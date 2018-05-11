/**
 * Clase Puerto - Simula un puerto con 4 amarres para amarrar barcos
 *
 * @author (Fran Alvarez y Carlos Alvarez)
 * @version 1.0
 */
public class Puerto
{
    // instance variables 
    private Alquiler[] amarres;
    // Coleccion de amarres del puerto
    /**
     * Constructor de objetos de la clase Puerto
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
        for (Alquiler alquiler : amarres){
            alquiler = null;
        }
    }

    /**
     * Muestra los datos referentes al alquiler en caso de que un amarre este ocupado
     */
    public void verEstadoAmarres()
    {
        for (Alquiler alquiler : amarres){
            if (alquiler != null){
                System.out.println(alquiler);
            }
        }
    }

    /**
     * Devuelve el coste del amarre si hay alguno disponible
     * @param numDias el numero de dias del alquiler
     * @param barco el barco que va a alquilar el amarre
     * @return el coste del amarre o -1 en caso de que todos esten ocupados
     */
    public double alquilarAmarre(int numDias, Barco barco) 
    {
        double coste = -1;
        // Inicializamos coste a -1 ya que si no hay amarres disponibles se devuelve este valor
        boolean amarreEncontrado = false;
        for (int i = 0; i<4 && !amarreEncontrado ; i++){
            if(amarres[i] == null){
                amarres[i] = new Alquiler(numDias, barco);
                coste = amarres[i].getPrecio();
                amarreEncontrado = true;
            }
        }
        return coste; 
    }

    /**
     * Comprueba si el amarre indicado corresponde a uno alquilado y lo libera devolviendo el costo de este
     * @param numAmarre el numero del amarre a liquidar
     * @return el costo del alquiler o -1 si no se puede llevar a cabo
     */
    public double liquidarAlquilerAmarre(int numAmarre) 
    {
        double coste = -1;
        // Inicializamos coste a -1 ya que si no se puede llevar a cabo la liquidacion se devuelve este valor
        if (numAmarre < 4 && amarres[numAmarre] != null){
            coste = amarres[numAmarre].getPrecio();
            amarres[numAmarre] = null;
        }
        return coste;
    }

    /**
     * Metodo toString de la clase Puerto
     * @return la informacion del puerto
     */
    @Override
    public String toString()
    {
        String aDevolver = "";
        for (Alquiler alquiler : amarres)
            aDevolver += alquiler;
        return aDevolver;
    }
}
