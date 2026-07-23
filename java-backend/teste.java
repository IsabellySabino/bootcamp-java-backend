import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        var scanner= new Scanner(System.in);
        int saldo = scanner.nextInt();
        int valorTransacao = scanner.nextInt();

        // TODO: Verifique se o saldo é suficiente e imprima a mensagem apropriada
        if (saldo >= valorTransacao && saldo == valorTransacao){
            System.out.println("Transação Aprovada");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        scanner.close();
        }
    }


