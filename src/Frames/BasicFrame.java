package Frames;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import CreateBasic.Create;
import Listener.Listener;

/**
 * This class adds basic menu bar information
 *  -
 */
public class BasicFrame {
    public static void main(String[] args) {

        JFrame frame = new Create().Make();
        Listener listen = new Listener(frame);

        JMenuBar menuBar;
        JMenu menu, settings;
        JMenuItem menuItem;

        // Place where menus will be
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        // First menu (basket) -> e.g. File
        menu = new JMenu("File");
        menuBar.add(menu);

        // Item in menu (basket)
        menuItem = new JMenuItem("Save");
        menuItem.addActionListener(listen);
        menu.add(menuItem);

        // Menus within menu
        settings = new JMenu("Settings");

        menuItem = new JMenuItem("Preferences");
        menuItem.addActionListener(listen);
        settings.add(menuItem);

        menuItem = new JMenuItem("Size");
        menuItem.addActionListener(listen);
        settings.add(menuItem);

        menu.add(settings);

        // Adds a line in the list of menus
        menu.addSeparator();

        // When clicked close JFrame window
        menuItem = new JMenuItem("Close");
        menuItem.addActionListener(listen);
        menu.add(menuItem);


        // Sizes the frame to a sensible enough size
        frame.pack();

        frame.setVisible(true);

    }

}
