public class Veterinario extends Pessoa implements IBonificavel {
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


    public void setCrmv(String crmv) throws CrmvVazioException {
        if(crmv == null || crmv.trim().isEmpty()){
            throw new CrmvVazioException("O CRMV não pode ser nulo ou vazio.");
        }
        this.crmv = crmv;
    }


    public void setSalario(double salario) throws SalarioInvalidoException {
        if(salario <= 0){
            throw new SalarioInvalidoException("O salário deve ser um valor positivo.");
        }
        this.salario = salario;
    }

    //Sobrescrita
    @Override
    public double calcularBonusAnual() {
        // Lógica de negócio permitida (10% do salário)
        return this.salario * 0.10;
    }
}