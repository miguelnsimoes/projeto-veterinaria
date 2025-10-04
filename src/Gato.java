public class Gato extends Animal {
    private String cor;

    public Gato(){
        super();
        this.cor = "";
    }

    public Gato(String nome, int idade, String raca, Cliente cliente, String cor){
        super(nome, idade, raca, cliente);
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
        return "Miau";
    }

}
