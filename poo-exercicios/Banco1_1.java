import java.util.Scanner;

public class Banco1_1 {
    private final static Scanner scanner = new Scanner(System.in);
    private static Banco1_0 conta = null;

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Consultar cheque especial");
            System.out.println("4 - Depositar");
            System.out.println("5 - Sacar");
            System.out.println("6 - Pagar boleto");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            if (option > 1 && option <= 6 && (conta == null || !conta.isHasacoount())) {
                continue; // Volta para o início do menu
            }
            switch (option){
                case 1 -> newAccount();
                case 2 -> conta.verifyBalance();
                case 3 -> conta.verifyCheck();
                case 4 -> deposit();
                case 5 -> withdraw();
                case 6 -> payBill();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção Inválida");

            }
        }while (option != 0);
    }
    private static void newAccount() {
        System.out.println("Digite o nome do titular:");
        String nome = scanner.next();

        System.out.println("Digite o valor do depósito inicial:");
        double depositoInicial = scanner.nextDouble();

        conta = new Banco1_0(nome, depositoInicial, 0);
        System.out.println("Conta criada com sucesso para " + conta.getCreateAccount() + "!");
    }
    public static void deposit(){
        System.out.println("Digite o valor do depósito:");
        double amount = scanner.nextDouble();
        conta.deposit(amount);
    }
    public static void withdraw(){
        System.out.println("Digite o valor para sacar:");
        double amount = scanner.nextDouble();
        conta.withdraw(amount);
    }
    public static void payBill() {
        System.out.println("Digite o valor do boleto:");
        double amount = scanner.nextDouble();
        conta.payBill(amount);
    }

}


