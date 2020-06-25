package view;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import controller.RequestMS;
import model.RequestVO;

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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 791, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_54737740184600");

//		첫번째 그래프 (주소별)

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
		panel.setLayout(new GridLayout(0, 2, 20, 0));

		ChartPanel chartPanel = new ChartPanel(barChart);
		panel.add(chartPanel);

//		두번째 그래프 (날짜별) 

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
		panel.setLayout(new GridLayout(0, 2, 20, 0));

		ChartPanel chartPanel2;
		chartPanel2 = new ChartPanel(barChart2);
		panel.add(chartPanel2);
	}
}
