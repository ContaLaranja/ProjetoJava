package arquivo;

public class Main {
public static void main(String[] args) {
    
    Galo galo = new Galo();
    Cachorro cachorro = new Cachorro();
    Gato gato = new Gato();

    System.out.println("Cachorro: ");
    System.out.println(cachorro.emitirSom());
    System.out.println(cachorro.comer());

    System.out.println("Gato: ");
    System.out.println(gato.emitirSom());
    System.out.println(gato.comer());

    System.out.println("Galo: ");
    System.out.println(galo.emitirSom());
    System.out.println(galo.comer());

}

}
