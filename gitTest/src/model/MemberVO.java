package model;

public class MemberVO {
	
	private String id;
	private String pw;
	private String name ;
	private	String addr ;
	private String phone;
	private String code ;
	
	public MemberVO(String id, String pw, String name, String addr, String phone, String code) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addr = addr;
		this.phone = phone;
		this.code = code;
	}
	
	

	public MemberVO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	


	public MemberVO(String id, String pw, String name) {
	
		this.id = id;
		this.pw = pw;
		this.name = name;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

}
