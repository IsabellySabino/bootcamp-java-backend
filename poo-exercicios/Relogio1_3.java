public class Relogio1_3 {
    public static void main(String[] args) {
        Relogio1_1 relogio1_1 = new Relogio1_1();
        relogio1_1.setSecond(0);
        relogio1_1.setMinutes(0);
        relogio1_1.setHour(13);

        System.out.println(relogio1_1.getTime());

        System.out.println(new Relogio1_2().convert(relogio1_1).getTime());
    }
}
