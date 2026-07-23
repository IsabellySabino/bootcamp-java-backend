public class Carro1_0 {
    // PARTE 1: As primeiras funções que criam o carro e o estado inicial dele
    // inserir a marca do carro
    private String mark;

    //inserir a velocidade que começa em 0
    private int velocity;

    // crie esse construtor para criar o carro desligado
    private boolean on;

    private int march;

    //definições
    public Carro1_0 (String mark){
        this.mark= mark;
        this.march = 0;
        this.velocity = 0;
        this.on = false;

    }
    // PARTE 2:
    public void onCar(){
        if(this.on){
            System.out.println("O carro já está ligado");
        }else{
            this.on = true;
            System.out.println("O carro foi ligado com sucesso");

        }
    }
    public void off(){
        if (!on){
            System.out.println("O carro já está desligado.");
            return;
        }if (this.march == 0 && this.velocity == 0) {
            this.on = false;
            System.out.println("O carro foi desligado com sucesso.");
        } else {
            System.out.println("Não é possível desligar! O carro precisa estar parado (0 km/h) e em ponto morto.");
        }
    }public void accelerate(){
        if (!this.on){
            System.out.println("Não é possível acelerar, o carro está desligado");
            return;
        }
        else if (this.march == 0){
            System.out.println("O carro está em ponto morto (marcha 0). Engate uma marcha para acelerar!");
            return;
        }
        if ( velocity >= 120 ){
            System.out.println("Velocidade máxima de 120 km/h atingida!");
            return;
        }
        if (this.march == 1 && this.velocity >= 20) {
            System.out.println("Limite da 1ª marcha atingido! Troque para a 2ª para continuar acelerando.");
            return;
        }
        if (this.march == 2 && this.velocity >= 40) {
            System.out.println("Limite da 2ª marcha atingido! Troque para a 3ª para continuar acelerando.");
            return;
        }
        if (this.march == 3 && this.velocity >=60){
            System.out.println("Limite da 3ª marcha atingido! Troque para a 4ª para continuar acelerando.");
            return;
        }
        if (this.march == 4 && this.velocity >=80){
            System.out.println("Limite da 4ª marcha atingido! Troque para a 5ª para continuar acelerando.");
            return;
        }
        if (this.march == 5 && this.velocity >=100){
            System.out.println("Limite da 5ª marcha atingido! Troque para a 6ª para continuar acelerando.");
            return;
        }
        if (this.march ==6 && this.velocity >=120){
            System.out.println("Limite da 6ª marcha atingido!.");
            return;
        }
        this.velocity++;
        System.out.println("Acelerando... Velocidade atual: " + this.velocity + " km/h");
    }
    public void decrease(){
        if (!this.on){
            System.out.println("Não é possível desacelerar, o carro está desligado");
            return;
        }
        if ( velocity <= 0 ){
            System.out.println("O carro está parado");
            return;
        }
        this.velocity--;
        System.out.println("Desacelerando... Velocidade atual: " + this.velocity + " km/h");
    }
    public void right (){
        if (!this.on){
            System.out.println("Não é possível virar para a direita, o carro está desligado");
            return;
        }
        else if (this.march == 0){
            System.out.println("O carro está em ponto morto (marcha 0). Engate uma marcha para virar!");
            return;
        }
        if (this.velocity >= 1 && this.velocity <= 40){
            System.out.println("Virando a direita");
        }
    }
    public void left () {
        if (!this.on) {
            System.out.println("Não é possível virar para a esquerda, o carro está desligado");
            return;
        } else if (this.march == 0) {
            System.out.println("O carro está em ponto morto (marcha 0). Engate uma marcha para virar para a esquerda!");
            return;
        }
        if (this.velocity >= 1 && this.velocity <= 40){
            System.out.println("Virando a esquerda");
        }
    }
    public void verifyVelocity(){
        System.out.printf("Sua velocidade atual é: " + this.velocity + "km/h");
    }

    public void newMarch(int newMarch){
        if (newMarch == 0){
            if (this.velocity != 0) {
                System.out.println("Para colocar em ponto morto, o carro precisa estar parado!");
                return;
            }
        }
        else if (newMarch == 1){
            if (this.velocity < 0 || this.velocity > 20){
                System.out.println("Velocidade incompatível com a 1ª marcha (0 a 20 km/h).");
                return;
            }
        }
        else if (newMarch ==2){
            if (this.velocity < 21 || this.velocity > 40) {
                System.out.println("Velocidade incompatível com a 2ª marcha (21 a 40 km/h).");
                return;
            }
        }
        else if (newMarch == 3) {
            if (this.velocity < 41 || this.velocity > 60) {
                System.out.println("Velocidade incompatível com a 3ª marcha (41 a 60 km/h).");
                return;
            }
        }
        else if (newMarch == 4) {
            if (this.velocity < 61 || this.velocity > 80) {
                System.out.println("Velocidade incompatível com a 4ª marcha (61 a 80 km/h).");
                return;
            }
        }
        else if (newMarch == 5) {
            if (this.velocity < 81 || this.velocity > 100) {
                System.out.println("Velocidade incompatível com a 5ª marcha (81 a 100 km/h).");
                return;
            }
        }
        else if (newMarch == 6) {
            // Regra: 6ª marcha deve estar entre 101 e 120km
            if (this.velocity < 101 || this.velocity > 120) {
                System.out.println("Velocidade incompatível com a 6ª marcha (101 a 120 km/h).");
                return;
            }
        }
        else {
            System.out.println("Marcha inválida! Escolha de 0 a 6.");
            return;
        }
        int diferenca = newMarch - this.march;

        if (diferenca > 1 || diferenca < -1) {
            System.out.println("Erro: Você não pode pular marchas! Vá de uma em uma.");
            return;
        }
        this.march = newMarch;
        System.out.println("Marcha alterada para: " + this.march);
    }
}

