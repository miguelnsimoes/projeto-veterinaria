package projeto;

public class Cliente extends Pessoa{
    private String endereco;

    public Cliente(){
        super();
    }

    public Cliente(String nome, int cpf, String endereco){
        super(nome, cpf);
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    @Override
    public String impDados(){
        System.out.println(super.impDados() + " | Endereço: " + endereco;);
    }

}
