public class Inventario {
    private Producto[] stock;

    public Inventario(int tamano){
    this.stock= new Producto[tamano];
    }

    public boolean agregarProducto(Producto producto){
        for (int i=0;i< stock.length;i++){
            if(this.stock[i]==null){
                this.stock[i]=producto;
                System.out.println(stock[i].getNombre() + " producto guardado" );
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(String codigo){
        for(int i=0;i < stock.length;i++){
            if(stock[i] != null && stock[i].getCodigo().equals(codigo)){
                System.out.println("producto " + stock[i].getNombre() + " Eliminado");
                this.stock[i]=null;
                return true;
            }
        }
        return false;
    }

    public Producto buscar(String codigo) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null && stock[i].getCodigo().equals(codigo)) {
                return stock[i];
            }
        }
        return null;
    }

    public int totalItems(){
        int suma=0;
        for (int i=0;i< stock.length;i++){
            if(stock[i]!=null){
                suma+=stock[i].getCantidad();
            }
        }
        return suma;
    }

}