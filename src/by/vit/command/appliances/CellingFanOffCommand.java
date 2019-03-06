package by.vit.command.appliances;

import by.vit.command.Command;

public class CellingFanOffCommand implements Command {
    private CellingFan ceillingFan;

    public CellingFanOffCommand(CellingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        System.out.println("Celling fan is OFF");
    }
}
