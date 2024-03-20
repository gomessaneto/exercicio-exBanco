package exercicioexbanco;
import exercicioexbanco.Conta;

public class CadastrarConta {
    private Conta[] contas;
    private int numContas;
    
  public CadastrarConta(int tamanho) {
        this.contas = new Conta[tamanho];
        this.numContas = 0;
    }  
    
  public void adicionarConta(String nome, double valor) {
        if (this.numContas < this.contas.length) {
            contas[numContas] = new Conta(nome, valor);
            numContas++;
            System.out.println("Conta adicionada com sucesso!");
        } else {
            System.out.println("Não é possível adicionar mais contas. Limite excedido.");
        }
    }

    public void listarContas() {
        System.out.println("Listagem de Contas:");
        for (int i = 0; i < this.numContas; i++) {
            System.out.println(i+ ". " + "Nome: " + this.contas[i].nome + ", Valor: " + this.contas[i].valor);
        }
    }
  
    public void procurarConta(String nome) {
        boolean encontrou = false;
        System.out.println("Procurando conta de " + nome + ":");
        for (int i = 0; i < numContas; i++) {
            if (this.contas[i].nome.equalsIgnoreCase(nome)) {
                System.out.println("Conta encontrada - Nome: " + contas[i].nome + ", Valor: " + contas[i].valor);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Conta de " + nome + " não encontrada.");
        }
    }
    
    public void adicionarContaEmPosicao(String nome, int posicao) {
        if (posicao >= 0 && posicao < contas.length) {
            if (numContas < contas.length) {
                for (int i = numContas; i > posicao; i--) {
                    contas[i] = contas[i - 1];
                    
                }
                
                contas[posicao] = new Conta(nome, contas[posicao - 1].valor);
                numContas++;
                System.out.println("Conta movida com sucesso para a posição " + posicao + "!");
            } else {
                System.out.println("Não é possível adicionar mais contas. Limite excedido.");
            }
        } else {
            System.out.println("Posição inválida. Por favor, escolha uma posição dentro do limite.");
        }
    }
}