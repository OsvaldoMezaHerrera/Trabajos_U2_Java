public class Main {
    public static void main(String[] args) {
        Inventario inventarios = new Inventario(3);

        Producto producto1 = new Producto("asd01","jabon",20);
        Producto producto2 = new Producto("asd02","lapiz",15);
        Producto producto3 = new Producto("asd03","papel",28);
        Producto producto4 = new Producto("asd04","zapatos",2);

        inventarios.agregarProducto(producto1);
        System.out.println("Total de productos:" + inventarios.totalItems());
        inventarios.agregarProducto(producto2);
        System.out.println("Total de productos:" + inventarios.totalItems());
        inventarios.agregarProducto(producto3);
        System.out.println("Total de productos:" + inventarios.totalItems());
        inventarios.agregarProducto(producto4);
        System.out.println("Total de productos:" + inventarios.totalItems());

        System.out.println(inventarios.buscar("asd01"));
        System.out.println("Total de productos:" + inventarios.totalItems());
        System.out.println(inventarios.buscar("asd05"));
        System.out.println("Total de productos:" + inventarios.totalItems());

        inventarios.eliminarProducto("asd02");
        System.out.println("Total de productos:" + inventarios.totalItems());

        inventarios.agregarProducto(producto2);
        System.out.println("Total de productos:" + inventarios.totalItems());

    }
}