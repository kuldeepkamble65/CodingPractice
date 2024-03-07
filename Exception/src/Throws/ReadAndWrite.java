package Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d:/abc.txt");
    }
    void saveFile() throws FileNotFoundException {
        String text= "this is demo";
        FileOutputStream fileOutputStream = new FileOutputStream("d:/xyz.txt");
    }
}
