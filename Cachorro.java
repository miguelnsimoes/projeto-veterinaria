public class Cachorro extends Animal{
    private String porte;

    public Cachorro(){
        super();
        porte = "";
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
