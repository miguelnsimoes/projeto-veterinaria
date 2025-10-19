import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GerenciadorConsulta {

    private List<Consulta> consultas = new ArrayList<>();
    private Scanner scanner;

    private GerenciadorVeterinario gerVet;
    private GerenciadorCliente gerCli;

    public GerenciadorConsulta(Scanner scanner, GerenciadorVeterinario gerVet, GerenciadorCliente gerCli) {
        this.scanner = scanner;
        this.gerVet = gerVet;
        this.gerCli = gerCli;
    }

    public void agendarConsulta() {
        System.out.println("AGENDAMENTO DE CONSULTA");

        if (!gerVet.temVeterinarios()) {
            System.out.println("Não há veterinários cadastrados. Cadastre um primeiro.");
            return;
        }
        if (!gerCli.temClientes()) {
            System.out.println("Não há clientes cadastrados. Cadastre um primeiro.");
            return;
        }

        System.out.println("Selecione o Veterinário:");
        gerVet.listarVeterinariosVisual();
        System.out.print("Digite o índice (começando de 0): ");
        int vetIndex = Integer.parseInt(scanner.nextLine());

        System.out.println("Selecione o Cliente:");
        gerCli.listarClientesVisual();
        System.out.print("Digite o índice (começando de 0): ");
        int cliIndex = Integer.parseInt(scanner.nextLine());

        Veterinario vet = gerVet.getVeterinarioPorIndice(vetIndex);
        Cliente cli = gerCli.getClientePorIndice(cliIndex);

        if (vet == null || cli == null) {
            System.out.println("Índice inválido.");
            return;
        }

        Animal animal = cli.getAnimal();

        if (animal == null) {
            System.out.println("Este cliente não possui um animal cadastrado.");
            return;
        }

        System.out.print("Observações: ");
        String obs = scanner.nextLine();

        System.out.print("Diagnóstico: ");
        String diag = scanner.nextLine();

        Consulta consulta = new Consulta();
        consulta.setData(new Date());
        consulta.setVeterinario(vet);
        consulta.setAnimal(animal);

        if(diag == null || diag.trim().isEmpty()) {
            consulta.setObservacoes(obs);
        } else {
            consulta.setObservacoes(obs, diag);
        }

        consultas.add(consulta);
        System.out.println("Consulta Agendada com sucesso!");
    }

    public void listarConsultas() {
        System.out.println("Relatório de Consultas");

        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta registrada.");
            return;
        }

        for (Consulta c : consultas) {
            System.out.println("REGISTRO DE CONSULTA");
            System.out.println("Veterinário: " + c.getVeterinario().getNome()); //Reflexividade
            System.out.println("Animal: " + c.getAnimal().getNome()); //Reflexividade
            System.out.println("Data: " + c.getData());
            System.out.println("Observação: " + c.getObservacoes());

        }
    }
}