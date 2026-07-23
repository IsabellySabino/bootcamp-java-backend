import java.util.Objects;

public non-sealed class Relogio1_2 extends Relogio1_0 {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday(){
        this.periodIndicator = "PM";
    }

    public void setBeforeMidday(){
        this.periodIndicator = "AM";
    }


    public void setHour(int hour) {
        if (hour > 12 && hour <= 23){
            setAfterMidday();
            this.hour = hour - 12;
        }else if ( hour >= 24){
            this.hour = 0;
        }else {
            this.hour =hour;
        }
    }

    @Override
    Relogio1_0 convert(Relogio1_0 relogio1_0) {
        this.second = relogio1_0.getSecond();
        this.minute = relogio1_0.getMinutes();
        switch (relogio1_0){
            case Relogio1_2 relogio1_2 -> {
                this.hour = relogio1_2.getHour();
                this.periodIndicator = relogio1_2.getPeriodIndicator();
            }
            case Relogio1_1 relogio1_1 ->this.setHour(relogio1_1.getHour());
        }
        return this;
    }
    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodIndicator;
    }
}
