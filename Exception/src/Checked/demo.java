package Checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class demo {
    public static void main(String[] args) {
      //  FileInputStream fileInputStream = new FileInputStream("D:abc.txt");
 try {
     FileInputStream fileInputStream = new FileInputStream("D:abc.txt");
 }catch (FileNotFoundException e){
     e.printStackTrace();
 }
 }
}
