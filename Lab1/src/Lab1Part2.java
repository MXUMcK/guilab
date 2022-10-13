import javax.swing.*;
import java.awt.*;

public class Lab1Part2 extends JFrame {


    JLabel labelNoImage = new JLabel("This is a label with no image");
    JLabel imageLabel = new JLabel("label with image");

    ImageIcon bugImg = new ImageIcon("C:\\Users\\Paul\\IdeaProjects\\Lab1\\images\\bug1.GIF");

    JPanel holderPanel = new JPanel(); // JPanel

    public Lab1Part2(){
        imageLabel.setIcon(bugImg);
        Container contentPane = getContentPane();

        holderPanel.add(labelNoImage);
        holderPanel.add(imageLabel);

        contentPane.add(holderPanel);

        setSize(500,500);
        setLocation(600,400);
        setResizable(false);
        setVisible(true);


    }


}
