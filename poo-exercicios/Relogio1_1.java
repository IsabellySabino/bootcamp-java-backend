import java.util.Objects;

public non-sealed class Relogio1_1 extends Relogio1_0 {

    @Override
    public Relogio1_0 convert(final Relogio1_0 relogio1_0) {
        switch (relogio1_0){
            case Relogio1_2 relogio1_2 ->{

                this.hour = Objects.equals(relogio1_2.getPeriodIndicator(), "PM")
                        ? relogio1_2.getHour() + 12
                        : relogio1_2.getHour();


            }
            case Relogio1_1 relogio1_1 ->this.hour = relogio1_1.getHour();
        }
        return this;
    }
}
