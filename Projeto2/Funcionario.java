public class Funcionario {
    private String CodFuncionario;
    private String Nome;
    private String Endereco;
    private String Telefone;
    private String Email;
    private ContaBancaria ContaBancaria;


    public Funcionario() {
    }


    public Funcionario(String codFuncionario, String nome, String endereco, String telefone, String email,
            ContaBancaria contaBancaria) {
        CodFuncionario = codFuncionario;
        Nome = nome;
        Endereco = endereco;
        Telefone = telefone;
        Email = email;
        ContaBancaria = contaBancaria;
    }


    public String getCodFuncionario() {
        return CodFuncionario;
    }


    public void setCodFuncionario(String codFuncionario) {
        CodFuncionario = codFuncionario;
    }


    public String getNome() {
        return Nome;
    }


    public void setNome(String nome) {
        Nome = nome;
    }


    public String getEndereco() {
        return Endereco;
    }


    public void setEndereco(String endereco) {
        Endereco = endereco;
    }


    public String getTelefone() {
        return Telefone;
    }


    public void setTelefone(String telefone) {
        Telefone = telefone;
    }


    public String getEmail() {
        return Email;
    }


    public void setEmail(String email) {
        Email = email;
    }


    public ContaBancaria getContaBancaria() {
        return ContaBancaria;
    }


    public void setContaBancaria(ContaBancaria contaBancaria) {
        ContaBancaria = contaBancaria;
    }


    @Override
    public String toString() {
        return "Funcionario [CodFuncionario=" + CodFuncionario + ", Nome=" + Nome + ", Endereco=" + Endereco
                + ", Telefone=" + Telefone + ", Email=" + Email + ", ContaBancaria=" + ContaBancaria + "]";
    }

    
    

    


}
