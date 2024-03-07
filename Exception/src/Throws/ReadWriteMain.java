package Throws;

import java.io.FileNotFoundException;

public class ReadWriteMain {
    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        try {
            readAndWrite.readFile();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
