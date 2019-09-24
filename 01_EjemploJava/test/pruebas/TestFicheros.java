/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import org.junit.Test;
import static org.junit.Assert.*;
import threads.HiloCrearFichero;

/**
 *
 * @author alumno
 */
public class TestFicheros {
    
    public TestFicheros() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void generacionFicheroAleatorio() {
        HiloCrearFichero.crearFicheroEjem("C:\\Users\\alumno\\Desktop\\ESCUELA_JAVA\\escuela_java.git\\01_EjemploJava\\texto_esp.txt");
    }
}
