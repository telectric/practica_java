/**
 * Clase Robot genérico
 *
 * @author David de la Viuda
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Iterator;

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
     * Constructor para objetos de la clase Robot pasando el código de la plataforma
     */
    public Robot(String CodigoPlataforma)
    {
        this.CodigoPlataforma = CodigoPlataforma;
        listaSensores = new ArrayList <Sensor> ();
    }

    /**
     * Obtención de código de la plataforma del robot
     * 
     * @return     Obtención de CodigoPlataforma
     */
    public String getCodigoPlataforma(){
    return CodigoPlataforma;
    }
    
    /**
     * Ajuste de mombre de fabricante
     * 
     * @param  CodigoPlataforma código de la plataforma del robot
     */
    public void setCodigoPlataforma(String CodigoPlataforma){
    this.CodigoPlataforma=CodigoPlataforma;
    }
    
    /**
     * Eliminar sensor al Robot por código de sensor
     *
     * @param  CodigoSensor   Código de sensor
     */
    public void delSensor (String CodigoSensor){
        Iterator<Sensor> i = this.listaSensores.iterator();
        while (i.hasNext()) {
            Sensor o = i.next();
            if(o.getCodigoSensor().equals(CodigoSensor)){
                i.remove();
                break;
            }
        }
    }
    
     /**
     * Añadir sensor al Robot
     *
     * @param  Sensor sensor a añadir
     */
    public void addSensor (Sensor sensor){
        this.listaSensores.add(sensor);
    }

    /**
     * Mostrar información básica de los sensores instalados
     */
    public void printInfoSensores (){
    // Bucle for recorriendo todos los Sensores de la lista
        //for (){
        //    sensor.printInfo();
        //}
    }

}

