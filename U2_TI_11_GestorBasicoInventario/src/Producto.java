public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;

    public Producto(String codigo,String nombre, int cantidad ){
        this.codigo=codigo;
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        if (codigo!=null && !codigo.isEmpty()){
            this.codigo=codigo;
        }else{
            System.out.println("El codigo no debe de estar vacio");
        }
    }

    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        if(cantidad>=0){
            this.cantidad=cantidad;
        }else{
            System.out.println("ingresa una cantidad mayor o igual que 0");
        }
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if (nombre!=null && !nombre.isEmpty()){
            this.nombre=nombre;
        }else{
            System.out.println("El nombre no debe de estar vacio");
        }
    }

}
