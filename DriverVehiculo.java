
package Ejemplo2;

/**
 *
 * @author Gateway
 */
public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("Diesel",3);
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("----MOTOCICLETA------");
        Motocicleta moto= new Motocicleta(150,"Yamaha");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCabalito();
        moto.frenar();
        moto.apagar();
        
        
    }
}
