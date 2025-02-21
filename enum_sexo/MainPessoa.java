public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Marta");
        pessoa.setSexo("Feminino");

        System.out.println(pessoa.getSexo());
        System.out.println(pessoa.getNome());

    }
}
