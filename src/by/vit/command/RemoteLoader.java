package by.vit.command;

import by.vit.command.appliances.*;

public class RemoteLoader {
    public static void main(String[] args) {
        Light kitchenLight = new Light("kitchen");
        GarageDoor garageDoor = new GarageDoor();
        CellingFan cellingFan = new CellingFan();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(0,kitchenLight::on,kitchenLight::off);
        remoteControl.setCommand(1,garageDoor::up,garageDoor::down);
        remoteControl.setCommand(2,new CellingFanOnCommand(cellingFan),new CellingFanOffCommand(cellingFan));

        for (int i=0;i<3;i++){
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }

    }

}
