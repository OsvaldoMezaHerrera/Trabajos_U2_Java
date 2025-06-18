public class Main {
    public static void main(String[] args) throws Exception {
        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("emp002","Gustavo", 7000.00,"vacaciones los fines");
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("emp003","Emenegildo", 350.00,8);

        System.out.println("Salario empleado tiempo completo: " + empleadoTiempoCompleto.calcularSalario());
        System.out.println("-------------------------------------");
         System.out.println("Salario empleado Por horas: " + empleadoPorHoras.calcularSalario());
    }
}