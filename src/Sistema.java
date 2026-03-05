import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private static final String CAMINHO_ARQUIVO = "dados.txt";
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private List<Aluno> alunos;

    private int proximoIdAluno = 1;

    public Sistema(){
        alunos = new ArrayList<>();

    }

    public void cadastrarAluno(String nome){
        nome = nome.trim();
        if (verificarDuplicidade(nome)){
            System.out.println("Já existe um aluno com esse nome");
            return;
        }
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

    public void deletarAluno(int id){
        Aluno aluno = buscarAlunoPorId(id);

        if (aluno == null){
            System.out.println("Aluno não encontrado!");
            return;
        }
        alunos.remove(aluno);

        //remover tambem as aulas do aluno
        aluno.getAulas().removeIf(aula -> aula.getAluno().getId() == id);

        System.out.println("Aluno e suas aulas foram removidos com sucesso!");

    }

    private boolean verificarDuplicidade(String nome){
        for (Aluno aluno : alunos){
            if (aluno.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }


    public void editarNomeAluno(int id, String novoNome){
        Aluno aluno = buscarAlunoPorId(id);

        if(aluno == null){
            System.out.println("Aluno não encontrado!");
            return;
        }
        aluno.setNome(novoNome);
        System.out.println("Nome atualizado com sucesso");
    }

    public void cadastrarAula(int idAluno, LocalDate data, String metodo, int pagina, String observacao){
        Aluno aluno = buscarAlunoPorId(idAluno);
        if (aluno == null){
            System.out.println("Aluno não encontrado!! Aula Não Cadastrada!!");
            return;
        }
        Aula aula = new Aula(aluno, data, metodo, pagina, observacao);
        aluno.getAulas().add(aula);
        System.out.println("Aula Cadastrada!!!");
    }

    public void listarAulaPorAluno(int idAluno){
        Aluno aluno = buscarAlunoPorId(idAluno);

        if (aluno == null){
            System.out.println("Aluno não encontrado!!!");
            return;
        }

        boolean encontrou = false;

        for(Aula aula: aluno.getAulas()){
            if (aula.getAluno().getId() == idAluno){
                System.out.println(aula);
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("Este Aluno não possui Aulas Cadastradas.");
        }
    }


    public void salvarEmArquivo(){

        try(BufferedWriter writer = new BufferedWriter(
                new FileWriter(CAMINHO_ARQUIVO))) {
            for (Aluno aluno : alunos){

                //Linha aluno
                writer.write(("ALUNO;" + aluno.getId() + ";" + aluno.getNome()));
                writer.newLine();

                //Linha das aulas do aluno
                for (Aula aula : aluno.getAulas()){
                    writer.write("AULA;" +
                            aluno.getId() + ";" +
                            aula.getData().format(formatter) + ";" +
                            aula.getMetodo() + ";" +
                            aula.getPagina() + ";" +
                            aula.getObservacao());
                    writer.newLine();
                }
            }
            System.out.println("Dados Salvos com Sucesso !!!");
        } catch (IOException e){
            System.out.println("Erro ao salvar o arquivo" + e.getMessage());
        }
    }
}
