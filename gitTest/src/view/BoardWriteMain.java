package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.BoardController;
import model.BoardVO;

public class BoardWriteMain {

	private JFrame frame;
	private JTextField inputTitle;
	private JTextField inputAddr;
	private JTextField inputContent;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnFinish;
	private BoardController controller = new BoardController();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardWriteMain window = new BoardWriteMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BoardWriteMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 695, 805);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("\uC81C\uBAA9");
		lblNewLabel.setBounds(25, 37, 171, 45);
		frame.getContentPane().add(lblNewLabel);
		
		inputTitle = new JTextField();
		inputTitle.setHorizontalAlignment(SwingConstants.TRAILING);
		inputTitle.setBounds(225, 37, 398, 45);
		frame.getContentPane().add(inputTitle);
		inputTitle.setColumns(10);
		
		lblNewLabel_1 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_1.setBounds(25, 116, 155, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		inputAddr = new JTextField();
		inputAddr.setBounds(225, 116, 398, 45);
		frame.getContentPane().add(inputAddr);
		inputAddr.setColumns(10);
		
		inputContent = new JTextField();
		inputContent.setBounds(25, 196, 544, 438);
		frame.getContentPane().add(inputContent);
		inputContent.setColumns(10);
		
		btnFinish = new JButton("\uC644\uB8CC");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String title = inputTitle.getText();
				String addr = inputAddr.getText();
				String content = inputContent.getText();
				
				BoardVO board = new BoardVO(title, addr, content);
				
				int cnt = controller.save(board);
				
				if(cnt == 1)
				{
					JOptionPane.showMessageDialog(frame,
						    "작성 성공!!!!",
						    "결과",
						    JOptionPane.PLAIN_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(frame,
						    "작성 실패....",
						    "결과",
						    JOptionPane.PLAIN_MESSAGE);
				frame.setVisible(false);
				} 

		});
		btnFinish.setBounds(444, 668, 179, 45);
		frame.getContentPane().add(btnFinish);
	}
}
