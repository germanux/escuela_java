package pruebas;

import org.junit.Test;
import static org.junit.Assert.*;
import poo.Moto;
import poo.Vehiculo;

public class TestAbstractInterfaces {
    
    @Test
    public void abstractos() {
        Vehiculo miVehiculo = new Vehiculo() {
            @Override
            public void abrirPuerta() {
                    System.out.println("Abriendo puertas...");
            }
        };
        Vehiculo miMoto = new Moto();
        
        miVehiculo.abrirPuerta();
        miMoto.abrirPuerta();
    }
}
