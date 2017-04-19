
/**
 * Sensor LDR para añadir a los robots.
 * 
 * @author David de la Viuda
 * @version 1.0
 */
public class SensorLDR extends Sensor
{
    /**
     * Constructor para objetos de la clase Sensor sin parámetros 
     */
    private String sensibilidad;  
    
    public SensorLDR()
    {
        this.setDescripcionProducto("Sensor LDR");
    }
    
    /**
     * Obtención de sensibilidad
     * 
     * @return  sensibilidad   Obtención sensibilidad
     */
    public String getSensibilidad(){
    return this.sensibilidad;
    }
    
    /**
     * Ajuste de sensibilidad
     * 
     * @param  sensibilidad   Sensibilidad del sensor
     */
    public void setSensibilidad(String sensibilidad){
    this.sensibilidad=sensibilidad;
    }
    
     /**
     * Método para imprimir información por pantalla 
     */
    public void printInfo(){
    System.out.println("Fabricante: "+this.getNombreFabricante());
    System.out.println("Código del fabricante: "+this.getCodigoFabricante());
    System.out.println("Referencia del sensor: "+this.getCodigoSensor());
    System.out.println("Detalles: "+this.getDescripcionProducto());
    System.out.println("Sensibilidad: "+this.getSensibilidad());
    System.out.println("Precio: "+this.getPrecioFabrica());
    }
    
}
