public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(String.valueOf(cliente));
    }

    public static void imprimirExtato() {
        System.out.println("=== Saldo da Conta Corrente ===");
        imprimirInfoComuns();
    }
}
