
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class picture_gui{


	

	

	public static void main(String[] args) {
		new picture_gui();
	}

	public picture_gui() {
		showEasyButton();
		
	}

	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		URL url = null;
		try {
			url = new URL(
					"http://c1.staticflickr.com/1/388/19869412535_fa48a68041_c.jpg");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Icon icon = new ImageIcon(url);
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.pack();
	}

}
