/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.demousers.controllers;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.demousers.model.Persona;

/**
 * Singleton porque sólo queremos un servicio por aplicación/servidor
 *
 * @author alumno
 */
@RestController
@RequestMapping("/personas")
public class ServicioPersona {

    private ArrayList<Persona> personas;

    public Persona addPersonas(String nombre, String edad)
            throws NumberFormatException, IOException, IllegalArgumentException {

        if (nombre.equals("")) {
            throw new IllegalArgumentException("El nombre es vacío");
        } else if (nombre.length() < 2) {
            throw new IllegalArgumentException("El nombre es demasiado corto");
        } else if (edad.equals("")) {
            throw new NumberFormatException("La edad está vacía");
        } else {
            int intEdad = Integer.parseInt(edad);
            if (intEdad <= 12) {
                throw new IllegalArgumentException("La edad debe ser mayor que 12");
            } else {
                Persona p = new Persona(nombre, intEdad);
                personas.add(p);
                return p;
            }
        }
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Persona> getPersonas() {
    	if (personas  == null) {
    		personas = new ArrayList<Persona>();
    		personas.add(new Persona("Fulanito", 20));
    		personas.add(new Persona("Fulanita", 30));
    		personas.add(new Persona("Mengano", 40));
    	}
    	return this.personas;
    }
    
    public Persona getPersona(String nombre) {

        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public boolean removePersona(String nombre) {
        Persona perElim = null;
        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                perElim = p;
            }
        }
        if (perElim == null) {
            return false;
        } else {
            personas.remove(perElim);
            return true;
        }
    }
}
