import java.util.Scanner;

public class OpcaoOperacao {
    static Scanner scan = new Scanner(System.in);

    public static void opcaoConta(){
        System.out.println("Digite a opção desejada:");
        System.out.println("[1].Saque");
        System.out.println("[2].Depósito");
        System.out.println("[3].Transfêrencia");
        System.out.println("[4].Abertura de Conta");
        System.out.print("Opção: ");
        int opcao = scan.nextInt();

        switch (opcao){
            case 1: Conta.sacar(); break;
            case 2: Conta.depositar(); break;
            case 3: InterfaceConta.trasnferir(); break;
            case 4: AberturaConta.abrirConta(); break;
            default: System.out.println("Opção inexistente !!!"); break;
        }
    }
}
