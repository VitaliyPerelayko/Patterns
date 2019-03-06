package by.vit.command.appliances;

public class Light{
    String location;

    public Light(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("Light in "+ location +" is on");
    }

    public void off(){
        System.out.println("Light in "+ location +" is off");
    }
}
