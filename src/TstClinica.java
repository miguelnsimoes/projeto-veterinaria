import java.util.Scanner;
import java.util.Date;

public class TstClinica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro do Veterinário ---");
        Veterinario vet = new Veterinario();

        vet.setNome("Dr. Miguel");
        vet.setCpf("111.222.333-44");
        vet.setCrmv("CRMV-PR 55555");
        vet.setSalario(6000.00);

        Registravel registroVet = vet;
        registroVet.impDados();

        System.out.println("\n--- Cadastro do Cliente ---");

        Cliente cliente = new Cliente();

        System.out.print("Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        cliente.setNome(nomeCliente);

        System.out.print("CPF do Cliente: ");
        String cpfCliente = scanner.nextLine();
        cliente.setCpf(cpfCliente);

        System.out.print("Endereço: ");
        String enderecoCliente = scanner.nextLine();
        cliente.setEndereco(enderecoCliente);

        System.out.print("Telefone: ");
        String telefoneCliente = scanner.nextLine();
        cliente.setTelefone(telefoneCliente);


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

            Cachorro cachorro = new Cachorro();
            cachorro.setNome(nomeAnimal);
            cachorro.setIdade(idadeAnimal);
            cachorro.setRaca(racaAnimal);
            cachorro.setPorte(porte);

            animal = cachorro;
        } else if (tipo == 2) {
            System.out.print("Cor do Gato: ");
            String cor = scanner.nextLine();

            Gato gato = new Gato();
            gato.setNome(nomeAnimal);
            gato.setIdade(idadeAnimal);
            gato.setRaca(racaAnimal);
            gato.setCor(cor);

            animal = gato;
        } else {
            System.out.println("Tipo invalido");
            scanner.close();
            return;
        }

        cliente.setAnimal(animal);

        System.out.println("\n--- Dados do Cliente e Animal ---");
        cliente.impDados();
        System.out.println(animal.emitirSom());

        System.out.print("Sintomas do Animal: ");
        String obs = scanner.nextLine();

        Consulta consulta = new Consulta();
        consulta.setData(new Date());
        consulta.setObservacoes(obs);
        consulta.setVeterinario(vet);
        consulta.setAnimal(animal);


        System.out.println("\n--- Resumo da Consulta ---");

        PodeConsultar consultor = vet;
        consultor.realizarConsulta(consulta);

        scanner.close();
    }
}