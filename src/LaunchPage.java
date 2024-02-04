/***
 * LaunchPage.java Created: 02/02/2024
 * JDK-11.0.12.7
 * By: https://github.com/tom2822
 ***/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class LaunchPage implements ActionListener {
    RoundedFrame frame = new RoundedFrame(420,420);
    JButton btnSingleplayer = new JButton("Singleplayer");
    JButton btnMultiplayer = new JButton("Multiplayer");

    LaunchPage(){

        // Button setup
        btnSingleplayer.setBounds(100,160,200,40);
        btnSingleplayer.setFocusable(false);
        btnSingleplayer.addActionListener(this);

        btnMultiplayer.setBounds(100,100,200,40);
        btnMultiplayer.setFocusable(false);
        btnMultiplayer.addActionListener(this);


        // Adding widgets to frame
        frame.add(btnSingleplayer);
        frame.add(btnMultiplayer);

        // Frame setup
        frame.setTitle("Battleships");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);                                       // Centers the window
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // single player

        if(e.getSource()==btnSingleplayer) {
            System.out.println("singleplayer");
            GameWindow sp = new GameWindow();
            //frame.setVisible(false);
        }

        if(e.getSource()==btnMultiplayer) {
            GameWindow mp = new GameWindow();
        }

        // multiplayer
    }
}