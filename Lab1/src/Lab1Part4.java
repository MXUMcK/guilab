import javax.swing.*;
import java.awt.*;

public class Lab1Part4 extends JFrame {

    JPanel holderPanel = new JPanel();
    JTextField myName = new JTextField("Paul McKeon");
    JTextField describeMe = new JTextField("Hi my name is Paul, I really enjoy going to the gym for fitness and mental health. I also really enjoy computing and programming!.");
    JLabel imageOfMe = new JLabel("This is me");
    JButton thumbsUp = new JButton("Like!");

    ImageIcon myImage = new ImageIcon("./images/me.jpg");
    ImageIcon thumbImg = new ImageIcon("./images/thumbs-up.png");



    public Lab1Part4(){

        Container contentPane = getContentPane();
        contentPane.add(holderPanel);

        imageOfMe.setIcon(myImage);
        thumbsUp.setIcon(thumbImg);

        holderPanel.add(myName);
        holderPanel.add(describeMe);
        holderPanel.add(imageOfMe);
        holderPanel.add(thumbsUp);





        setTitle("About me!");
        setSize(800,600);
        setVisible(true);
        setResizable(true);
        setLocation(800,400);
    }

}
