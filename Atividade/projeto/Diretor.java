public class Diretor extends Funcionario implements Contratacao { 


    private final double Premio = 0.2;
    
    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, Double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }
    
    @Override
    public Double getSalarioFinal() {
        return super.getSalarioBase() * Premio;
    
    
    }
    
    
    @Override
    public void contratar(Funcionario funcionario) {
        System.out.println("Contratando funcionario: " + funcionario.toString());
        
    
    }
    
    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionario: " + funcionario.toString());
    
    
    }
    }