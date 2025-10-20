import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorCliente {

    private List<Cliente> clientes = new ArrayList<>();
    private Scanner scanner;

    public GerenciadorCliente(Scanner scanner) {
        this.scanner = scanner;
    }

    public void cadastrarCliente() {
        System.out.println("Cadastro de Cliente");
        Cliente cliente = new Cliente();

        System.out.print("Nome do Cliente: ");
        cliente.setNome(scanner.nextLine());

        System.out.print("CPF (xxx.xxx.xxx-xx): ");
        cliente.setCpf(scanner.nextLine());

        System.out.print("Endereço: ");
        cliente.setEndereco(scanner.nextLine());

        System.out.print("Telefone: ");
        cliente.setTelefone(scanner.nextLine());

        System.out.println("Cadastro do Animal");
        Animal animal = cadastrarAnimal();

        if (animal != null) {
            cliente.setAnimal(animal);
            clientes.add(cliente);
            System.out.println("Cliente e Animal cadastrados com sucesso");
        } else {
            System.out.println("Cadastro de cliente cancelado pois o animal não foi registrado.");
        }
    }

    private Animal cadastrarAnimal() {
        System.out.print("Nome do Animal: ");
        String nomeAnimal = scanner.nextLine();

        System.out.print("Idade do Animal (int): ");
        int idadeAnimal = Integer.parseInt(scanner.nextLine());

        System.out.print("Raça do Animal: ");
        String racaAnimal = scanner.nextLine();

        System.out.print("Tipo (1-Cachorro / 2-Gato / 3-Pássaro): ");
        int tipo = Integer.parseInt(scanner.nextLine());

        Animal animal = null;
        if (tipo == 1) {
            Cachorro cachorro = new Cachorro();
            cachorro.setNome(nomeAnimal);
            cachorro.setIdade(idadeAnimal);
            cachorro.setRaca(racaAnimal);

            System.out.print("Porte do Cachorro: ");
            cachorro.setPorte(scanner.nextLine());

            System.out.print("Vacinado contra raiva? (true/false): ");
            cachorro.setVacinadoRaiva(Boolean.parseBoolean(scanner.nextLine()));

            animal = cachorro;
        }
        else if (tipo == 2) {
            Gato gato = new Gato();
            gato.setNome(nomeAnimal);
            gato.setIdade(idadeAnimal);
            gato.setRaca(racaAnimal);

            System.out.print("Cor do Gato: ");
            gato.setCor(scanner.nextLine());

            System.out.print("Testado para FIV/FELV? (true/false): ");
            gato.setTestadoFivFelv(Boolean.parseBoolean(scanner.nextLine()));

            animal = gato;
        }
        else if (tipo == 3) {
            Passaro passaro = new Passaro();
            passaro.setNome(nomeAnimal);
            passaro.setIdade(idadeAnimal);
            passaro.setRaca(racaAnimal);

            System.out.print("Tipo da Pena: ");
            passaro.setTipoPena(scanner.nextLine());

            System.out.print("Possui anilha? (true/false): ");
            passaro.setAnilhado(Boolean.parseBoolean(scanner.nextLine()));

            animal = passaro;
        }
        else {
            System.out.println("Cadastro do animal falhou.");
        }
        return animal;
    }

    public void listarClientes() {
        System.out.println("Relatório de Clientes");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            System.out.println(i);

            //Reflexividade
            System.out.println("Nome: " + c.getNome());
            System.out.println("CPF: " + c.getCpf());
            System.out.println(" Telefone: " + c.getTelefone());
            System.out.println("Endereço: " + c.getEndereco());

            String animalInfo;

            if (c.getAnimal() != null) { //Reflexividade
                animalInfo = c.getAnimal().getNome() + " (" + c.getAnimal().getRaca() + ")";
            }
            else {
                animalInfo = "nenhum";
            }
            System.out.println("Animal: " + animalInfo);
        }
    }

    public void listarClientesVisual() {

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente disponível.");
            return;
        }

        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            System.out.println(i + c.getNome()); //Reflexividade
        }
    }

    public Cliente getClientePorIndice(int index) {
        if (index >= 0 && index < clientes.size()) {
            return clientes.get(index);
        }

        return null;
    }

    public boolean temClientes() {
        return !clientes.isEmpty();
    }


}