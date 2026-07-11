import java.util.Scanner;

public class exer06 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu peso:");
        float peso = scanner.nextFloat();
        System.out.println("Informe sua altura:");
        float altura = scanner.nextFloat();
        float imc = peso /(altura * altura );

        if (imc <= 18.5) System.out.println("Abaixo do pesso");

        else if  (imc >= 18.6 && imc <= 24.9) System.out.println("Peso ideal");

        else if (imc >= 25.0 && imc <= 29.9) System.out.println("Levemente acima do peso");

        else if (imc >=30 && imc <= 34.9) System.out.println("Obesidade Grau I");

        else if (imc >= 35 && imc<= 39.9) System.out.println("Obesidade Grau II (Severa)");

        else System.out.println("Obesidade Grau II (Mórbida)");

    }

}
