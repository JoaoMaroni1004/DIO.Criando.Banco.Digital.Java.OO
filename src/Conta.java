import java.util.Scanner;

public abstract class Conta implements InterfaceConta {
    static Scanner scan = new Scanner(System.in);

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected static int agencia;
    protected static int numeroConta;
    protected static double saldo;
    protected static Cliente cliente;

    public Conta(String cliente) {
        return;
    }

    public static String Conta1(){
        agencia = Conta.AGENCIA_PADRAO;
        numeroConta = SEQUENCIAL ++;
        Cliente.cliente = String.valueOf(cliente);
        String cliente;
        return Conta1();
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

    public static void sacar() {
        System.out.print("Digite o valor a ser sacado: ");
        double valor = scan.nextDouble();
        saldo = saldo - valor;
        ContaCorrente.imprimirExtato();
    }
    
    public static void depositar() {
        System.out.print("Digite o valor à ser depositado: ");
        double valor = scan.nextDouble();
        Conta.saldo = saldo + valor;
    }
    public static void transferir() {
        System.out.print("Digite o valor a ser transferido: ");
        double valor = scan.nextDouble();
        System.out.print("Digite o tipo de conta para transferir: ");
        Conta contaDestino = null;
        InterfaceConta.sacar();
        contaDestino.depositar();
        ContaCorrente.imprimirExtato();
    }
    protected static void imprimirInfoComuns() {
        System.out.printf("Titular: %s%n", cliente);
        System.out.printf("Agencia: %d%n", agencia);
        System.out.printf("Número da Conta: %d%n", numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}
