package guestbook_sping.vo;

public class guestbookVo {
	private Long no;
	private String name;
	private String password;
	private String content;
	
	public guestbookVo(Long no, String name, String password, String content) {
		super();
		this.no = no;
		this.name = name;
		this.password = password;
		this.content = content;
	}

	public guestbookVo(String name, String password, String content) {
		super();
		this.name = name;
		this.password = password;
		this.content = content;
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "gusetbookVo [no=" + no + ", name=" + name + ", password=" + password + ", content=" + content + "]";
	}

}
