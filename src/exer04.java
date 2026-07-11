import java.util.Scanner;

public class exer04 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        var nome1 = scanner.next();
        System.out.println("Qual a sua idade ?");
        var idade1 =scanner.nextInt();
        System.out.println("Qual o seu nome?");
        var nome2 = scanner.next();
        System.out.println("Qual a sua idade ?");
        var idade2 =scanner.nextInt();
        var dif = idade1 - idade2;
        System.out.printf("A diferença de idade entre %s e %s é de %s", nome1,nome2, dif );
    }
}
