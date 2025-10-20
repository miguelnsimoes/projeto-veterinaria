public class Passaro extends Animal {
    private String tipoPena; // 1º atributo
    private boolean anilhado; // 2º atributo

    public Passaro() {
        super();
        this.tipoPena = "";
        this.anilhado = false;
    }

    public String getTipoPena() {
        return tipoPena;
    }

    public void setTipoPena(String tipoPena) {
        this.tipoPena = tipoPena;
    }

    public boolean isAnilhado() {
        return anilhado;
    }

    public void setAnilhado(boolean anilhado) {
        this.anilhado = anilhado;
    }

    //Sobrescrita
    @Override
    public String emitirSom() {
        return "piu piu";
    }
}