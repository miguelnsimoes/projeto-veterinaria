public class Gato extends Animal {
    private String cor;

    public Gato(){
        super();
        cor = "";
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
