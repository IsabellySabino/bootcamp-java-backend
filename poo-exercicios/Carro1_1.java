import java.util.Scanner;

public class Carro1_1 {
    private final static Scanner scanner = new Scanner(System.in);
    private static Carro1_0  carro1_1 = null;

    public static void main (String[] args){
        scanner.useDelimiter("\\n");
        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Ligar o carro ");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda");
            System.out.println("6 - Virar para direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Trocar marcha");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option){
                case 1: onCar();
                break;
                case 2: carro1_1.off();
                break;
                case 3: carro1_1.accelerate();
                break;
                case 4: carro1_1.decrease();
                break;
                case 5: carro1_1.left();
                break;
                case 6: carro1_1.right();
                break;
                case 7: carro1_1.verifyVelocity();
                break;
                case 8: System.out.print("Digite a nova marcha (0 a 6): ");
                int marcha = scanner.nextInt();
                carro1_1.newMarch(marcha);
                break;
                case 0: System.out.println("Saindo do sistema...");
                break;
                default: System.out.println("Opção Inválida");

            }
        }while (option != 0);
    }
    private static void onCar(){
        System.out.println("Digite a marca do carro:");
        String nome = scanner.next();

        carro1_1 = new Carro1_0(nome);
        carro1_1.onCar();
    }
}

