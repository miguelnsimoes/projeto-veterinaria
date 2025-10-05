public class Veterinario extends Pessoa implements PodeConsultar {
    private String crmv;
    private double salario;


    public Veterinario(){
        super();
        this.crmv = "";
        this.salario = 0.0;
    }

    public String getCrmv(){
        return crmv;
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
        return super.impDados() + " | CRMV: " + crmv + " | Salário: R$" + (salario);
    }


    @Override
    public void realizarConsulta(Consulta consulta) {

    }
}