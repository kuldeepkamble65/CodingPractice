package Abstraction;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            RemoteControl remote = new TVRemotecontrol();

            remote.turnOn();
            remote.changeChannel(5);
            remote.adjustVolume(10);
            remote.turnOff();
        }
    }
