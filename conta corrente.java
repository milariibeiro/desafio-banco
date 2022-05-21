public class contacorrente extends conta {


    public contacorrente(cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta corrente ===");
        super.imprimirInfosComuns();

    }


}