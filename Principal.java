import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        GerenciadorCliente gerCliente = new GerenciadorCliente(scanner);
        GerenciadorVeterinario gerVet = new GerenciadorVeterinario(scanner);


        GerenciadorConsulta gerConsulta = new GerenciadorConsulta(scanner, gerVet, gerCliente);

        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            try {

                opcao = Integer.parseInt(scanner.nextLine());


                switch (opcao) {
                    case 1:
                        gerCliente.cadastrarCliente();
                        break;
                    case 2:
                        gerVet.cadastrarVeterinario();
                        break;
                    case 3:
                        gerConsulta.agendarConsulta();
                        break;
                    case 4:
                        gerCliente.listarClientes();
                        break;
                    case 5:
                        gerVet.listarVeterinarios();
                        break;
                    case 6:
                        gerConsulta.listarConsultas();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro, digite o numero certo");
                opcao = -1;
            }
        }

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Cadastrar Cliente (e seu Animal)");
        System.out.println("2. Cadastrar Veterinário");
        System.out.println("3. Agendar Consulta");
        System.out.println("4. Relatório de Clientes");
        System.out.println("5. Relatório de Veterinários");
        System.out.println("6. Relatório de Consultas");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
}