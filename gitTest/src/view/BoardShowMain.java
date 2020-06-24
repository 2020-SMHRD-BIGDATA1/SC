package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.Arrays;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BoardShowMain {

	private JFrame frame;
	JTable jtable = new JTable();
	JScrollPane scrollpane = new JScrollPane();
	private JButton btn_back;

	public BoardShowMain() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		scrollpane.setBounds(100, 100, 957, -55);
		frame.getContentPane().add(scrollpane);
		
		JPanel showBoard = new JPanel();
		showBoard.setBackground(Color.WHITE);
		showBoard.setBounds(102, 152, 970, 520);
		frame.getContentPane().add(showBoard);
		
		ShowDB testmain = new ShowDB();
		JTable myTable = testmain.getTable();
	
		JScrollPane scrollPane = new JScrollPane(myTable);
		myTable.setEnabled(false);
		myTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// ÇàÀÇ À§Ä¡
				int row = myTable.rowAtPoint(e.getPoint());
				System.out.println(row);
				// ¿­ÀÇ À§Ä¡
				int col = myTable.columnAtPoint(e.getPoint());
				System.out.println(col);
				if(col == 1) {
					int boardNum = testmain.getBoardNum(row);
					System.out.println(boardNum);
					BoardSelect boardSelect = new BoardSelect(boardNum);
					//boardSelect.setBoardNum(boardNum);
					boardSelect.frame.setVisible(true);
					frame.dispose();
				}
					
				
			}
		});
		showBoard.setLayout(new GridLayout(0, 1, 0, 0));
		
		showBoard.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(19, 24, 117, 32);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btn_home = new JButton("HOME");
		btn_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainGUIUser mainuser = new MainGUIUser();
			}
		});
		btn_home.setBackground(new Color(0, 0, 0));
		btn_home.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btn_home.setForeground(new Color(0, 204, 153));
		panel.add(btn_home);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(32, 701, 115, 29);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn_back = new JButton("\uB4A4\uB85C \uAC00\uAE30");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainGUIUser mainuser = new MainGUIUser();
			}
		});
		btn_back.setBackground(new Color(0, 0, 0));
		btn_back.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btn_back.setForeground(new Color(0, 204, 153));
		panel_1.add(btn_back);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(1013, 701, 115, 32);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btn_writing = new JButton("\uAE00 \uC791\uC131");
		btn_writing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				BoardWriteMain boardWriteMain = new BoardWriteMain();
	
			}
		});
		btn_writing.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btn_writing.setForeground(new Color(0, 204, 153));
		btn_writing.setBackground(new Color(0, 0, 0));
		panel_2.add(btn_writing);
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		URL url = this.getClass().getResource("../GUI_Image/user_board.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		frame.getContentPane().add(login_background);
		login_background.setBounds(0, 0, 1184, 761);
	}
}
