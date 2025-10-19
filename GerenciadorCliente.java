import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorCliente {
    private List<Cliente> clientes = new ArrayList<>();
    private Scanner scanner;

    public GerenciadorCliente(Scanner scanner){
        this.scanner = scanner;
    }

    public void cadastrarCliente(){
        System.out.println("CADASTRO DE CLIENTE");
        Cliente cliente = new Cliente();

        System.out.println("Nome do Cliente: ");
        cliente.setNome(scanner.nextLine());

        System.out.println("CPF:");
        cliente.setCpf((scanner.nextLine()));

        System.out.println("Endereco:");
        cliente.setEndereco(scanner.nextLine());

        System.out.println("Telefone:");
        cliente.setEndereco(scanner.nextLine());

        System.out.println("CADASTRO DO ANIMAL");
        Animal animal = cadastrarAnimal();

        if(animal != null){
            cliente.setAnimal(animal);
            clientes.add(cliente);
            System.out.println("CLIENTE E ANIMAL CADASTRADOS!");
        }
        else{
            System.out.println("ANIMAL NAO REGISTRADO!");
        }
    }


    private Animal cadastrarAnimal(){
        System.out.print("Nome do Animal: ");
        String nomeAnimal = scanner.nextLine();

        System.out.print("Idade do Animal: ");
        int idadeAnimal = (scanner.nextInt());

        System.out.print("Raça do Animal: ");
        String racaAnimal = scanner.nextLine();

        System.out.print("Tipo (1-Cachorro / 2-Gato / 3-Pássaro): ");
        int tipo = (scanner.nextInt());
        scanner.nextLine();


        Animal animal = null;

        if(tipo == 1){
            Cachorro c = new Cachorro();
            c.setNome(nomeAnimal);
            c.setIdade(idadeAnimal);
            c.setRaca(racaAnimal);

            System.out.println("Porte do Cachorro: ");
            c.setPorte(scanner.nextLine());

            animal = c;
        }
        else if(tipo == 2){
            Gato g = new Gato();
            g.setNome(nomeAnimal);
            g.setIdade((idadeAnimal));
            g.setRaca(racaAnimal);

            System.out.println("cor do gato: ");
            g.setCor(scanner.nextLine());

            animal = g;
        }
        else if(tipo == 3){
            Passaro p = new Passaro();
            p.setNome(nomeAnimal);
            p.setIdade(idadeAnimal);
            p.setRaca(racaAnimal);

            System.out.println("tipo de pena: ");
            p.setTipoPena(scanner.nextLine());

            animal = p;
        }
        else {
            System.out.println("erro no cadastro do animal");
        }
        return animal;
    }

    public void listarClientes(){
        System.out.println("DADOS DO CLIENTE");

        if(clientes.isEmpty()){
            System.out.println("nenhum cliente cadastrado");
            return;
        }

        for(int i = 0; i < clientes.size(); i++){
           Cliente c =  clientes.get(i);
            System.out.println("Cliente " + i+1);

            System.out.println("Nome: " + c.getNome() + "CPF: " + c.getCpf());
            System.out.println("Endereco: " + c.getEndereco() + "Telefone: " + c.getEndereco());

            String animalInfo;
            if (c.getAnimal() != null){
                animalInfo = c.getAnimal().getNome() + " (" + c.getAnimal().getRaca() + ")"; //Reflexividade
            }
            else{
                animalInfo = "nenhum";
            }
            System.out.println("Animal: " + animalInfo);
        }
    }

    public void listarClientesVisual(){
        for(int i = 0; i < clientes.size(); i++){
            Cliente c = clientes.get(i);
            System.out.println(i + c.getNome());
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
