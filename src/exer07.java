import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        var num2 = scanner.nextInt();

        while (num2 <= num1) {
            System.out.println("Número inválido! O segundo número deve ser maior que o primeiro.");
            System.out.println("Informe o segundo número novamente:");
            num2 = scanner.nextInt();
        }

        System.out.println("Par(p) ou Ímpar(i):");
        var escolha = scanner.next();

        if (escolha.equals("p")){
            for (int i = num2; i>= num1; i--){
                if (i% 2 == 0){
                    System.out.println(i);
                }

            }

        }
        else if (escolha.equals("i")){
            for (int j = num2; j >= num1; j--){
                if (j% 2 != 0){
                    System.out.println(j);
                }
            }
        }

    }
}
