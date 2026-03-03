import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aula {

    private Aluno aluno;
    private LocalDate data;
    private String metodo;
    private int pagina;
    private String observacao;

    public Aula(){
    }

    public Aula(Aluno aluno, LocalDate data, String metodo, int pagina, String observacao) {
        this.aluno = aluno;
        this.data = data;
        this.metodo = metodo;
        this.pagina = pagina;
        this.observacao = observacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\nAluno: " + aluno.getNome() +
                "\nData: " + data.format(formatter) +
                "\nMetodo: " + metodo +
                "\nPágina: " + pagina +
                "\nObservacao: " + observacao +
                "\n-------------------------------";
    }
}
