import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    var sc = new Scanner(System.in);

    Sistema sistema = new Sistema();
    int opcao;
    do{
        System.out.println("\n=== GERENCIADOR DE ALUNOS===");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Cadastrar Aula");
        System.out.println("4 - Listar Aulas");
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
            case 3 ->{
                System.out.println("Digite o id do aluno: ");
                int idAluno = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite a data: ");
                String data = sc.nextLine();

                System.out.println("Digite o nome do método: ");
                String metodo = sc.nextLine();

                System.out.println("Digite a página do método: ");
                int pagina = sc.nextInt();
                sc.nextLine();

                System.out.println("Observações: ");
                String observacoes = sc.nextLine();

                sistema.cadastrarAula(idAluno, data, metodo, pagina, observacoes);

            }
            case 4 -> sistema.listarAulas();

            case 0 -> System.out.println("Encerrando...");

            default -> System.out.println("Opção inválida!");
            }
        }
        while (opcao != 0);

    }
}