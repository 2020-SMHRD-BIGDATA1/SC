package controller;

import model.BoardDAO;
import model.BoardVO;



public class BoardController {
	private BoardDAO dao = new BoardDAO();
	public static BoardController controller = new BoardController();

	public int save(BoardVO board) {
		int num = 0;
		
		num = dao.insert(board);
		
		
		
		
		return num;
	}
}
