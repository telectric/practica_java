/**
 * Clase Robot genérico
 * 
 * @author David de la Viuda
 * @version 1.0
 */
import java.util.ArrayList;

public class Robot
{
    private String CodigoPlataforma;
    private ArrayList <Sensor> listaSensores;
     /**
     * Constructor para objetos de la clase Robot sin parámetros
     */
    public Robot()
    {
        listaSensores = new ArrayList <Sensor> ();
    }

     /**
     * Constructor para objetos de la clase Robot
     */
    public Robot(String CodigoPlataforma)
    {
        this.CodigoPlataforma = CodigoPlataforma;
        listaSensores = new ArrayList <Sensor> ();
    }
    
    /**
     * Añadir sensor al Robot por código de sensor
     * 
     * @param  CodigoSensor   Código de sensor
     */
    public void addSensor (String CodigoSensor){
        Sensor sensor = new Sensor ();
        sensor.setCodigoSensor(CodigoSensor); //a cambiar por buscador de sensores por código
        this.listaSensores.add(sensor);
    }
    
}
