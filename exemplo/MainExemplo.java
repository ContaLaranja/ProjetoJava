package exemplo;

public class MainExemplo {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Marta", 15, "12/08/2029", "Pix");
        Funcionario funcionario1 = new Funcionario("Alex", 20, "29020", "Dev-Senior", 300000);

        System.out.println();
        System.out.println(cliente1.toString());
        System.out.println();
        System.out.println(funcionario1.toString());
        System.out.println();

        
    }
}
