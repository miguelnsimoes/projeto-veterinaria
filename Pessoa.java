public abstract class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(){
        nome = "";
        cpf = "";
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}