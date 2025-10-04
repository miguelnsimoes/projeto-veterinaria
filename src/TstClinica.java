import java.util.Scanner;
import java.util.Date;

public class TstClinica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro do Veterinário ---");
        Veterinario vet = new Veterinario("Dr. Miguel", "111.222.333-44", "CRMV-PR 55555", 6000.00);
        vet.impDados();

        System.out.println("\n--- Cadastro do Cliente ---");
        System.out.print("Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("CPF do Cliente: ");
        String cpfCliente = scanner.nextLine();

        System.out.print("Endereço: ");
        String enderecoCliente = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefoneCliente = scanner.nextLine();


        Cliente cliente = new Cliente(nomeCliente, cpfCliente, enderecoCliente, telefoneCliente, null);

        System.out.println("\n--- Cadastro do Animal ---");
        System.out.print("Nome do Animal: ");
        String nomeAnimal = scanner.nextLine();

        System.out.print("Idade do Animal: ");
        int idadeAnimal = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Raça do Animal: ");
        String racaAnimal = scanner.nextLine();

        System.out.print("1 - Cachorro / 2 - Gato: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        Animal animal;
        if (tipo == 1) {
            System.out.print("Porte do Cachorro: ");
            String porte = scanner.nextLine();

            animal = new Cachorro(nomeAnimal, idadeAnimal, racaAnimal, cliente, porte);
        } else if (tipo == 2) {
            System.out.print("Cor do Gato: ");
            String cor = scanner.nextLine();

            animal = new Gato(nomeAnimal, idadeAnimal, racaAnimal, cliente, cor);
        } else {
            System.out.println("Tipo invalido");
            return;
        }


        cliente.setAnimal(animal);

        System.out.println("\n--- Dados do Cliente e Animal ---");
        cliente.impDados();
        System.out.println(animal.emitirSom());

        System.out.println("\n--- Enter para Agendar a Consulta ---");
        scanner.nextLine();
        System.out.print("Sintomas do Animal: ");
        String obs = scanner.nextLine();

        Consulta consulta = new Consulta(new Date(), obs, vet, animal);

        System.out.println("\n--- Resumo da Consulta ---");
        System.out.println("Data: " + consulta.getData());
        System.out.println("Veterinário: " + consulta.getVeterinario().getNome());
        System.out.println("Animal: " + consulta.getAnimal().getNome());
        System.out.println("Observações: " + consulta.getObservacoes());

        scanner.close();
    }
}