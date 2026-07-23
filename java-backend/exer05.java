import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
        System.out.println("Informe um número: ");
        var numero = scanner.nextInt();
        var contador = 1;

        while (contador <= 10){
            var resultado = numero * contador;
            System.out.printf("%s x %s = %s\n", numero, contador, resultado );
            contador += 1;
        }
    }
}
