
/**
 * Sensor genérico para añadir a los robots.
 * 
 * @author David de la Viuda
 * @version 1.0
 */
public class Sensor
{
    private String NombreFabricante;
    private String CodigoFabricante;
    private String CodigoSensor;
    private String DescripcionProducto;
    private double PrecioFabrica;

    /**
     * Constructor para objetos de la clase Sensor sin parámetros
     */
    public Sensor()
    {
        // initialise instance variables (Más elegante constructor sin parametros sin código interno)
        // NombreFabricante="nombre";
        // CodigoFabricante="código de fabricante";
        // CodigoSensor="código de sensor";
        // DescripcionProducto="Descripción del producto";
        // PrecioFabrica=0.0;
    }
    
    /**
     * Constructor para objetos de la clase Sensor con parámetros
     */
    public Sensor(String NombreFabricante, String CodigoFabricante, String CodigoSensor, String DescripcionProducto, double PrecioFabrica )
    {
        // initialise instance variables
        this.NombreFabricante=NombreFabricante;
        this.CodigoFabricante=CodigoFabricante;
        this.CodigoSensor=CodigoSensor;
        this.DescripcionProducto=DescripcionProducto;
        this.PrecioFabrica=PrecioFabrica;
    }

    /**
     * Obtención de Nombre de fabricante
     * 
     * @return     Obtención NombreFabricante
     */
    public String getNombreFabricante(){
    return NombreFabricante;
    }
    
    /**
     * Ajuste de mombre de fabricante
     * 
     * @param  NombreFabricante   Nombre del fabricante
     */
    public void setNombreFabricante(String NombreFabricante){
    this.NombreFabricante=NombreFabricante;
    }
    
    /**
     * Obtención de código del fabricante
     * 
     * @return     Obtención CodigoFabricante
     */
    public String getCodigoFabricante(){
    return CodigoFabricante;
    }
    
    /**
     * Ajuste de código de fabricante
     * 
     * @param  CodigoFabricante   código de fabricante
     */
    public void setCodigoFabricante(String CodigoFabricante){
    this.CodigoFabricante=CodigoFabricante;
    }
    
    /**
     * Obtención de Código del sensor
     * 
     * @return     Obtención codigo de sensor
     */
    public String getCodigoSensor(){
    return CodigoSensor;
    }
    
    /**
     * Ajuste de código de sensor
     * 
     * @param  CodigoSensor   Código de sensor
     */
    public void setCodigoSensor(String CodigoSensor){
    this.CodigoSensor=CodigoSensor;
    }
    
    /**
     * Obtención de descripción de producto
     * 
     * @return     Obtención de descripción de producto
     */
    public String getDescripcionProducto(){
    return DescripcionProducto;
    }
    
    /**
     * Ajuste de la descripción del producto
     * 
     * @param  DescripcionProducto   Descripción del producto
     */
    public void setDescripcionProducto(String DescripcionProducto){
    this.DescripcionProducto=DescripcionProducto;
    }
    
    /**
     * Obtención del precio de fábrica
     * 
     * @return     Obtención de precio de fábrica
     */
    public double getPrecioFabrica(){
    return PrecioFabrica;
    }
    
    /**
     * Ajuste de precio de fábrica
     * 
     * @param  PrecioFabrica   Precio de fábrica
     */
    public void setPrecioFabrica(double PrecioFabrica){
    PrecioFabrica=PrecioFabrica;
    }
    
     /**
     * Método para imprimir información por pantalla 
     */
    public void printInfo(){
    System.out.println("Fabricante: "+NombreFabricante+"\n\nCódigo del fabricante: "+CodigoFabricante+" \n\nReferencia del sensor: "+CodigoSensor+"\n\nDetalles: "+DescripcionProducto+"\n\nPrecio: "+PrecioFabrica+"\n");
    }
}
