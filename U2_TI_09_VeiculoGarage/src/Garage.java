public class Garage {
    private Vehiculo[] vehiculos;
    public Garage(int numEspacios) {
        this.vehiculos = new Vehiculo[numEspacios];
    }

    public boolean estacionar(Vehiculo vehiculo) {
        for(int i=0; i< vehiculos.length; i++) {
            if (vehiculos[i] == null) {
                vehiculos[i] = vehiculo;
                System.out.println("placa coche guardado:" + vehiculo.getPlaca());
                return true;
            }
        }
        return false;
    }
    public boolean retirar(String placa) {
        for(int i=0; i< vehiculos.length; i++) {
            if (vehiculos[i].getPlaca().equals(placa)) {
                vehiculos[i] = null;
                return true;
            }else{
                System.out.println("vehiculo no encontrado");
            }
        }
        return false;
    }

    public int contarVehiculos() {
        int z = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null) {
                z++;
            }
        }
        return z;
    }

}
