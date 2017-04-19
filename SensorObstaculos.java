
/**
 * Sensor detector de obstáculos para añadir a los robots.
 * 
 * @author David de la Viuda
 * @version 1.0
 */
public class SensorObstaculos extends Sensor
{
    /**
     * Constructor para objetos de la clase Sensor sin parámetros 
     */
    
    /**
     * Sensibilidad baja, media o alta
     */
    
    private String sensibilidad;
    
    public SensorObstaculos()
    {
        this.setDescripcionProducto("Sensor detector de obstáculos");
    }
    
    public SensorObstaculos(String NombreFabricante, String CodigoFabricante, String CodigoSensor, String DescripcionProducto, double PrecioFabrica, String sensibilidad )
    {
        super(NombreFabricante, CodigoFabricante, CodigoSensor, DescripcionProducto, PrecioFabrica );
        this.sensibilidad=sensibilidad;     
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
