package by.vit.command.appliances;

public class CellingFan {
    public enum Speed {HIGH,MEDIUM,LOW,OFF}
    private Speed speed=Speed.OFF;

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
}
