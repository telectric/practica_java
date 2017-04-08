
/**
 * Clase para ejecutar main()
 * 
 * @author David de la Viuda
 * @version 1.0
 */
public class Lanzador
{
    /**
     * Constructor de objetos de la clase Lanzador
     */
    public Lanzador()
    {
    }

    /**
     * Método main()
     * 
     * @param  args[] Argumentos 
     */
    public static void main(String args[])
    {
        Sensor sensor1 = new Sensor("Amtel", "AMT", "AMTINF01", "Sensor de infrarojos", 15.99 );
        sensor1.printInfo();
    }
}
