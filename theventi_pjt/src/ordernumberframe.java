import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ordernumberframe extends JFrame {

	public ordernumberframe() {
		setTitle("");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);

		// Ȯ�� ��ư �̹���
		ImageIcon checkIcon = new ImageIcon("D:\\PORTFOLIO\\����Ƽ Ű����ũ\\����Ƽ �޴� �׸�\\check.png");
		Image checkImage = checkIcon.getImage();
		Image scheckImage = checkImage.getScaledInstance(140, 30, Image.SCALE_SMOOTH);
		ImageIcon scheckIcon = new ImageIcon(scheckImage);

		// MADE BY. �輺�� �ؽ�Ʈ �ִ� JLabel
		JLabel ksgJLabel = new JLabel("MADE BY. �輺��");
		ksgJLabel.setBounds(330, 0, 400, 40);
		ksgJLabel.setForeground(Color.black);
		ksgJLabel.setFont(new Font("Bauhaus", Font.PLAIN, 13));
		c.add(ksgJLabel);

		JLabel ordernumberJLabel = new JLabel(Integer.toString(receiptframe.OrderNumber));
		ordernumberJLabel.setBounds(165, 20, 100, 50);
		ordernumberJLabel.setHorizontalAlignment(JLabel.CENTER);
		ordernumberJLabel.setForeground(Color.blue);
		ordernumberJLabel.setFont(new Font("Bauhaus", Font.BOLD, 60));
		c.add(ordernumberJLabel);

		JLabel text1JLabel = new JLabel("����Ƽ�� �̿����ּż�");
		text1JLabel.setBounds(120, 90, 300, 30);
		text1JLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(text1JLabel);
		
		JLabel text2JLabel = new JLabel("�����մϴ�");
		text2JLabel.setBounds(170, 120, 300, 30);
		text2JLabel.setFont(new Font("Bauhaus", Font.BOLD, 20));
		c.add(text2JLabel);
		
		JLabel tcheckJLabel = new JLabel("Ȯ��");
		tcheckJLabel.setBounds(200, 175, 200, 20);
		tcheckJLabel.setForeground(Color.white);
		tcheckJLabel.setFont(new Font("Bauhaus", Font.BOLD, 17));
		c.add(tcheckJLabel);
		
		JLabel checkJLabel = new JLabel(scheckIcon);
		checkJLabel.setBounds(148, 170, scheckIcon.getIconWidth(), scheckIcon.getIconHeight());
		c.add(checkJLabel);
		checkJLabel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				dispose();
				orderdetailsframe.orderlist.clear();
			}
		});

		setSize(450, 280);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
