import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    var sc = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    Sistema sistema = new Sistema();
    int opcao;
    do{
        System.out.println("\n=== GERENCIADOR DE ALUNOS===");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Editar nome do aluno");
        System.out.println("4 - Cadastrar Aula");
        System.out.println("5 - Listar Aulas");
        System.out.println("6 - Remover Aluno");
        System.out.println("0 - Encerrar");
        System.out.print("Digite a opção: ");
        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1 -> {
                System.out.println("Digite o nome para Cadastrar o Aluno: ");
                String nome = sc.nextLine();

                sistema.cadastrarAluno(nome);
            }
            case 2 -> {
                sistema.listarAlunos();
            }
            case 3 -> {
                System.out.println("Digite o ID do aluno que deseja Editar o nome: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o novo nome: ");
                String novoNome = sc.nextLine();

                sistema.editarNomeAluno(id, novoNome);

            }

            case 4 ->{
                System.out.println("Digite o id do aluno: ");
                int idAluno = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite a data(dd/MM/yyyy): ");
                String dataDigitada = sc.nextLine();

                LocalDate data = LocalDate.parse(dataDigitada, formatter);


                System.out.println("Digite o nome do método: ");
                String metodo = sc.nextLine();

                System.out.println("Digite a página do método: ");
                int pagina = sc.nextInt();
                sc.nextLine();

                System.out.println("Observações: ");
                String observacoes = sc.nextLine();

                sistema.cadastrarAula(idAluno, data, metodo, pagina, observacoes);

            }

            case 5 -> {
                System.out.println("Digite o ID do aluno para listar as aulas: ");
                int idAluno = sc.nextInt();
                sc.nextLine();

                sistema.listarAulaPorAluno(idAluno);

            }

            case 6 -> {
                System.out.println("Digite o ID do aluno que deseja excluir: ");
                int id = sc.nextInt();
                sc.nextLine();

                sistema.deletarAluno(id);

            }

            case 0 -> System.out.println("Encerrando...");

            default -> System.out.println("Opção inválida!");
            }
        }
        while (opcao != 0);

    }
}

