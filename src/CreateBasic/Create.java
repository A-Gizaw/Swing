package CreateBasic;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Create {

	public JFrame Make() {
		JFrame frame = new JFrame("Simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = createImageIcon("images/zoro.png","Roronoa Zoro");

		JLabel textLabel = new JLabel("I'm a label in the window",icon ,SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(300, 100));

		frame.getContentPane().add(textLabel, BorderLayout.CENTER);

		frame.setLocationRelativeTo(null);

		return frame;
	}
	
    /**
     * Creates an ImageIcon if the path is valid.
     * @param path - resource path
     * @param description - description of the file
     */
    private ImageIcon createImageIcon(String path,
            String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
			System.err.println("IMAGE URL : "+imgURL+"\nDESCRIPTION : "+description);
			return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

}

/*
 *  Trying to get the icons to work. 
 * 
 * */
 