import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private List<Aula> aulas = new ArrayList<>();
    private int id;
    private String nome;

    public Aluno() {
    }

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public List<Aula> getAulas(){
        return aulas;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nAluno: " +
                "\nid: " + id +
                "\nnome: " + nome;
    }public void setId(int id) {
        this.id = id;
    }
}
