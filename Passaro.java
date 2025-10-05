public class Passaro extends Animal {
    private String especie;
    private double tamanhoAsa;


    public Passaro(){
        super();
        this.especie = "";
        this.tamanhoAsa = 0.0;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public double getTamanhoAsa(){
        return tamanhoAsa;
    }

    public void setTamanhoAsa(double tamanhoAsa){
        this.tamanhoAsa = tamanhoAsa;
    }


    @Override
    public String emitirSom(){
        return "Piu-piu";
    }
}