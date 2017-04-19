
/**
 * Sensor CCD para añadir a los robots.
 *
 * @author David de la Viuda
 * @version 1.0
 */
public class SensorCCD extends Sensor
{
    /**
     * Constructor para objetos de la clase Sensor sin parámetros 
     */
    
    private int max;
    
    public SensorCCD()
    {
        this.setDescripcionProducto("Sensor CCD para captura de imágenes");
    }
    
    public SensorCCD(String NombreFabricante, String CodigoFabricante, String CodigoSensor, String DescripcionProducto, double PrecioFabrica, int max )
    {
        super(NombreFabricante, CodigoFabricante, CodigoSensor, DescripcionProducto, PrecioFabrica );
        this.max=max;     
    }
    
    /**
     * Obtención de valor de resolución máxima en puntos por pulgada
     * 
     * @return  max   Obtención de resolución máxima en puntos por pulgada
     */
    public int getMax(){
    return this.max;
    }
    
    /**
     * Ajuste de valor de resolución máxima en puntos por pulgada
     * 
     * @param  max  valor de resolución máxima en puntos por pulgada
     */
    public void setMax(int max){
    this.max=max;
    }
    
    /**
     * Método para imprimir información por pantalla 
     */
    
    public void printInfo(){
    System.out.println("Fabricante: "+this.getNombreFabricante());
    System.out.println("Código del fabricante: "+this.getCodigoFabricante());
    System.out.println("Referencia del sensor: "+this.getCodigoSensor());
    System.out.println("Detalles: "+this.getDescripcionProducto());
    System.out.println("Valor de resolución máxima en puntos por pulgada: "+this.getMax());
    System.out.println("Precio: "+this.getPrecioFabrica());
    }
}
