package projeto;

public class Gato extends Animal {
    private String cor;

    public Gato(){
        super();
    }

    public Gato(String nome, int idade, String raca, String cor){
        super(nome, idade, raca);
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    @Override
    public String emitirSom(){
        System.out.println("miau");
    }
}
