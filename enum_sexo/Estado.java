public class Estado {
    public enum estado{
        BAHIA("Bahia","BA"),
        SAO_PAULO("São paulo","SP"),
        RIO_DE_JANEIRO("Rio de janeiro", "RJ");

        private String texto;
        private String sigla;
        private estado(String texto, String sigla) {
            this.texto = texto;
            this.sigla = sigla;
        }
        public String getTexto() {
            return texto;
        }
        public void setTexto(String texto) {
            this.texto = texto;
        }
        public String getSigla() {
            return sigla;
        }
        public void setSigla(String sigla) {
            this.sigla = sigla;
        }

        

    }
}
