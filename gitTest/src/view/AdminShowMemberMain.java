package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
//import view.AdminSelect;
//import view.UserShowDB;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class AdminShowMemberMain {

	private JFrame frame;
	JTable jtable = new JTable();
	JScrollPane scrollpane = new JScrollPane();



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminShowMemberMain window = new AdminShowMemberMain();
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
	public AdminShowMemberMain() {
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
		
		AdminShowMemberDB testmain = new AdminShowMemberDB();
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
					int memberNum = testmain.getBoardNum(row);
					System.out.println(memberNum);
					AdminSelect adminSelect = new AdminSelect(memberNum);
					//boardSelect.setBoardNum(boardNum);
					adminSelect.frame.setVisible(true);
					frame.dispose();
				}
					
				
			}
		});
		
		showBoard.add(scrollPane);
		frame.setBounds(100, 100, 578, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
