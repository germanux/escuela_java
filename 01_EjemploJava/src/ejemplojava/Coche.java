package ejemplojava;

public class Coche { // hereda de Object
    
    public static final int CAPACIDAD_DEPOSITO = 60;
    
    private final byte numRuedas;   // Valor constante por el final
    private String marca;
    private boolean esGasolina;
    private double nivDeposito;
    private boolean arrancado;
    
    public Coche(String marca, boolean esGasolina) {
        this.numRuedas = 4;
        this.marca = marca;
        this.esGasolina = esGasolina;
        
    }
    
    public double getNivelDep() {
        return nivDeposito;
    }

    public byte getNumRuedas() {
        return numRuedas;
    }
    
    
    public void echarCarburante(double cantidad) {
        if (cantidad > 0)
            this.nivDeposito += cantidad;
        
        if (nivDeposito > CAPACIDAD_DEPOSITO)
            nivDeposito = CAPACIDAD_DEPOSITO;
    }
    
    public void acelerar() {
        if (arrancado)  nivDeposito -= 0.1;
    }
    
    public void vaciarDeposito() {
        // float nivelDeposito = 2;
        this.nivDeposito = 3;
        System.out.println("Deposito vaciado de " + this.toString()
                /*+ "\n   Nivel: " + nivelDeposito*/ );  
    }
    public String toString() {
        return "Coche " + marca + " nivel " + nivDeposito;
    }
    public void mostrar() {
        System.out.println(this.toString()); 
    }

    public String getMarca() {
        return marca;
    }

    public boolean isEsGasolina() {
        return esGasolina;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public double getNivDeposito() {
        return nivDeposito;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }
    
}
