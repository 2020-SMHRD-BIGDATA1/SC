package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import controller.BoardController;
import model.BoardVO;
import java.awt.Font;
import java.awt.Color;

public class BoardWriteMain {

	private JFrame frame;
	private JTextField inputTitle;
	private JTextField inputAddr;
	private JTextField inputContent;
	private BoardController controller = new BoardController();
	private JButton btnFinish;
	/**
	 * Launch the application.
	 */

	public BoardWriteMain() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 560, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inputTitle = new JTextField();
		inputTitle.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		inputTitle.setHorizontalAlignment(SwingConstants.LEFT);
		inputTitle.setBounds(88, 127, 427, 29);
		inputTitle.setOpaque(false);
		frame.getContentPane().add(inputTitle);
		inputTitle.setColumns(10);
		
		inputAddr = new JTextField();
		inputAddr.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		inputAddr.setHorizontalAlignment(SwingConstants.LEFT);
		inputAddr.setBounds(332, 171, 145, 29);
		inputAddr.setOpaque(false);
		frame.getContentPane().add(inputAddr);
		inputAddr.setColumns(10);
		
		inputContent = new JTextField();
		inputContent.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		inputContent.setHorizontalAlignment(SwingConstants.LEFT);
		inputContent.setBounds(88, 231, 427, 489);
		inputContent.setOpaque(false);
		frame.getContentPane().add(inputContent);
		inputContent.setColumns(10);
		
		btnFinish = new JButton("\uC791\uC131 \uC644\uB8CC");
		btnFinish.setForeground(Color.PINK);
		btnFinish.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		btnFinish.setBackground(Color.BLACK);
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
						    "ÀÛ¼º ¿Ï·á!!!!",
						    "°á°ú",
						    JOptionPane.PLAIN_MESSAGE);
						    
					frame.dispose();
					BoardShowMain boardShowMain = new BoardShowMain();
				    
				}
				else
					JOptionPane.showMessageDialog(frame,
						    "ÀÛ¼º ¿À·ù....",
						    "°á°ú",
						    JOptionPane.PLAIN_MESSAGE);
				frame.setVisible(false);
				} 

		});
		
		btnFinish.setBounds(406, 740, 109, 29);
		frame.getContentPane().add(btnFinish);
		
		URL url = this.getClass().getResource("../GUI_Image/writing_board.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		frame.getContentPane().add(login_background);
		login_background.setBounds(0, 0, 550, 800);
	}
}
