import java.util.Scanner;

public class AberturaConta {
    static Scanner scan = new Scanner(System.in);

    public static void abrirConta(){
        Cliente cliente = new Cliente();
        System.out.print("Digite o Nome do Cliente: ");
        cliente.setNome(scan.next());

        System.out.println("Digite o tipo de conta a ser criado: ");
        System.out.println("(1) -> Conta Corrente");
        System.out.println("(2) -> Conta Poupança");
        System.out.print("Opção: ");
        int opcConta = scan.nextInt();
        if (opcConta == 1 || opcConta == 2) {
            Conta.depositar();
            System.out.println(String.format("Seu primeiro saldo é: R$ %.2f", Conta.saldo));
        } else {
            System.out.println("Não há saldo para ser mostrado");
        }
    }
}
