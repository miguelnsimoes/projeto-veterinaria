public class Veterinario extends Pessoa implements PodeConsultar{
    private String crmv;
    private double salario;

    public Veterinario(){
        super();
        crmv = "";
        salario = 0.0;
    }

    public String getCrmv(){
        return  crmv;
    }

    public double getSalario(){
        return salario;
    }

    public void setCrmv(String crmv){
        this.crmv = crmv;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public void impDados(){
        super.impDados();
        System.out.println("CRMV: " + crmv + " | Salário: " + salario);
    }

    @Override
    public void realizarConsulta(Consulta consulta){
        System.out.println("\n--- REGISTRO DE CONSULTA ---");
        System.out.println("Veterinário: " + this.getNome());
        System.out.println("Animal: " + consulta.getAnimal().getNome());
        System.out.println("Data: " + consulta.getData());
        System.out.println("Observação: " + consulta.getObservacoes());
        System.out.println("---------------------------\n");
    }


}
