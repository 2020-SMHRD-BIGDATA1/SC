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

//		1.�׷��� ũ�� 2.���� 3.x�� �̸�

		for (int i = 0; i < list.length; i++) {
			dataset1.addValue(list[i].getCnt(), list[i].getAddr(), "�ּ� ��");
		}

//		1.���� 2.x�� ���� 3.y�� ���� 4.�׷��� ������ 5.�׷��� ���(���� / ����) 6,7,8. �׷��� ���
		JFreeChart barChart = ChartFactory.createBarChart("�ּҺ� CCTV ��û ���", "�ּ�", "��û Ƚ��", dataset1,
				PlotOrientation.VERTICAL, true, true, true);

//		1.��Ʈ���� 2.��ƮŸ�� 3.ũ��
		Font f = new Font("Gulim", Font.BOLD, 14);
		barChart.getTitle().setFont(f);

		CategoryPlot plot1 = barChart.getCategoryPlot();
		plot1.getDomainAxis().setLabelFont(f); // x�� ����
		plot1.getDomainAxis().setTickLabelFont(f); // x�� �̸�
		plot1.getRangeAxis().setLabelFont(f); // y�� ����
		plot1.getRangeAxis().setTickLabelFont(f); // y�� �̸�

		ChartPanel chartPanel = new ChartPanel(barChart);
		panel.add(chartPanel);

	}

}
