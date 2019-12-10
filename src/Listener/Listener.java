package Listener;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Listener implements ActionListener {

    private JFrame frame;

    public Listener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        String action = e.getActionCommand();

        switch (action) {
            case "Save":
                System.out.println(action);
                update("SAVE");
                break;
            case "Preferences":
                System.out.println("Preferences");
                update("PREFERENCES");
                break;
            case "Size":
                System.out.println("Size");
                update("SIZE");
                break;
            case "Close":
                System.out.println("Close");
                frame.dispose();
                break;
            default:
                System.out.println("NOPE");
        }
    }

    private void update(String text) {
        JLabel textLabel = new JLabel(text, SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().removeAll();
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.pack();
    }

}
