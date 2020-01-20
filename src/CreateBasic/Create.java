package CreateBasic;

import javax.swing.*;
import java.awt.*;

public class Create {

	public JFrame Make() {

		//New instance of frame - Title at top of frame
		JFrame frame = new JFrame("Simple GUI");

		/*
		What to do when you close the frame (red X)
			Could also use DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE
				DO_NOTHING_ON_CLOSE - Fake button
				HIDE_ON_CLOSE - Keeps tab open but can't be seen by user
				DISPOSE_ON_CLOSE - Closes JFrame
				EXIT_ON_CLOSE - Terminates whole application
		*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//New instance of a text label. Where it's to be displayed within a container
		JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);

		//Set initial size for text space
		textLabel.setPreferredSize(new Dimension(300, 100));

		//Adds the JLable component to the frame container
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);

		//Change background colour of container JFrame
		frame.getContentPane().setBackground(new Color(0xEA6B0C));
		System.out.println(frame.getContentPane());
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
 