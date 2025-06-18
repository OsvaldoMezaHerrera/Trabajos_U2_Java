public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String placa, String marca, int numeroDePuertas) {
        super(placa, marca);
        this.numeroDePuertas = numeroDePuertas;
    }
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

}
