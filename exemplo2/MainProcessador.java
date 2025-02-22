package exemplo2;

public class MainProcessador {

    public static void main(String[] args) {

        Memoria memoria1 = new Memoria("Kingston", "SSD", "1-tera");
        Processador processador1 = new Processador("RYZEN", "7-5700x", "3.4 GHz");

        System.out.println();
        System.out.println(memoria1.toString());
        System.out.println();
        System.out.println(processador1.toString());
        System.out.println();



    }

}
