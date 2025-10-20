import java.util.Date;

public class Consulta {
    private Date data;
    private String observacoes;

    private Veterinario veterinario;
    private Animal animal;

    public Consulta(){
        data = null;
        observacoes = "";
        veterinario = null;
        animal = null;
    }

    public Date getData() {
        return data;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public Veterinario getVeterinario() {
        return veterinario;
    }
    public Animal getAnimal() {
        return animal;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    //Sobrecarga
    public void setObservacoes(String sintomas, String diagnostico) {
        this.observacoes = "Sintomas: " + sintomas + "\nDiagnóstico: " + diagnostico;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}