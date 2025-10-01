package projeto;

public class Veterinario extends Pessoa{
    private String crmv;
    private double salario;

    public Veterinario(){
        super();
    }

    public Veterinario(String nome, int cpf, String crmv, double salario){
        super(nome,cpf);
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
    public String impDados(){
        System.out.println(super.impDados() + " | CRMV: " + crmv + " | Salário: " + salario;);
    }


}
