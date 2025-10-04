package projeto;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String raca;

    private Cliente dono;

    public Animal(){
        nome = "";
        idade = 0;
        raca = "";
    }

    public Animal(String nome, int idade, String raca, Cliente dono){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.dono = dono;
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


    public abstract String emitirSom();


}
