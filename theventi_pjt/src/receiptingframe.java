import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class receiptingframe extends JFrame {

	public receiptingframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// ������ �̹���
		ImageIcon receiptIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\receipt.png");
		Image receiptImage = receiptIcon.getImage();
		Image sreceiptImage = receiptImage.getScaledInstance(200, 140, Image.SCALE_SMOOTH);
		ImageIcon sreceiptIcon = new ImageIcon(sreceiptImage);

		// MADE BY. �輺�� �ؽ�Ʈ �ִ� JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. �輺��");
		ksgJLabel.setBounds(330, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// ������ �̹��� �ִ� JLabel
		JLabel receiptJLabel = new JLabel(sreceiptIcon);
		receiptJLabel.setBounds(110, 20, sreceiptIcon.getIconWidth(), sreceiptIcon.getIconHeight());
		c.add(receiptJLabel);

		// ������ ����� �ؽ�Ʈ �ִ� JLabel
		JLabel textJLabel = new JLabel("������ �����...");
		textJLabel.setBounds(150,  180, 400, 20);
		textJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(textJLabel);
		
		Timer timer = new Timer(2000, e -> {
			receiptframe.insertdata();
			new ordernumberframe();
			dispose();
		});
		timer.setRepeats(false);
		timer.start();

		setSize(450, 280);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
