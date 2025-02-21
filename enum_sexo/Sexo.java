public class Sexo{
    public enum sexo{
        MASCULINO("Masculino"), 
        FEMININO("Feminino");

        private String texto;

        private sexo(String texto) {
            this.texto = texto;
        }

        public String getTexto() {
            return texto;
        }

        
    }

}



    
