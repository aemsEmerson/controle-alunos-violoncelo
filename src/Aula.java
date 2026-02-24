import java.time.LocalDate;

public class Aula {

    private Aluno aluno;
    private String data;
    private String metodo;
    private int pagina;
    private String observacao;

    public Aula(){
    }

    public Aula(Aluno aluno, String data, String metodo, int pagina, String observacao) {
        this.aluno = aluno;
        this.data = data;
        this.metodo = metodo;
        this.pagina = pagina;
        this.observacao = observacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "\nAluno: " + aluno.getNome() +
                "\nData: " + data +
                "\nMetodo: " + metodo +
                "\nPágina: " + pagina +
                "\nObservacao: " + observacao +
                "\n-------------------------------";
    }
}
