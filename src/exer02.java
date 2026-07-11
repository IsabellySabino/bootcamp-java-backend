import java.util.Scanner;

public class exer02 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira o tamhanho de um lado do quadrado:");
        var lado = scanner.nextInt();
        var area = lado * lado;
        System.out.printf("A área do quadrado é %s\n", area);
    }
}
