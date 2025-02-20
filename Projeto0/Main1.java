
public class Main1 {
   
    public static void main(String[] args) {
    /*Versão 1*/Endereco endereco1 = new Endereco("Rua José Geraldo Veloso Gordilho", "232", "Salvador");
        Cliente cliente1 = new Cliente("Alexsandro","18", endereco1);

        System.out.println(cliente1.toString());
        
        
    /*versão 2*/Cliente cliente2 = new Cliente("Marlene", "58", 
    new Endereco("Rua direta", "163", "Salvador"));

    System.out.println(cliente2.toString());

    }

}
