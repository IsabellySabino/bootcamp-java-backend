public abstract sealed class Relogio1_0 permits Relogio1_1, Relogio1_2  {
    protected int hour;

    protected int minute;

    protected int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 24){
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }

    public int getMinutes() {
        return minute;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 60){
            this.minute=60;
            return;
        }
        this.minute = minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 60 ){
            this.hour = 60;
            return;
        }
        this.second = second;
    }
    private String format (int value){
        return value < 9 ? "0" + value : String.valueOf(value);
    }

    public String getTime(){
        return format(hour) + ":" + format(minute) + ":" + format(second);
    }

    abstract Relogio1_0 convert (Relogio1_0 relogio1_0);
}

