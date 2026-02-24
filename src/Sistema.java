import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Aluno> alunos;
    private List<Aula> aulas;
    private int proximoIdAluno = 1;

    public Sistema(){
        alunos = new ArrayList<>();
        aulas = new ArrayList<>();
    }

    public void cadastrarAluno(String nome){
        Aluno aluno = new Aluno(proximoIdAluno, nome);
        alunos.add(aluno);
        proximoIdAluno++;
    }

    public void listarAlunos(){
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }
    public Aluno buscarAlunoPorId(int id){
        for(Aluno aluno : alunos){
            if(aluno.getId() == id){
                return aluno;
            }
        }
        return null;
    }
    public void cadastrarAula(int idAluno, String data, String metodo, int pagina, String observacao){
        Aluno aluno = buscarAlunoPorId(idAluno);
        if (aluno == null){
            System.out.println("Aluno não encontrado");
            return;
        }
        Aula aula = new Aula(aluno, data, metodo, pagina, observacao);
        aulas.add(aula);
        System.out.println("Aula Cadastrada!!!");
    }

    public void listarAulas(){
        if (aulas.isEmpty()){
            System.out.println("Nenhuma aula cadastrada");
            return;
        }
        for(Aula aula: aulas){
            System.out.println(aula);
        }
    }


}
