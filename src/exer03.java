import java.util.Scanner;

public class exer03 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira o valor da base do retângulo:");
        float base = scanner.nextFloat();
        System.out.println("Insira o valor da altura do retângulo:");
        var altura = scanner.nextFloat();
        var area = base * altura;
        System.out.printf("A base é %s, a altura é %s e a área é %s", base, altura, area);
    }
}
