public class MotoBoy extends Funcionario {

    private String carteiraDeHabilitacao;
     
    public MotoBoy(String nome, String dataNascimento, Sexo sexo, Setor setor, Double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
        public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    @Override
    public Double getSalarioFinal() {
        return super.getSalarioBase();
        
    }



   
}
