package controller;

import java.util.ArrayList;

import model.RequestDAO;
import model.RequestVO;

public class RequestMS {

	private RequestDAO dao = new RequestDAO();

	public RequestVO[] selectAddr() {

		RequestVO[] list = new RequestVO[5];

		list = dao.selectAddr();

		return list;

	}

	public RequestVO[] selectDate() {

		RequestVO[] list = new RequestVO[5];

		list = dao.selectDate();

		return list;

	}
}
