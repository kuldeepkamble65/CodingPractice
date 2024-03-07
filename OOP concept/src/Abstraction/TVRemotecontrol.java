package Abstraction;

public class TVRemotecontrol extends RemoteControl{


    @Override
    public void changeChannel(int channel) {
        System.out.println("changing channel to "+channel);
    }

    @Override
    public void adjustVolume(int volume) {
        System.out.println("Adjusting volume to " +volume);

    }
}
