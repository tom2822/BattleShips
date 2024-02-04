/***
 * GameWindow.java Created: 02/02/2024
 * JDK-11.0.12.7
 * By: https://github.com/tom2822
 ***/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow implements ActionListener {

    RoundedFrame frame = new RoundedFrame(1280,1080);


    GameWindow(){

        // Button setup


        // Adding widgets to frame
        //frame.add(btnSingleplayer);
        //frame.add(btnMultiplayer);

        // Frame setup
        frame.setTitle("Battleships");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);                                       // Centers the window
        frame.setLayout(null);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // something here
    }
}
