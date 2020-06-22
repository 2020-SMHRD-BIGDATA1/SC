package controller;

import model.MemberDAO;
import model.MemberVO;

public class MemberMS {
	
	private MemberDAO dao = new MemberDAO();
	private MemberVO loginUser;

	
	public MemberVO getLoginUser() {
		return loginUser;
	}

	public MemberVO login(MemberVO user) {

		loginUser = dao.selectOne(user);

		if (loginUser == null) {
			return null;
		}else {
			return loginUser;
		}

	}

	public int join(MemberVO joinUser) {
	
		int cnt = dao.insert(joinUser);
				return cnt;
		
	}

}
