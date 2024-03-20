package exercicioexbanco;
import java.util.Scanner;

public class ExercicioExBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco");
        System.out.print("Digite a quantidade máxima de contas que o banco pode armazenar: ");
        int tamanho = scanner.nextInt();
        CadastrarConta cadastro = new CadastrarConta(tamanho);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Conta");
            System.out.println("2. Listar Contas");
            System.out.println("3. Procurar Conta");
            System.out.println("4: Mudar uma conta de posicao");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o valor inicial da conta: ");
                    double valor = scanner.nextDouble();
                    cadastro.adicionarConta(nome, valor);
                    break;
                case 2:
                    cadastro.listarContas();
                    break;
                case 3:
                    System.out.print("Digite o nome do cliente para procurar a conta: ");
                    String nomeProcurado = scanner.nextLine();
                    cadastro.procurarConta(nomeProcurado);
                    break;
               case 4:
                    System.out.print("Digite o nome do cliente: ");
                    String nomePosicao = scanner.nextLine();
                    System.out.print("Digite a posição onde deseja adicionar a conta: ");
                    int posicao = scanner.nextInt();
                    cadastro.adicionarContaEmPosicao(nomePosicao, posicao);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}