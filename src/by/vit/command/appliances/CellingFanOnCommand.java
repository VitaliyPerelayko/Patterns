package by.vit.command.appliances;

import by.vit.command.Command;

public class CellingFanOnCommand implements Command {
    private CellingFan ceillingFan;
    private CellingFan.Speed prevSpeed;

    public CellingFanOnCommand(CellingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceillingFan.getSpeed();
        switch (prevSpeed){
            case LOW:{
                ceillingFan.setSpeed(CellingFan.Speed.MEDIUM);
                System.out.println("Celling fan speed is MEDIUM");
                break;
            }
            case MEDIUM:{
                ceillingFan.setSpeed(CellingFan.Speed.HIGH);
                System.out.println("Celling fan speed is HIGH");
                break;
            }
            case HIGH:{
                ceillingFan.setSpeed(CellingFan.Speed.LOW);
                System.out.println("Celling fan speed is LOW");
                break;
            }
            case OFF:{
                ceillingFan.setSpeed(CellingFan.Speed.LOW);
                System.out.println("Celling fan speed is LOW");
                break;
            }
        }
    }
}
