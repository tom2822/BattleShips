/***
 * RoundedFrame.java Created: 02/02/2024
 * JDK-11.0.12.7
 * By: https://github.com/tom2822
 ***/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class RoundedFrame extends JFrame implements ActionListener {

    JPanel header = new JPanel();
    JButton btnQuit = new JButton("X");
    JButton btnMini = new JButton("-");

    int posX, posY = 0;

    public RoundedFrame(int width, int height) {
        System.out.println("HERE");
        setUndecorated(true);

        setLocationRelativeTo(null);

        // Rounded edges

        setSize(width, height);

        setShape(new RoundRectangle2D.Double(0, 0, width, height, 20, 20));

        btnMini.addActionListener(this);
        btnMini.setBounds((width - 60),20, 25, 25);
        btnMini.setFocusable(false);
        btnMini.setBackground(Color.WHITE);

        btnQuit.addActionListener(this);
        btnQuit.setBounds((width - 30),20,25,25);
        btnQuit.setFocusable(false);
        btnQuit.setBackground(Color.RED);

        // Add widgets to frame
        add(btnMini);
        add(btnQuit);
        add(header);


        header.setBackground(Color.lightGray);
        header.setVisible(true);
        header.setSize(getX(),50);
        header.setLocation(0,0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnQuit) {
            // add popup
            System.exit(0);
        }

        if(e.getSource()==btnMini) {
            setState(JFrame.ICONIFIED);
        }

    }
}
