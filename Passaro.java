public class Passaro extends Animal{
    private String tipoPena;

    public Passaro(){
        super();
        tipoPena = "";
    }

    public String getTipoPena(){
        return tipoPena;
    }

    public void setTipoPena(String tipoPena){
        this.tipoPena = tipoPena;
    }

    @Override
    public String emitirSom(){
        return "piu piu";
    }
}


