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

    public Cliente(String nome, String cpf, String endereco, String telefone, Animal animal){
        super(nome, cpf);
        this.endereco = endereco;
        this.telefone = telefone;
        this.animal = animal;

        if(this.animal != null && this.animal.getCliente() != this){
            this.animal.setCliente(this);
        }
    }



    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        if (this.animal != null && this.animal.getCliente() == this) {
            this.animal.setCliente(null);
        }

        this.animal = animal;

        if(animal != null && animal.getCliente() != this){
            animal.setCliente(this);
        }
    }


    @Override
    public void impDados() {
        super.impDados();
        String animalInfo = (animal != null)
                ? animal.getNome() + " (" + animal.getRaca() + ")"
                : "Nenhum";

        System.out.println("Endereço: " + endereco + " | Telefone: " + telefone + " | Animal: " + animalInfo);

    }

}
