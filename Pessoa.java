public abstract class Pessoa implements Registravel {
    private String nome;
    private String cpf;

    public Pessoa(){
        this.nome = "";
        this.cpf = "";
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new NomeInvalidoException("O nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public void setCpf(String cpf) throws CpfInvalidoException {

        if (cpf == null || cpf.length() != 11) {
            throw new CpfInvalidoException("O cpf deve ter 11 dígitos numéricos.");
        }
        this.cpf = cpf;
    }


    @Override
    public String impDados() {
        return "Nome: " + nome + " | CPF: " + cpf;
    }
}