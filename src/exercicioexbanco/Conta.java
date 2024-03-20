
package exercicioexbanco;

public class Conta {
    
    String nome;
    double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Conta(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
}
