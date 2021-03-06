package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import controller.RequestMS;
import model.RequestVO;
import javax.swing.SpringLayout;

public class RequestMainGUI {

	private JFrame frame;
	private JPanel panel;
	public static RequestMS controller = new RequestMS();
	private ChartPanel chartPanel2;

	/**
	 * Create the application.
	 */
	public RequestMainGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
//		첫번째 그래프 (주소별)
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1210, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(50, 150, 1100, 609);
		frame.getContentPane().add(panel);


		RequestVO[] list = new RequestVO[5];

		list = controller.selectAddr();

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getAddr() + "  " + list[i].getCnt());
		}

		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();

		for (int i = 0; i < list.length; i++) {
			dataset1.addValue(list[i].getCnt(), list[i].getAddr(), list[i].getAddr());
		}

		JFreeChart barChart = ChartFactory.createBarChart("주소별 CCTV 요청 통계", "주소", "요청 횟수", dataset1,
				PlotOrientation.VERTICAL, false, true, true);

		Font f = new Font("Gulim", Font.BOLD, 14);
		barChart.getTitle().setFont(f);

		CategoryPlot plot1 = barChart.getCategoryPlot();
		plot1.getDomainAxis().setLabelFont(f);
		plot1.getDomainAxis().setTickLabelFont(f);
		plot1.getRangeAxis().setLabelFont(f);
		plot1.getRangeAxis().setTickLabelFont(f);
		panel.setLayout(null);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		ChartPanel chartPanel = new ChartPanel(barChart);
		panel.add(chartPanel);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C \uAC00\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SelectChartData selectchartdata = new SelectChartData();
			}
		});
		btnNewButton.setBounds(25, 25, 115, 30);
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnNewButton.setBackground(Color.BLACK);
		frame.getContentPane().add(btnNewButton);
		
		URL url = this.getClass().getResource("../GUI_Image/datachart_addr.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 800);
		frame.getContentPane().add(login_background);
		
	}
}
