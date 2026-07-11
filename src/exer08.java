import java.util.Scanner;

public class exer08 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número");
        var num = scanner.nextInt();
        while (true){
            System.out.println("Informe o número para verificação:");
            var toVerify = scanner.nextInt();
            if (toVerify < num){
                System.out.printf("Informe um número maior que %s\n", num);
                continue;
            }
            var result = toVerify % num;
            System.out.printf("%s %% %s = %s\n", toVerify, num, result);
            if (result != 0)break;
        }
    }
}
