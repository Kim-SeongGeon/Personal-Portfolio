import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class giftcardframe extends JFrame {
	private Container c;
	private JLabel giftcardJLabel;
	private JLabel methodJLabel;
	private JLabel method1JLabel;

	public giftcardframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// ����ϻ�ǰ�� �̹���
		ImageIcon giftcardIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\giftcard.png");
		Image giftcardImage = giftcardIcon.getImage();
		Image sgiftcardImage = giftcardImage.getScaledInstance(200, 140, Image.SCALE_SMOOTH);
		ImageIcon sgiftcardIcon = new ImageIcon(sgiftcardImage);

		// MADE BY. �輺�� �ؽ�Ʈ �ִ� JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. �輺��");
		ksgJLabel.setBounds(370, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		// ����ϻ�ǰ�� �̹��� �ִ� JLabel
		giftcardJLabel = new JLabel(sgiftcardIcon);
		giftcardJLabel.setBounds(140, 20, sgiftcardIcon.getIconWidth(), sgiftcardIcon.getIconHeight());
		c.add(giftcardJLabel);

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
