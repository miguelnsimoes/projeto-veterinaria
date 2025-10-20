public class Gato extends Animal {
    private String cor;
    private boolean testadoFivFelv;

    public Gato(){
        super();
        cor = "";
        testadoFivFelv = false;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public boolean isTestadoFivFelv() {
        return testadoFivFelv;
    }

    public void setTestadoFivFelv(boolean testadoFivFelv) {
        this.testadoFivFelv = testadoFivFelv;
    }

    //Sobrescrita
    @Override
    public String emitirSom(){
        return "Miau";
    }
}