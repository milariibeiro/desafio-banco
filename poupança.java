public class poupanca extends conta {

    public poupanca(cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato poupança ===");
        super.imprimirInfosComuns();

    }



}