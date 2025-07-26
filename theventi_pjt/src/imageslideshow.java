import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Arrays;

public class imageslideshow extends JFrame {
	private List<String> imagePaths;
	private int currentIndex = 0;
	private JLabel imageLabel;
	private Timer timer;

	public imageslideshow() {
		List<String> imagePaths = Arrays.asList("D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\imageslide1.png",
				"D:\\PORTFOLIO\\더벤티 키오스크\\더벤티 메뉴 이미지\\imageslide2.png");

		this.imagePaths = imagePaths;
		imageLabel = new JLabel();
		imageLabel.setHorizontalAlignment(JLabel.CENTER);
		imageLabel.setVerticalAlignment(JLabel.CENTER);

		setLayout(new BorderLayout());
		add(imageLabel, BorderLayout.CENTER);
		setSize(550, 820);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		imageLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				showMainFrame();
			}
		});

		startSlideshow();
		setVisible(true);
	}

	private void startSlideshow() {
		timer = new Timer(2000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateImage();
			}
		});
		timer.start();
		updateImage();
	}

	private void updateImage() {
		if (imagePaths.size() > 0) {
			ImageIcon icon = new ImageIcon(imagePaths.get(currentIndex));
			Image image = icon.getImage();
			Image scaledImage = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
			icon = new ImageIcon(scaledImage);
			imageLabel.setIcon(icon);
			currentIndex = (currentIndex + 1) % imagePaths.size();
		}
	}

	public void showMainFrame() {
		new mainframe();
		dispose();
	}

	public static void main(String[] args) {
		new imageslideshow();
	}
}
