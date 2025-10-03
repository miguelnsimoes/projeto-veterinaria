public abstract class Servico {
    protected double preco;
    protected int duracao;

    public Servico() {

    }

    public Servico(double preco, int duracao) {
        this.preco = preco;
        this.duracao = duracao;
    }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getDuracao() { return duracao; }
    public void setDuracao(int duracao) { this.duracao = duracao; }


    public abstract String descricao();
}
