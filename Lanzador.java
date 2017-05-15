
/**
 * Clase para ejecutar main()
 *
 * @author David de la Viuda
 * @version 1.0
 */
public class Lanzador
{
    /**
     * Constructor de objetos de la clase Lanzador
     */
    public Lanzador()
    {
    }

    /**
     * Método main()
     *
     * @param  args[] Argumentos
     */
    public static void main(String args[])
    {
    Pedido pedido = new Pedido();
    pedido.setIdPedido("00001");
    
    
        
    SensorLDR sensorLDR = new SensorLDR("Amtel", "AMT", "AMTLDR01", "Sensor LDR", 7.0, "alta" );
    SensorPresion sensorPresion = new SensorPresion("Amtel", "AMT", "AMTP01", "Sensor de presión", 22.0, 0.9 );
    SensorIR sensorIR = new SensorIR("Amtel", "AMT", "AMTINF01", "Sensor de infrarojos", 45.0, 0.1 );
    SensorObstaculos sensorObstaculos = new SensorObstaculos("Amtel", "AMT", "AMTOB01", "Sensor detector de obstáculos", 12.0, "baja" );
    
    SensorLDR sensorLDR_2 = new SensorLDR("Amtel", "AMT", "AMTLDR02", "Sensor LDR", 5.0, "baja" );
    SensorUltrasonido sensorUltrasonido = new SensorUltrasonido("Amtel", "AMT", "AMTUS01", "Sensor de ultrasonido", 30, 10.0 );
    
    
    Robot robot1 = new Robot ("Robot1");
    robot1.addSensor(sensorLDR);
    for(int i=0;i<8;i++){
        robot1.addSensor(sensorPresion);
    }
    robot1.addSensor(sensorIR);
    robot1.addSensor(sensorObstaculos);
    
    robot1.addSensor(sensorLDR_2);
    robot1.addSensor(sensorUltrasonido);
    
    SensorPresion sensorPresion1_5 = new SensorPresion("Amtel", "AMT", "AMTP02", "Sensor de presión", 29.0, 1.5 );
    SensorObstaculos sensorObstaculosA = new SensorObstaculos("Amtel", "AMT", "AMTOB02", "Sensor detector de obstáculos", 15.0, "alta" );
    
    Robot robot2 = new Robot ("Robot2");
    robot2.addSensor(sensorIR);
    robot2.addSensor(sensorPresion1_5);
    robot2.addSensor(sensorObstaculosA);
    
    robot2.addSensor(sensorLDR);
    robot2.addSensor(sensorUltrasonido);
    
    SensorPresion sensorPresion_08 = new SensorPresion("Amtel", "AMT", "AMTP_03", "Sensor de presión", 25.0, 1.0 );
    SensorCCD sensorCCD = new SensorCCD("Amtel", "AMT", "AMTCCD01", "Sensor para toma de imágenes CCD", 55.0, 768 );
    SensorObstaculos sensorObstaculosB = new SensorObstaculos("Amtel", "AMT", "AMTOB03", "Sensor detector de obstáculos", 12.0, "baja" );
    SensorUltrasonido sensorUltrasonido_2 = new SensorUltrasonido("Amtel", "AMT", "AMTUS02", "Sensor de ultrasonido", 10, 10.0 );
    
    Robot robot3 = new Robot ("Robot3");
    robot3.addSensor(sensorLDR);
    for(int i=0;i<6;i++){
        robot3.addSensor(sensorPresion_08);
    }
    robot3.addSensor(sensorIR);
    for(int i=0;i<2;i++){
        robot3.addSensor(sensorCCD);
    }
    robot3.addSensor(sensorObstaculosB);
    
    robot3.addSensor(sensorLDR_2);
    robot3.addSensor(sensorObstaculosB);
    
    
    pedido.addRobot(robot1);
    pedido.addRobot(robot2);
    pedido.addRobot(robot3);

    pedido.imprimirPedido();
    
    pedido.delRobot(robot3.getCodigoPlataforma());
    
    pedido.imprimirPedido();
    
    }
}
