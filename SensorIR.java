
/**
 * Sensor IR para añadir a los robots.
 * 
 * @author David de la Viuda
 * @version 1.0
 */
public class SensorIR extends Sensor
{
    /**
     * Constructor para objetos de la clase Sensor sin parámetros 
     */
    
    private double min;
    
    public SensorIR()
    {
        this.setDescripcionProducto("Sensor de distancia por infrarojos"); 
    }
    
    public SensorIR(String NombreFabricante, String CodigoFabricante, String CodigoSensor, String DescripcionProducto, double PrecioFabrica, double min )
    {
        super(NombreFabricante, CodigoFabricante, CodigoSensor, DescripcionProducto, PrecioFabrica );
        this.min=min;     
    }
    
    /**
     * Obtención de valor de distancia mínima
     * 
     * @return  max   Obtención de distancia mínima
     */
    public double getMin(){
    return this.min;
    }
    
    /**
     * Ajuste de valor de distancia mínima
     * 
     * @param  min  valor de distancia mínima
     */
    public void setMax(double min){
    this.min=min;
    }
    
    /**
     * Método para imprimir información por pantalla 
     */
    
    public void printInfo(){
    System.out.println("Fabricante: "+this.getNombreFabricante());
    System.out.println("Código del fabricante: "+this.getCodigoFabricante());
    System.out.println("Referencia del sensor: "+this.getCodigoSensor());
    System.out.println("Detalles: "+this.getDescripcionProducto());
    System.out.println("Valor de distancia mínima en centímetros: "+this.getMin());
    System.out.println("Precio: "+this.getPrecioFabrica());
    }
}
