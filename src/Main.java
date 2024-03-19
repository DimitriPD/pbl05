import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Sistema de Cadastro de Pessoas");

        int operacao = 0;
        do {
            System.out.println(
                    "Digite o número da operação a ser executada:" +
                            "\n\t1. Cadastrar nova pessoa;" +
                            "\n\t2. Listar pessoas cadastradas;" +
                            "\n\t3. Buscar pessoas por tipo;" +
                            "\n\t4. Encerrar programa.");
            operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    cadastrarPessoa();
                    break;
                case 2:
                    listarPessoas();
                    break;
                case 3:
                    buscarPessoasPorTipo();
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        } while (operacao != 4);
    }

    public static void cadastrarPessoa() {
        System.out.println("Novo Cadastro");
        Pessoa novaPessoa = new Pessoa();

        System.out.print("\tNome:");
        novaPessoa.setNome(scanner.next());

        System.out.println(
                "\tDigite o número do tipo da pessoa:" +
                        "\n\t1. Cliente;" +
                        "\n\t2. Funcionário;" +
                        "\n\t3. Gerente.");
        int tipoEscolhido = scanner.nextInt();
        try {
            TipoPessoa tipoEscolhidoEnum = TipoPessoa.valueOf(tipoEscolhido);
            novaPessoa.setTipoPessoa(tipoEscolhidoEnum);
            pessoas.add(novaPessoa);
            System.out.println("Cadastro realizado com sucesso.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada");
            return;
        }

        System.out.println("Pessoas Cadastradas");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " | " + pessoa.getTipoPessoa());
        }
        System.out.println();
    }

    public static void buscarPessoasPorTipo() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada");
            return;
        }

        System.out.println(
                "Digite o número do tipo a ser pesquisado:" +
                        "1. Cliente;" +
                        "2. Funcionário;" +
                        "3. Gerente.");

        int tipoEscolhido = scanner.nextInt();
        try {
            TipoPessoa tipoEscolhidoEnum = TipoPessoa.valueOf(tipoEscolhido);
            for (Pessoa pessoa : pessoas) {
                if (pessoa.getTipoPessoa() == tipoEscolhidoEnum) {
                    System.out.println(pessoa.getNome() + " | " + pessoa.getTipoPessoa());
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}