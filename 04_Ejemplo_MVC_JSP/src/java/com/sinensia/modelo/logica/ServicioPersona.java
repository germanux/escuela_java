/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.modelo.logica;

import com.sinensia.modelo.Persona;
import java.util.ArrayList;

/** Singleton porque sólo queremos un servicio por aplicación/servidor
 *
 * @author alumno
 */
public class ServicioPersona {

// <editor-fold defaultstate="collapsed" desc="Código patrón de diseño Singleton.">
    private static ServicioPersona instancia;
    private ServicioPersona() {
        personas = new ArrayList<>();
    }
    public static ServicioPersona getInstancia() {
        if (instancia == null) 
            instancia = new ServicioPersona();
        return instancia;
    }// </editor-fold>
    
    private ArrayList<Persona> personas;
    
    public void addPersonas(String nombre, String edad) {
        //try {
            int intEdad = Integer.parseInt(edad);
            if (intEdad > 12 && !nombre.equals("")) {
                Persona p = new Persona(nombre, intEdad);
                personas.add(p);
            }
        /*} catch (NumberFormatException numberFormatException) {
        }*/
    }
    public Persona getPersona(String nombre) {
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
}
