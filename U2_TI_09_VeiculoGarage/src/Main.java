public class Main {
    public static void main(String[] args) {
     Garage garage = new Garage(4);

     Coche coche1=new Coche("asd01","toyota",4);
     Coche coche2=new Coche("asd02","Ferrari",2);
     Motocicleta moto1 =new Motocicleta("asd03","italika",true);
     Motocicleta moto2 =new Motocicleta("asd04","Kawasaki",false);

     System.out.println("conteo: " +  garage.contarVehiculos());

     garage.estacionar(coche1);
     garage.estacionar(moto1);
     garage.estacionar(coche2);
     garage.estacionar(moto2);

     //garage.retirar(coche1.getPlaca());
     garage.retirar("asd01");
     System.out.println("conteo: " +  garage.contarVehiculos());

    }
}