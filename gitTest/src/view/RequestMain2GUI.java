package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import controller.RequestMS;
import model.RequestVO;
import java.awt.GridLayout;
import java.net.URL;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RequestMain2GUI {

	private JFrame frame;
	public static RequestMS controller = new RequestMS();

	public RequestMain2GUI() {
		initialize();
		frame.setVisible(true);
	}
	
//	두번째 그래프 (날짜별) 
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1210, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 150, 1100, 600);
		frame.getContentPane().add(panel);
		
		RequestVO[] list2 = new RequestVO[5];
		list2 = controller.selectDate();

		DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();

		for (int i = 0; i < list2.length; i++) {
			dataset2.addValue(list2[i].getCnt(), list2[i].getAddr(), list2[i].getAddr());
		}

		JFreeChart barChart2 = ChartFactory.createBarChart("일자별 CCTV 요청 통계", "날짜", "요청 횟수", dataset2,
				PlotOrientation.VERTICAL, false, true, true);

		Font f2 = new Font("Gulim", Font.BOLD, 14);
		barChart2.getTitle().setFont(f2);

		CategoryPlot plot2 = barChart2.getCategoryPlot();
		plot2.getDomainAxis().setLabelFont(f2);
		plot2.getDomainAxis().setTickLabelFont(f2);
		plot2.getRangeAxis().setLabelFont(f2);
		plot2.getRangeAxis().setTickLabelFont(f2);

		ChartPanel chartPanel2;
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		chartPanel2 = new ChartPanel(barChart2);
		panel.add(chartPanel2);
		
		
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
		
		URL url = this.getClass().getResource("../GUI_Image/datachart_date.jpg");
		JLabel login_background = new JLabel(new ImageIcon(url.getPath()));
		login_background.setBounds(0, 0, 1200, 800);
		frame.getContentPane().add(login_background);
	}

}
