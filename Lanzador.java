
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
    
    
        
    SensorLDR sensorLDR = new SensorLDR("Amtel", "AMT", "AMTINF01", "Sensor LDR", 5.0, "baja" );
    SensorPresion sensorPresion = new SensorPresion("Amtel", "AMT", "AMTINF02", "Sensor de presión", 25.0, 1.0 );
    SensorObstaculos sensorObstaculos = new SensorObstaculos("Amtel", "AMT", "AMTINF03", "Sensor detector de obstáculos", 15.0, "media" );

    SensorUltrasonido sensorUltrasonido = new SensorUltrasonido("Amtel", "AMT", "AMTINF04", "Sensor de ultrasonido", 30, 10.0 );
    SensorPresion sensorPresion1_5 = new SensorPresion("Amtel", "AMT", "AMTINF02_15", "Sensor de presión", 29.0, 1.5 );
    SensorObstaculos sensorObstaculosA = new SensorObstaculos("Amtel", "AMT", "AMTINF03A", "Sensor detector de obstáculos", 15.0, "alta" );

    SensorLDR sensorLDR_A = new SensorLDR("Amtel", "AMT", "AMTINF01_A", "Sensor LDR", 7.0, "alta" );
    SensorPresion sensorPresion_08 = new SensorPresion("Amtel", "AMT", "AMTINF02_08", "Sensor de presión", 20.0, 0.8 );
    SensorIR sensorIR = new SensorIR("Amtel", "AMT", "AMTINF09", "Sensor de infrarojos", 45.0, 0.1 );
    SensorCCD sensorCCD = new SensorCCD("Amtel", "AMT", "AMTINF10", "Sensor para toma de imágenes CCD", 75, 1024 );
    SensorObstaculos sensorObstaculosB = new SensorObstaculos("Amtel", "AMT", "AMTINF03_B", "Sensor detector de obstáculos", 12.0, "baja" );

    Robot robot1 = new Robot ("Robot1");
    robot1.addSensor(sensorLDR);
    for(int i=0;i<10;i++){
        robot1.addSensor(sensorPresion);
    }
    robot1.addSensor(sensorObstaculos);

    Robot robot2 = new Robot ("Robot2");
    robot2.addSensor(sensorUltrasonido);
    robot2.addSensor(sensorPresion1_5);
    robot2.addSensor(sensorObstaculosA);

    Robot robot3 = new Robot ("Robot3");
    robot3.addSensor(sensorLDR_A);
    for(int i=0;i<5;i++){
        robot3.addSensor(sensorPresion_08);
    }
    robot3.addSensor(sensorIR);
    for(int i=0;i<4;i++){
        robot3.addSensor(sensorCCD);
    }
    robot3.addSensor(sensorObstaculosB);
    
    pedido.addRobot(robot1);
    pedido.addRobot(robot2);
    pedido.addRobot(robot3);

    pedido.imprimirPedido();
    
    pedido.delRobot(robot2.getCodigoPlataforma());
    
    pedido.imprimirPedido();
    
    }
}
