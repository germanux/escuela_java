/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author alumno
 */
public abstract class Vehiculo {
    
    private String matricula;
  
    public Vehiculo() {        
    }
    public abstract void abrirPuerta();
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }  
}
// VEHICULO DECLARA (NO IMPLEMENTA) ALGUNOS METODOS DE COCHE