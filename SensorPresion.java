
/**
 * Sensor de presión para añadir a los robots.
 * 
 * @author David de la Viuda
 * @version 1.0
 */
public class SensorPresion extends Sensor
{
    /**
     * Constructor para objetos de la clase Sensor sin parámetros 
     */
    
    private double max;
    
    public SensorPresion()
    {
        this.setDescripcionProducto("Sensor de presión");
    }
    
    public SensorPresion(String NombreFabricante, String CodigoFabricante, String CodigoSensor, String DescripcionProducto, double PrecioFabrica, double max )
    {
        super(NombreFabricante, CodigoFabricante, CodigoSensor, DescripcionProducto, PrecioFabrica );
        this.max=max;     
    }
    
     /**
     * Obtención de valor de deteción máximo
     * 
     * @return  max   Obtención deteción máximo
     */
    public double getMax(){
    return this.max;
    }
    
    /**
     * Ajuste de valor de deteción máximo
     * 
     * @param  max  valor de deteción máximo
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
    System.out.println("Valor de deteción máximo: "+this.getMax());
    System.out.println("Precio: "+this.getPrecioFabrica());
    }
}
