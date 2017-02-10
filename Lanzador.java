
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
        Sensor sensor1 = new Sensor("Amtel", "AMT", "AMTINF01", "Sensor de infrarojos", 15.99 );

	Sensor sensor2 = new Sensor("Amtel", "AMT", "AMTINF02", "Sensor de presión", 18.99 );
        
	Sensor sensor3 = new Sensor("Amtel", "AMT", "AMTINF03", "Sensor de luz", 11.99 );

	Sensor sensor4 = new Sensor("Amtel", "AMT", "AMTINF04", "Encoder", 13.99 );

	Sensor sensor5 = new Sensor("Amtel", "AMT", "AMTINF05", "Cámara", 25.99 );

	Robot robot1 = new Robot ("Robot1");
	robot1.addSensor(sensor1);
	robot1.addSensor(sensor2);
	robot1.addSensor(sensor3);

	Robot robot2 = new Robot ("Robot2");
	robot2.addSensor(sensor1);
	robot2.addSensor(sensor2);
	robot2.addSensor(sensor4);

	Robot robot3 = new Robot ("Robot3");
	robot3.addSensor(sensor1);
	robot3.addSensor(sensor2);
	robot3.addSensor(sensor5);

	Robot robot4 = new Robot ("Robot4");
	robot4.addSensor(sensor1);
	robot4.addSensor(sensor3);
	robot4.addSensor(sensor4);

	Robot robot5 = new Robot ("Robot5");
	robot5.addSensor(sensor1);
	robot5.addSensor(sensor2);
	robot5.addSensor(sensor3);
	robot5.addSensor(sensor4);

	robot5.printListaSensores();
	robot5.delSensor(sensor1.getCodigoSensor());
	robot5.printListaSensores();

    }
}
