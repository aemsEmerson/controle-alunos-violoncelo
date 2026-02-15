import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Aluno> alunos;
    private List<Aula> aulas;

    public Sistema(){
        alunos = new ArrayList<>();
        aulas = new ArrayList<>();
    }

    public void cadastrarAluno(int id, String nome){
        Aluno aluno = new Aluno(id, nome);
        alunos.add(aluno);
    }

    public void listarAlunos(){
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }

    
}
