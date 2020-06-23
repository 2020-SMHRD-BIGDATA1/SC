package model;

public class BoardVO {
	private String title;
	private String addr;
	private String content;
	private int number;
	private String date;
	private String id;
	
	public BoardVO(String title, String addr, String content) {
		super();
		this.title = title;
		this.addr = addr;
		this.content = content;
	}
	



	public BoardVO(String title, String addr, String content, String id) {
		super();
		this.title = title;
		this.addr = addr;
		this.content = content;
		this.id = id;
	}








	public BoardVO(int number, String title, String id, String date) {
		super();
		this.title = title;
		this.number = number;
		this.date = date;
		this.id = id;
	}




	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getContent() {
		
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}
	
	
}
