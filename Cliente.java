package projeto;

public class Cliente extends Pessoa{
    private String endereco;
    private String telefone;

    private Animal animal;

    public Cliente(){
        super("", "");
        endereco = "";
        telefone = "";
        this.animal = null;
    }

    public Cliente(String nome, int cpf, String endereco, String telefone, Animal animal){
        super(nome, cpf);
        this.endereco = endereco;
        this.telefone = telefone;
        this.animal = animal;
    }



    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    @Override
    public String impDados() {
        return super.impDados() + " | Endereço: " + endereco +
                " | Animal: " + animal.getNome() + " (" + animal.getRaca() + ")";
    }

}
