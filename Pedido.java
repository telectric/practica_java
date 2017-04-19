
/**
 * Clase Pedido genérica
 * 
 * @author David de la Viuda
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class Pedido
{
    private String idPedido;
    private ArrayList <Robot> listaRobots;
    private String idCliente;
    private Calendar fecha;
    private String address;
    /**
     * Constructor para objetos de la clase Pedido sin parámetros
     */
    public Pedido()
    {
    listaRobots = new ArrayList <Robot> ();
    fecha = Calendar.getInstance();
    }
    
    /**
     * Obtención del identificador del pedido
     * 
     * @return   idPedido  identificador del pedido
     */
    public String getIdPedido(){
    return this.idPedido;
    }
    
    /**
     * Ajuste del identificador del pedido
     * 
     * @param  idPedido identificador del pedido
     */
    public void setIdPedido(String idPedido){
    this.idPedido=idPedido;
    }
    
     /**
     * Obtención del identificador del cliente
     * 
     * @return   idCliente  identificador del cliente
     */
    public String getIdCliente(){
    return this.idCliente;
    }
    
    /**
     * Ajuste del identificador del cliente
     * 
     * @param  idCliente identificador del cliente
     */
    public void setIdCliente(String idCliente){
    this.idCliente=idCliente;
    }
    
    /**
     * Obtención del dirección del pedido
     * 
     * @return   address  dirección del pedido
     */
    public String getAddress(){
    return this.address;
    }
    
    /**
     * Ajuste del dirección del pedido
     * 
     * @param  address dirección del pedido
     */
    public void setAddress(String address){
    this.address=address;
    }
    
      /**
     * Añadir Robot al pedido
     *
     * @param  Robot robot a añadir
     */
    public void addRobot (Robot robot){
        this.listaRobots.add(robot);
    }
    
    
     /**
     * Eliminar sensor al Robot por código de plataforma
     *
     * @param  CodigoPlataforma   Código de plataforma
     * 
     * @return  int con valor 0 si no se eliminó ningún robot y 1 si se eliminó.
     */
    public int delRobot (String CodigoPlataforma){
        Iterator<Robot> i = this.listaRobots.iterator();
        int flag = 0;
        while (i.hasNext()) {
            Robot o = i.next();
            if(o.getCodigoPlataforma().equals(CodigoPlataforma)){
                i.remove();
                flag = 1;
            }
        }
        if (flag == 0){
        System.out.println("Ningún robot ha sido eliminado ya que no hay robots con el código seleccionado");
        }
        return flag;
    }
    
    
    /**
     * Mostrar información del pedido
     */
    public void imprimirPedido (){
        double pvp = 0;
        double pvpDescuento = 0;
        double descuento = 0;
        System.out.println("A continucación se muestra la información del pedido: "+this.getIdPedido()); 
        for(Robot temporal: listaRobots){
            pvp = pvp + temporal.getPVP();
            System.out.println("El precio de la referencia "+ temporal.getCodigoPlataforma() +" es: "+(float)temporal.getPVP()+ " €");
            System.out.println("------------------------------------------------------------------------------------------------------");
            temporal.printInfoSensores();
            if (descuento < 0.5){
                descuento = descuento + 0.1;             
            }
            System.out.println("------------------------------------------------------------------------------------------------------");
        }
        pvpDescuento = pvp - pvp * descuento;
        System.out.println("######################################################################################################");
        System.out.println("Tras aplicar un descuento del "+(int)(descuento*100)+" % el precio total es: "+(float)pvpDescuento+" Euros.");
        System.out.println("######################################################################################################\n");
    }
}
