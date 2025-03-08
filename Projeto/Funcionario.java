public abstract class Funcionario {

protected String nome;
protected String cpf;
protected double salarioBase;
protected String dataDeNascimento;

public Funcionario(String nome, String cpf, double salarioBase, String dataDeNascimento) {
    this.nome = nome;
    this.cpf = cpf;
    this.salarioBase = salarioBase;
    this.dataDeNascimento = dataDeNascimento;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioBase=" + salarioBase +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                '}';
    }


    
}
