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

    public Consulta(Date data, String observacoes, Veterinario veterinario, Animal animal) {
        this.data = data;
        this.observacoes = observacoes;
        this.veterinario = veterinario;
        this.animal = animal;
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
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}