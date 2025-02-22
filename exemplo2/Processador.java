package exemplo2;

public class Processador extends Heranca{

    private String Frequencia;

    public Processador(String marca, String modelo, String frequencia) {
        super(marca, modelo);
        Frequencia = frequencia;
    }

    public String getFrequencia() {
        return Frequencia;
    }

    public void setFrequencia(String frequencia) {
        Frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador [marca=" + marca + ", Frequencia=" + Frequencia + ", modelo=" + modelo + "]";
    }

    

}
