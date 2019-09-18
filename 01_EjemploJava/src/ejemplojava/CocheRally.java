/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojava;

/**
 *
 * @author alumno
 */
public class CocheRally extends Coche {
    private float rozamiento;
            
    public CocheRally(String marca, TipoCarcubrante carburante, TipoColor color, float roz) {
        super(marca, carburante, color);
        this.rozamiento = roz;
    }     
    // Sobre carga de constructor
    public CocheRally(String marca, TipoCarcubrante carburante, String color, float roz) {
        super(marca, carburante, color);
        this.rozamiento = roz;
    }
    public void derrapar() {
        System.out.println("Derrapeeeee!");
        super.explosionCilindro();
    }
    // Sobre carga de método
    public void derrapar(float cuanto) {
        System.out.println("Derrapeeeee de " + cuanto + " newtons!");
        super.explosionCilindro();
    }
    // SOBRE ESCRITURA DE MÉTODOS
    public void acelerar() {
        System.out.println("Acelerando a lo rally ");
        if (this.isArrancado())  {
            setNivDeposito(getNivDeposito() - .5);
            // nivDeposito -= 0.1;
            explosionCilindro();
        }
    }

    public float getRozamiento() {
        return rozamiento;
    }

    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }
    
}
