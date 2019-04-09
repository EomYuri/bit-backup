package vo;

import java.util.Date;

public class GuestVo {
	// 필드
	private Long no;
	private String name;
	private String password;
	private String content;
	private Date reg_date;
	
	// 생성자
	public GuestVo(String name, String password, String content) {
		this.name = name;
		this.password = password;
		this.content = content;
	}
	
	public GuestVo(Long no, String name, String password, String content, Date reg_date) {
		this(name, password, content);
		this.no = no;
		this.reg_date = reg_date;
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

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "GuestVo [no=" + no + ", name=" + name + ", password=" + password + ", content=" + content
				+ ", reg_date=" + reg_date + "]";
	}

	
	
}
