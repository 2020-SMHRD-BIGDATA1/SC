package model;

public class RequestVO {
	
	String addr;
	int cnt;
	
	public RequestVO(String addr, int cnt) {

		this.addr = addr;
		this.cnt = cnt;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
	

}
