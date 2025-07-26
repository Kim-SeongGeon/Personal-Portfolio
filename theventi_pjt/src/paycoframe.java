import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class paycoframe extends JFrame {

	private Container c;
	private JLabel paycoJLabel;
	private JLabel methodJLabel;
	private JLabel method1JLabel;

	public paycoframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// ������ �̹���
		ImageIcon paycoIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\payco.png");
		Image paycoImage = paycoIcon.getImage();
		Image spaycoImage = paycoImage.getScaledInstance(200, 140, Image.SCALE_SMOOTH);
		ImageIcon spaycoIcon = new ImageIcon(spaycoImage);

		// MADE BY. �輺�� �ؽ�Ʈ �ִ� JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. �輺��");
		ksgJLabel.setBounds(370, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// ������ �̹��� �ִ� JLabel
		paycoJLabel = new JLabel(spaycoIcon);
		paycoJLabel.setBounds(140, 20, spaycoIcon.getIconWidth(), spaycoIcon.getIconHeight());
		c.add(paycoJLabel);

		// ���� ��� ���� �ִ� JLabel
		methodJLabel = new JLabel("���ڵ� �ν��� ���� ���ڵ带");
		methodJLabel.setBounds(115, 200, 300, 20);
		methodJLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(methodJLabel);

		// ���� ��� ���� �ִ� JLabel
		method1JLabel = new JLabel("���ڵ� �����⿡ ������ �ּ���.");
		method1JLabel.setBounds(100, 230, 300, 20);
		method1JLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(method1JLabel);

		// Timer ���� : 3�� �Ŀ� ����
		Timer timer = new Timer(2000, e -> updateUI());
		timer.setRepeats(false);
		timer.start();

		setSize(500, 380);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void updateUI() {
		// ������ JLabel ������Ʈ ����
		c.remove(method1JLabel);

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
