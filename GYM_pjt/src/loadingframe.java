import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class loadingframe {

	private JFrame frame;
	private JProgressBar progressBar;

	public loadingframe() {
		frame = new JFrame();
		progressBar = new JProgressBar(0, 100);

		initializeUI();
	}

	private void initializeUI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setSize(470, 70);

		progressBar.setStringPainted(true);
		progressBar.setForeground(Color.gray);

		startLoadingTask();

		frame.add(progressBar, BorderLayout.CENTER);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void startLoadingTask() {
		SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
			@Override
			protected Void doInBackground() throws Exception {
				for (int i = 0; i <= 100; ++i) {
					Thread.sleep(25);
					publish(i);
				}
				return null;
			}

			@Override
			protected void process(java.util.List<Integer> chunks) {
				int latestValue = chunks.get(chunks.size() - 1);
				progressBar.setValue(latestValue);
				progressBar.setString("잠시만 기다려주세요..." + latestValue + "%");
			}

			protected void done() {
				frame.dispose();
				new mainframe();
			}
		};

		worker.execute();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new loadingframe();
			}
		});
	}
}
