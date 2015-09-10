
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Picture2{


	

	

	public static void main(String[] args) {
		new Picture2();
	}

	public Picture2() {
		showEasyButton();
		
	}

	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		URL url = null;
		try {
			url = new URL(
					"http://www.weebly.com/uploads/5/0/7/8/50789685/7162495_orig.png");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Icon icon = new ImageIcon(url);
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.pack();
	}

}
