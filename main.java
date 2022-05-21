public class Main {

    public static void main(String[] args) {

        Cliente Camila = new Cliente();
        Camila.setNome("Camila");

        Cliente Lorena = new Cliente();
        Lorena.setNome("Lorena");

        Cliente Nicole = new Cliente();
        Nicole.setNome("Nicole");

        Cliente Júlia = new Cliente();
        Júlia.setNome("Júlia");

        Conta cc = new ContaCorrente(Camila);
        Conta poupanca = new ContaPoupanca(Camila);

        ContaCorrente c1 = new ContaCorrente(Lorena);
        ContaPoupanca poupanca1  = new ContaPoupanca(Lorena);

        Conta c2 = new ContaCorrente(Nicole);
        ContaPoupanca poupanca2 = new ContaPoupanca(Nicole);

        Conta c3 = new ContaCorrente(Júlia);
        ContaPoupanca poupanca3 = new ContaPoupanca(Júlia);

        cc.depositar(870);
        cc.transferir(218, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        c1.depositar(96);
        c1.transferir(6,poupanca1);

        c1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        c2.depositar(900);
        c2.transferir(155, poupanca3);

        c2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        c3.depositar(468);
        c3.transferir(68,poupanca3);

        c3.imprimirExtrato();
        poupanca3.imprimirExtrato();

        poupanca.simulacaoDeRendimento(poupanca.getSaldo());
        poupanca1.simulacaoDeRendimento(poupanca.getSaldo());
        poupanca2.simulacaoDeRendimento(poupanca.getSaldo());
        poupanca3.simulacaoDeRendimento(poupanca.getSaldo());

    }
}