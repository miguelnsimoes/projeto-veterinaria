public class Cachorro extends Animal{
    private String porte;

    public Cachorro(){
        super();
        this.porte = "";
    }

    public Cachorro(String nome, int idade, String raca, Cliente cliente, String porte){
        super(nome, idade, raca, cliente);
        this.porte = porte;
    }

    public String getPorte(){
        return porte;
    }

    public void setPorte(String porte){
        this.porte = porte;
    }

    @Override
    public String emitirSom(){
        return "Au au";
    }
}
