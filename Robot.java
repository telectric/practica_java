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
     * @return   CodigoPlataforma código de la plataforma del robot
     */
    public String getCodigoPlataforma(){
    return CodigoPlataforma;
    }
    
    /**
     * Ajuste de código de la plataforma del robot
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
     * 
     * @return  int con valor 0 si no se eliminó ningún sensor y 1 si se eliminó.
     */
    public int delSensor (String CodigoSensor){
        Iterator<Sensor> i = this.listaSensores.iterator();
        int flag = 0;
        while (i.hasNext()) {
            Sensor o = i.next();
            if(o.getCodigoSensor().equals(CodigoSensor)){
                i.remove();
                flag = 1;
            }
        }
        if (flag == 0){
        System.out.println("Ningún sensor ha sido eliminado ya que no hay sensores con el código seleccionado");
        }
        return flag;
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
     * Mostrar lista de sensores
     */
    public void printListaSensores (){
        System.out.println("El código de la plataforma es: "+this.getCodigoPlataforma());
        System.out.println("Los códigos de los sensores que incluye el robot son:");
        for(Sensor temporal: listaSensores){
        System.out.println(temporal.getCodigoSensor());
        }
    }
    
    /**
     * Obtener PVP del robot
     * 
     * @return double devuelve precio venta al público del robot
     */
    public double getPVP (){
        double precio = 0;
        double pvp = 0;
        for(Sensor temporal: listaSensores){
            precio = precio + temporal.getPrecioFabrica();
        }
        pvp = 1.85 * precio;
        return pvp;
    }
    
    /**
     * Mostrar PVP del robot
     * 
     */
    public void printPVP (){
        System.out.println("El precio venta al público del robot es: "+this.getPVP());
    }
    
    
    /**
     * Mostrar información básica de los sensores instalados
     */
    public void printInfoSensores (){
        System.out.println("A continuación se presenta la información básica de los sensores configurados en el robot");
    for(Sensor temporal: listaSensores){
        temporal.printInfo();
        }
    }

}

