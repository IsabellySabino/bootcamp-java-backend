import java.time.OffsetDateTime;
import java.util.Scanner;

public class exer01 {

    public static void main(String[] args) {
        var baseYear = OffsetDateTime.now().getYear();
       var scanner = new Scanner(System.in);
       System.out.println("Qual é o seu nome?");
       var nome= scanner.next();
       System.out.println("Qual o ano que você nasceu?");
       var ano = scanner.nextInt();
       var idade = baseYear - ano ;
       System.out.printf("Olá %s, você tem %s anos\n", nome, idade );

    }

}