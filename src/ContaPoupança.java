public class ContaPoupança extends Conta {
    public ContaPoupança(Cliente cliente) {
        super(String.valueOf(cliente));
    }
    public static void imprimirExtrato() {
        System.out.println("=== Saldo da Conta Poupança ===");
        imprimirInfoComuns();
    }
}

