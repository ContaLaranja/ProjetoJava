public class ContaBancaria {
    private String Banco;
    private String Agencia;
    private String NumConta;
    private String TipoConta;
    private String SaldoAtual;
    private String LimiteDisponivel;

    

    public ContaBancaria() {
    }

    public ContaBancaria(String banco, String agencia, String numConta, String tipoConta, String saldoAtual,
            String limiteDisponivel) {
        Banco = banco;
        Agencia = agencia;
        NumConta = numConta;
        TipoConta = tipoConta;
        SaldoAtual = saldoAtual;
        LimiteDisponivel = limiteDisponivel;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNumConta() {
        return NumConta;
    }

    public void setNumConta(String numConta) {
        NumConta = numConta;
    }

    public String getTipoConta() {
        return TipoConta;
    }

    public void setTipoConta(String tipoConta) {
        TipoConta = tipoConta;
    }

    public String getSaldoAtual() {
        return SaldoAtual;
    }

    public void setSaldoAtual(String saldoAtual) {
        SaldoAtual = saldoAtual;
    }

    public String getLimiteDisponivel() {
        return LimiteDisponivel;
    }

    public void setLimiteDisponivel(String limiteDisponivel) {
        LimiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "ContaBancaria [Banco=" + Banco + ", Agencia=" + Agencia + ", NumConta=" + NumConta + ", TipoConta="
                + TipoConta + ", SaldoAtual=" + SaldoAtual + ", LimiteDisponivel=" + LimiteDisponivel + "]";
    }

    
    

}
