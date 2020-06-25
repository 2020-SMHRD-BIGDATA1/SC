package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RequestDAO {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	String addr;
	int val;
	RequestVO vo = new RequestVO(addr, val);

	private void getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public RequestVO[] selectAddr() {

		ArrayList<String> listAddr = new ArrayList();

		ArrayList<String> listAddrName = new ArrayList();

		ArrayList<Integer> listAddrCnt = new ArrayList();

		getConnection();

		try {
			String sql = "select BoardAddr from boards";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				listAddr.add(rs.getString("BoardAddr"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			close();
		}

		for (int i = 0; i < listAddr.size(); i++) {
			boolean isCheck = true;
			for (int j = 0; j < listAddrName.size(); j++) {
				if (listAddr.get(i).equals(listAddrName.get(j))) {
					Integer num = listAddrCnt.get(j);
					num++;
					listAddrCnt.remove(j);
					listAddrCnt.add(j, num);
					isCheck = false;
				}
			}
			if (isCheck) {
				listAddrName.add(listAddr.get(i));
				listAddrCnt.add(1);
			}
		}

		int[] listAddrCnt2 = new int[listAddrCnt.size()];
		String[] listAddrName2 = new String[listAddrName.size()];
		for (int i = 0; i < listAddrCnt2.length; i++) {
			listAddrCnt2[i] = listAddrCnt.get(i);
			listAddrName2[i] = listAddrName.get(i);
		}
		int temp;
		String temp2;

		for (int j = 0; j < listAddrCnt2.length; j++) {
			for (int i = 0; i < listAddrCnt2.length - (j + 1); i++) {
				if (listAddrCnt2[i] < listAddrCnt2[i + 1]) {
					temp = listAddrCnt2[i + 1];
					temp2 = listAddrName2[i + 1];
					listAddrCnt2[i + 1] = listAddrCnt2[i];
					listAddrName2[i + 1] = listAddrName2[i];
					listAddrCnt2[i] = temp;
					listAddrName2[i] = temp2;
				}
			}
		}
		
		String addrname = "";
		int addrcnt = 0;
		RequestVO vo = new RequestVO(addrname, addrcnt);
		RequestVO[] array = new RequestVO[3];

		for (int i = 0; i < 3; i++) {
			vo = new RequestVO(listAddrName2[i], listAddrCnt2[i]);
			array[i] = vo;
		}

		return array;
	}
	
	public RequestVO[] selectDate() {

		ArrayList<String> listDate = new ArrayList();

		ArrayList<String> listDateVal = new ArrayList();

		ArrayList<Integer> listDateCnt = new ArrayList();

		getConnection();

		try {
			String sql = "select BoardDate from boards";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				String value = rs.getString("BoardDate");
				value = value.substring(0,10);
				listDate.add(value);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			close();
		}

		for (int i = 0; i < listDate.size(); i++) {
			boolean isCheck = true;
			for (int j = 0; j < listDateVal.size(); j++) {
				if (listDate.get(i).equals(listDateVal.get(j))) {
					Integer num = listDateCnt.get(j);
					num++;
					listDateCnt.remove(j);
					listDateCnt.add(j, num);
					isCheck = false;
				}
			}
			if (isCheck) {
				listDateVal.add(listDate.get(i));
				listDateCnt.add(1);
			}
		}

		int[] listDateCnt2 = new int[listDateCnt.size()];
		String[] listDateVal2 = new String[listDateVal.size()];
		for (int i = 0; i < listDateCnt2.length; i++) {
			listDateCnt2[i] = listDateCnt.get(i);
			listDateVal2[i] = listDateVal.get(i);
		}
		int temp;
		String temp2;

		for (int j = 0; j < listDateCnt2.length; j++) {
			for (int i = 0; i < listDateCnt2.length - (j + 1); i++) {
				if (listDateCnt2[i] < listDateCnt2[i + 1]) {
					temp = listDateCnt2[i + 1];
					temp2 = listDateVal2[i + 1];
					listDateCnt2[i + 1] = listDateCnt2[i];
					listDateVal2[i + 1] = listDateVal2[i];
					listDateCnt2[i] = temp;
					listDateVal2[i] = temp2;
				}
			}
		}
		
		String DateVal = "";
		int DateCnt = 0;
		RequestVO vo = new RequestVO(DateVal, DateCnt);
		RequestVO[] array = new RequestVO[3];

		for (int i = 0; i < 3; i++) {
			vo = new RequestVO(listDateVal2[i], listDateCnt2[i]);
			array[i] = vo;
		}

		return array;
	}

}
