package Abstraction;

abstract class RemoteControl {

    // this method for change channel
    public abstract void changeChannel(int channel);

    public abstract void adjustVolume(int volume);

    public void turnOn(){
        System.out.println("remote control is on");
    }

    public void turnOff() {
        System.out.println("Remote Control is off");
    }



}
