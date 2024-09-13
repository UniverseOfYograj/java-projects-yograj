package BankProject;
import java.awt.*;

public class demoGUI {
    ;

        public static void main(String[] args) {
            Frame f = new Frame("AWT Example"); // Creating a Frame
            Button b = new Button("Click Me");  // Creating a Button
            b.setBounds(50,100,80,30);          // Setting position of Button
            f.add(b);                           // Adding Button to Frame
            f.setSize(300,300);                 // Frame size
            f.setLayout(null);                  // No Layout Manager
            f.setVisible(true);                 // Making Frame visible
        }
    }


