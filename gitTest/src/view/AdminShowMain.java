package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminShowMain {

	private JFrame frame;
	JTable jtable = new JTable();
	JScrollPane scrollpane = new JScrollPane();
	private JButton btn_back;

	public AdminShowMain() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		scrollpane.setBounds(100, 100, 957, -55);
		frame.getContentPane().add(scrollpane);

		JPanel showBoard = new JPanel();
		showBoard.setBackground(Color.WHITE);
		showBoard.setBounds(102, 152, 970, 520);
		frame.getContentPane().add(showBoard);

		UserShowDB testmain = new UserShowDB();
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
				if (col == 1) {
					int boardNum = testmain.getBoardNum(row);
					System.out.println(boardNum);
					AdminSelect adminSelect = new AdminSelect(boardNum);
					// boardSelect.setBoardNum(boardNum);

					frame.dispose();
					adminSelect.frame.setVisible(true);
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
				MainGUIManager mainmanager = new MainGUIManager();
			}
		});
		btn_home.setBackground(new Color(0, 0, 0));
		btn_home.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btn_home.setForeground(Color.PINK);
		panel.add(btn_home);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(32, 701, 115, 29);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		btn_back = new JButton("\uB4A4\uB85C \uAC00\uAE30");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainGUIManager mainmanager = new MainGUIManager();
			}
		});
		btn_back.setBackground(new Color(0, 0, 0));
		btn_back.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		btn_back.setForeground(Color.PINK);
		panel_1.add(btn_back);

		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		URL url = this.getClass().getResource("../GUI_Image/manager_board.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		frame.getContentPane().add(login_background);
		login_background.setBounds(0, 0, 1184, 761);
	}
}
