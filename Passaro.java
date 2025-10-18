public class Passaro extends Animal{
    private String tipoPena;
    private boolean anilhado;

    public Passaro(){
        super();
        tipoPena = "";
        anilhado = false;
    }

    public String getTipoPena(){
        return tipoPena;
    }

    public void setTipoPena(String tipoPena){
        this.tipoPena = tipoPena;
    }

    public boolean isAnilhado(){
        return anilhado;
    }

    public void setAnilhado(boolean anilhado){
        this.anilhado = anilhado;
    }

    @Override
    public String emitirSom(){
        return "piu piu";
    }
}


