import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorVeterinario {

    private List<Veterinario> veterinarios = new ArrayList<>();
    private Scanner scanner;

    public GerenciadorVeterinario(Scanner scanner) {
        this.scanner = scanner;

        try {
            Veterinario vetPadrao = new Veterinario();
            vetPadrao.setNome("Dr. Miguel");
            vetPadrao.setCpf("111.222.333-44");
            vetPadrao.setCrmv("CRMV-PR 55555");
            vetPadrao.setSalario(6000.00);
            veterinarios.add(vetPadrao);
        }
        catch (SalarioInvalidoException | CrmvVazioException e) {
            System.out.println("Erro ao criar veterinário padrão: " + e.getMessage());
        }
    }

    public void cadastrarVeterinario(){
        System.out.println("--- CADASTRO DE VETERINARIO---");
        Veterinario vet = new Veterinario();

        System.out.println("Nome: ");
        vet.setNome(scanner.nextLine());

        System.out.println("CPF: ");
        vet.setCpf(scanner.nextLine());

        try{
            System.out.println("CRMV: (XXX.XXX.XXX-XX)");
            vet.setCrmv(scanner.nextLine()); // Lança CrmvVazioException

            System.out.println("Salario: (double) ");
            vet.setSalario(Double.parseDouble((scanner.nextLine())));// Lança SalarioInvalidoException

            veterinarios.add(vet);
            System.out.println("Veterinário cadastrado com sucesso!");
        }
        catch (SalarioInvalidoException e){
            System.out.println("erro no cadastro " + e.getMessage());
        }
        catch(CrmvVazioException e){
            System.out.println("erro no cadastro " + e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Erro: O salário deve ser um número. Cadastro cancelado.");
        }
    }

    public void listarVeterinario(){
        System.out.println("---RELATORIO DE VETERINARIOS---");
        if(veterinarios.isEmpty()){
            System.out.println("nenhum veterinario cadastrado");
            return;
        }
        for(int i = 0; i < veterinarios.size(); i++){
            Veterinario v = veterinarios.get(i);
            System.out.println("\n[veterinario " + i + "]");

            System.out.println("Nome: " + v.getNome() + "CPF: " + v.getCpf()); //Reflexividade
            System.out.println("CRMV: " + v.getCrmv() + "Salario: R$" + String.format("%.2f", v.getSalario()));//Reflexividade
            System.out.println("Bônus Anual: R$ " + String.format("%.2f", v.calcularBonusAnual())); //Reflexividade
        }
    }

    // Método auxiliar para seleção (usado no agendamento)
    public void listarVeterinariosVisual() {
        if (veterinarios.isEmpty()) {
            System.out.println("Nenhum veterinário disponível.");
            return;
        }
        for (int i = 0; i < veterinarios.size(); i++) {
            Veterinario v = veterinarios.get(i);
            System.out.println("[" + i + "] " + v.getNome()); //Reflexividade
        }
    }

    // Método de acesso para outros gerenciadores
    public Veterinario getVeterinarioPorIndice(int index) {
        if (index >= 0 && index < veterinarios.size()) {
            return veterinarios.get(index);
        }
        return null;
    }

    public boolean temVeterinarios() {
        return !veterinarios.isEmpty();
    }
}
}