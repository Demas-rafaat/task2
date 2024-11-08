package a2;
import javax.swing.*;
import java.io.*;

public class A2 {
    public static void main(String[] args) {
        String p = JOptionPane.showInputDialog(null, "Enter the file name", "File Name:", JOptionPane.INFORMATION_MESSAGE);
        File f = new File(p);

        if (f.exists()) {
            System.out.println("Directory is already created.");
        } else {
            f.mkdir();
            System.out.println("Directory is created successfully .");
        }
        
    }
}
