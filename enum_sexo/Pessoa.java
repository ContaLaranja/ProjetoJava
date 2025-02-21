public class Pessoa {

    private String nome;
    private String sexo;
    private Estado uf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Estado getUf() {
        return uf;
    }
    public void setUf(Estado uf) {
        this.uf = uf;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", uf=" + uf + "]";
    }
    

    

    
    


    
    

}
