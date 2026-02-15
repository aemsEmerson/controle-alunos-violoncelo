import java.time.LocalDate;

public class Aula {

    private int id;
    private LocalDate data;
    private String metodo;
    private String pagina;
    private String observacao;
    private Aluno aluno;

    public Aula(){
    }

    public Aula(int id, LocalDate data, String metodo, String pagina, String observacao, Aluno aluno) {
        this.id = id;
        this.data = data;
        this.metodo = metodo;
        this.pagina = pagina;
        this.observacao = observacao;
        this.aluno = aluno;
    }

    public int getId() {
        return id;
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

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    @Override
    public String toString() {
        return "Aula{" +
                ", data=" + data +
                ", metodo='" + metodo + '\'' +
                ", pagina='" + pagina + '\'' +
                ", observacao='" + observacao + '\'' +
                ", aluno=" + aluno.getNome() +
                '}';
    }
}
