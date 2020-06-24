package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AdminShowMain {

	JFrame frame;
	JTable jtable = new JTable();
	JScrollPane scrollpane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminShowMain window = new AdminShowMain();
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
	public AdminShowMain() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		scrollpane.setBounds(100, 100, 1200, 0);
		frame.getContentPane().add(scrollpane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(89, 31, 373, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel showBoard = new JPanel();
		showBoard.setBackground(Color.WHITE);
		showBoard.setBounds(12, 144, 538, 300);
		frame.getContentPane().add(showBoard);
		
		UserShowDB testmain = new UserShowDB();
		JTable myTable = testmain.getTable();
	
		JScrollPane scrollPane = new JScrollPane(myTable);
		myTable.setEnabled(false);
		myTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 행의 위치
				int row = myTable.rowAtPoint(e.getPoint());
				System.out.println(row);
				// 열의 위치
				int col = myTable.columnAtPoint(e.getPoint());
				System.out.println(col);
				if(col == 1) {
					int boardNum = testmain.getBoardNum(row);
					System.out.println(boardNum);
					AdminSelect adminSelect = new AdminSelect(boardNum);
					//boardSelect.setBoardNum(boardNum);
					
					frame.dispose();
					adminSelect.frame.setVisible(true);
				}
					
				
			}
		});
		
		showBoard.add(scrollPane);
		frame.setBounds(100, 100, 578, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
