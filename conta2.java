public interface conta2 {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor,Conta contaDestino);

    void imprimirExtrato();

    void simulacaoDeRendimento(double saldo);
}