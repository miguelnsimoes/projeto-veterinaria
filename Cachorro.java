public class Cachorro extends Animal{
    private String porte;
    private boolean vacinadoRaiva;

    public Cachorro(){
        super();
        this.porte = "";
        this.vacinadoRaiva = false;
    }

    public String getPorte(){
        return porte;
    }

    public void setPorte(String porte){
        this.porte = porte;
    }

    public boolean isVacinadoRaiva() {
        return vacinadoRaiva;
    }

    public void setVacinadoRaiva(boolean vacinadoRaiva) {
        this.vacinadoRaiva = vacinadoRaiva;
    }

    //Sobrescrita
    @Override
    public String emitirSom(){
        return "Au au";
    }
}