public class MainBanco {
    public static void main(String[] args) {
    
        Funcionario funcionario1 = new Funcionario("0001", "Alex", "Uruguai", "7198893", "@gmail.com", 
        new ContaBancaria("Inter", "0101", "1001", "PJ", "1.000.000", "1.000.000.000"));
        System.out.println(funcionario1.toString());

 }
}
