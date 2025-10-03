package projeto;

public class Cliente extends Pessoa{
    private String endereco;
    private Animal animal;

    public Cliente(){
        super();
    }

    public Cliente(String nome, int cpf, String endereco, Animal animal){
        super(nome, cpf);
        this.endereco = endereco;
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

    @Override
    public String impDados() {
        return super.impDados() + " | Endereço: " + endereco +
                " | Animal: " + animal.getNome() + " (" + animal.getRaca() + ")";
    }

}
