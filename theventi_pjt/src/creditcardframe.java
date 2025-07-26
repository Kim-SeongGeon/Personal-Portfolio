import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class creditcardframe extends JFrame {
	private Container c;
	private JLabel creditcardJLabel;
	private JLabel methodJLabel;

	public creditcardframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// �ſ�ī�� �̹���
		ImageIcon creditcardIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\creditcard.png");
		Image creditcardImage = creditcardIcon.getImage();
		Image screditcardImage = creditcardImage.getScaledInstance(200, 140, Image.SCALE_SMOOTH);
		ImageIcon screditcardIcon = new ImageIcon(screditcardImage);

		// MADE BY. �輺�� �ؽ�Ʈ �ִ� JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. �輺��");
		ksgJLabel.setBounds(370, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// �ſ�ī�� �̹��� �ִ� JLabel
		creditcardJLabel = new JLabel(screditcardIcon);
		creditcardJLabel.setBounds(140, 20, screditcardIcon.getIconWidth(), screditcardIcon.getIconHeight());
		c.add(creditcardJLabel);

		// ���� ��� ���� �ִ� JLabel
		methodJLabel = new JLabel("ī�带 ī�� �����⿡ �Ⱦ� �ּ���.");
		methodJLabel.setBounds(100, 200, 400, 20);
		methodJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(methodJLabel);

		Timer timer = new Timer(2000, e -> updateUI());
		timer.setRepeats(false);
		timer.start();

		setSize(500, 380);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void updateUI() {
		methodJLabel.setText("���� ������...");
		methodJLabel.setBounds(170, 210, 300, 30);
		methodJLabel.setFont(new Font("Bauhaus", Font.BOLD, 25));
		c.add(methodJLabel);

		c.revalidate();
		c.repaint();

		Timer timer = new Timer(2500, e -> new receiptframe());
		timer.setRepeats(false);
		timer.start();
	}
}
