public class Veterinario extends Pessoa{
    private String crmv;
    private double salario;

    public Veterinario(){
        super();
        crmv = "";
        salario = 0.0;
    }

    public Veterinario(String nome, String cpf, String crmv, double salario){
        super(nome, cpf);
        this.crmv = crmv;
        this.salario = salario;
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


}
