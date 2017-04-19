
/**
 * Sensor Ultrasonido para añadir a los robots.
 * 
 * @author David de la Viuda
 * @version 1.0
 */
public class SensorUltrasonido extends Sensor
{
    /**
     * Constructor para objetos de la clase Sensor sin parámetros 
     */
    
    private double max;
    
    public SensorUltrasonido()
    {
        this.setDescripcionProducto("Sensor de distancia por ultrasonido");        
    }
    
    public SensorUltrasonido(String NombreFabricante, String CodigoFabricante, String CodigoSensor, String DescripcionProducto, double PrecioFabrica, double max )
    {
        super(NombreFabricante, CodigoFabricante, CodigoSensor, DescripcionProducto, PrecioFabrica );
        this.max=max;     
    }
    

    /**
     * Obtención de valor de distancia máxima
     * 
     * @return  max   Obtención de distancia máxima
     */
    public double getMax(){
    return this.max;
    }
    
    /**
     * Ajuste de valor de distancia máxima
     * 
     * @param  max  valor de distancia máxima
     */
    public void setMax(double max){
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
    System.out.println("Valor de distancia máxima en metros: "+this.getMax());
    System.out.println("Precio: "+this.getPrecioFabrica());
    }
}
