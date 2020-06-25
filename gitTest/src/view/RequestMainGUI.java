package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
import java.awt.GridLayout;

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

		RequestVO[] list = new RequestVO[3];

		list = controller.selectAddr();

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getAddr() + "  " + list[i].getCnt());
		}

		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();

//		1.�׷��� ũ�� 2.���� 3.x�� �̸�

		for (int i = 0; i < list.length; i++) {
			dataset1.addValue(list[i].getCnt(), list[i].getAddr(), list[i].getAddr());
		}

//		1.���� 2.x�� ���� 3.y�� ���� 4.�׷��� ������ 5.�׷��� ���(���� / ����) 6,7,8. �׷��� ���
		JFreeChart barChart = ChartFactory.createBarChart("�ּҺ� CCTV ��û ���", "�ּ�", "��û Ƚ��", dataset1,
				PlotOrientation.VERTICAL, false, true, true);

//		1.��Ʈ���� 2.��ƮŸ�� 3.ũ��
		Font f = new Font("Gulim", Font.BOLD, 14);
		barChart.getTitle().setFont(f);

		CategoryPlot plot1 = barChart.getCategoryPlot();
		plot1.getDomainAxis().setLabelFont(f); // x�� ����
		plot1.getDomainAxis().setTickLabelFont(f); // x�� �̸�
		plot1.getRangeAxis().setLabelFont(f); // y�� ����
		plot1.getRangeAxis().setTickLabelFont(f); // y�� �̸�
		panel.setLayout(new GridLayout(0, 2, 20, 0));

		ChartPanel chartPanel = new ChartPanel(barChart);
		panel.add(chartPanel);

		list = controller.selectDate();

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getAddr() + "  " + list[i].getCnt());
		}

		DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();

//		1.�׷��� ũ�� 2.���� 3.x�� �̸�

		for (int i = 0; i < list.length; i++) {
			dataset2.addValue(list[i].getCnt(), list[i].getAddr(), list[i].getAddr());
		}

//		1.���� 2.x�� ���� 3.y�� ���� 4.�׷��� ������ 5.�׷��� ���(���� / ����) 6,7,8. �׷��� ���
		JFreeChart barChart2 = ChartFactory.createBarChart("���ں� CCTV ��û ���", "��¥", "��û Ƚ��", dataset2,
				PlotOrientation.VERTICAL, false, true, true);

//		1.��Ʈ���� 2.��ƮŸ�� 3.ũ��
		Font f2 = new Font("Gulim", Font.BOLD, 14);
		barChart2.getTitle().setFont(f2);

		CategoryPlot plot2 = barChart2.getCategoryPlot();
		plot2.getDomainAxis().setLabelFont(f2); // x�� ����
		plot2.getDomainAxis().setTickLabelFont(f2); // x�� �̸�
		plot2.getRangeAxis().setLabelFont(f2); // y�� ����
		plot2.getRangeAxis().setTickLabelFont(f2); // y�� �̸�
		panel.setLayout(new GridLayout(0, 2, 20, 0));

		ChartPanel chartPanel2;
		chartPanel2 = new ChartPanel(barChart2);
		panel.add(chartPanel2);
	}
}
