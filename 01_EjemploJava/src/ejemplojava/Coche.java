package ejemplojava;


public class Coche { // hereda de Object
    
    public static final int CAPACIDAD_DEPOSITO = 60;
    
    private final byte numRuedas;   // Valor constante por el final
    private final String marca;
    private double nivDeposito;
    private boolean arrancado;
    private TipoColor color = TipoColor.ROJO;
    private final TipoCarcubrante carburante;

    
    public Coche(String marca, TipoCarcubrante carburante, TipoColor color) {
        this.numRuedas = 4;
        this.marca = marca; 
        this.color = color;
        this.carburante = carburante;
    }
    public Coche(String marca, TipoCarcubrante carburante, String color) {
        this.numRuedas = 4;
        this.marca = marca; 
        
        this.color = TipoColor.valueOf(color.toUpperCase());
       //  this.color = Enum.valueOf(TipoColor.class, color);
        
       /* switch (color) {
            case "ROJO": this.color = TipoColor.ROJO; break;
        }*/
        this.carburante = carburante;
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
        if (arrancado)  {
            nivDeposito -= 0.1;
            explosionCilindro();
        }
    }
    
    public void vaciarDeposito() {
        // float nivelDeposito = 2;
        this.nivDeposito = 3;
        System.out.println("Deposito vaciado de " + this.toString()
                /*+ "\n   Nivel: " + nivelDeposito*/ );  
    }
    public String toString() {
        return "Coche " + marca + " color " + this.color.toString() + " nivel " + nivDeposito ;
    }
    public void mostrar() {
        System.out.println(this.toString()); 
    }

    public String getMarca() {
        return marca;
    }

    public TipoColor getColor() {
        return color;
    }

    public TipoCarcubrante getCarburante() {
        return carburante;
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

    public void setColor(TipoColor color) {
        this.color = color;
    }
    
    protected void explosionCilindro() {
        System.out.println("Motor funcionando");
    }
    protected void setNivDeposito(double nuevoNiv) {
        this.nivDeposito = nuevoNiv;
    }
}
