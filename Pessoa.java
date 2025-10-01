package projeto;

public abstract class Pessoa {
    protected String nome;
    protected int cpf;

    public Pessoa(){

    }

    public Pessoa(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome(){
        return nome;
    }

    public int getCpf(){
        return cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    @Override
    public String impDados(){
        System.out.println("Nome: " + nome + "CPF: " + cpf);
    }


}
