package view;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import controller.RequestMS;
import model.RequestVO;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class RequestAddrGUI {

	private JFrame frame;
	public static RequestMS controller = new RequestMS();

	/**
	 * Create the application.
	 */
	public RequestAddrGUI() {

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

		RequestVO[] list = new RequestVO[3];

		list = controller.selectAddr();

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getAddr() + "  " + list[i].getCnt());
		}

		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();

//		1.그래프 크기 2.범례 3.x축 이름

		for (int i = 0; i < list.length; i++) {
			dataset1.addValue(list[i].getCnt(), list[i].getAddr(), "주소 별");
		}

//		1.제목 2.x축 제목 3.y축 제목 4.그래프 데이터 5.그래프 모양(가로 / 세로) 6,7,8. 그래프 기능
		JFreeChart barChart = ChartFactory.createBarChart("주소별 CCTV 요청 통계", "주소", "요청 횟수", dataset1,
				PlotOrientation.VERTICAL, true, true, true);

//		1.폰트종류 2.폰트타입 3.크기
		Font f = new Font("Gulim", Font.BOLD, 14);
		barChart.getTitle().setFont(f);

		CategoryPlot plot1 = barChart.getCategoryPlot();
		plot1.getDomainAxis().setLabelFont(f); // x축 제목
		plot1.getDomainAxis().setTickLabelFont(f); // x축 이름
		plot1.getRangeAxis().setLabelFont(f); // y축 제목
		plot1.getRangeAxis().setTickLabelFont(f); // y축 이름

		ChartPanel chartPanel = new ChartPanel(barChart);
		panel.add(chartPanel);

	}

}
