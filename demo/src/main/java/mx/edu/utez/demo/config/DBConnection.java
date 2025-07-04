package mx.edu.utez.demo.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL      = "jdbc:oracle:thin:@kwcfbu83enxsorz6_low";
    private static final String USER     = "ADMIN";
    private static final String PASSWORD = "Mez@002024Ho";

    // Obtiene una conexión nueva
    public static Connection getConnection() throws SQLException {
        // 1. Apunta al directorio donde descomprimiste el wallet
        System.setProperty("oracle.net.tns_admin", "C:\\Users\\CC11\\Downloads\\Wallet_KWCFBU83ENXSORZ6");
        // 2. (Opcional) fuerza la validación de nombre de servidor en el certificado
        System.setProperty("oracle.net.ssl_server_dn_match", "true");
        // 3. Obtiene la conexión usando alias, user y pass
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) throws SQLException {
        try (Connection conn = getConnection()) {
            System.out.println("¡Conexión exitosa!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}