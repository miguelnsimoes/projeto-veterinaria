public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String raca;

    private Cliente cliente;

    public Animal(){
        nome = "";
        idade = 0;
        raca = "";
        cliente = null;
    }

    public Animal(String nome, int idade, String raca,  Cliente cliente){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.cliente = cliente;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente dono){
        this.cliente = cliente;

        if(cliente != null && cliente.getAnimal() !=this){
            cliente.setAnimal(this);
        }
    }

    public abstract String emitirSom();


}
