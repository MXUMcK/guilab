import javax.swing.*;
import java.awt.*;

public class Lab1Part3 extends JFrame {

    JPanel buttonPanel = new JPanel();
    JButton saveButton = new JButton("SAVE");
    JButton openButton = new JButton("OPEN");

    ImageIcon saveImage = new ImageIcon("./images/saveImage.png");
    ImageIcon openImage = new ImageIcon("./images/openImage.png");




    public Lab1Part3(){

        Container contentPane = getContentPane();

        contentPane.add(buttonPanel);

        saveButton.setIcon(saveImage);
        openButton.setIcon(openImage);

        buttonPanel.add(saveButton);
        buttonPanel.add(openButton);


        setSize(600,600);
        setLocation(800,400);
        setVisible(true);
        setResizable(false);
    }

}
