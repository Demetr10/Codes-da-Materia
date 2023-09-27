public class Produto {

    private String nome;
    private double preco;
    private double peso;

    public Produto(String nome, double preco, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Nome: " + nome + " | Preço: R$" + preco + " | Peso: " + peso + " kg";
    }
}
/* */