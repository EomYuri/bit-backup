package spring.vo;
//Value Object
//DB 속 한 테이블의 칼럼(어트리뷰트)를
//멤버변수로 작성 (필드)
//java속 객체로 다룰 수 있게 만드는 것
public class GuestVo {
	private Long no;
	private String name;
	private String password;
	private String content;
	
	public GuestVo() {
		super();
	}

	public GuestVo(String name, String password, String content) {
		super();
		//삽입할 때는 no를 시퀀스로 자동 삽입하므로
		//no가 없는 생성자도 필요하다.
		this.name = name;
		this.password = password;
		this.content = content;
	}

	public GuestVo(Long no, String name, String password, String content) {
		super();
		this.no = no;
		this.name = name;
		this.password = password;
		this.content = content;
	}

	@Override
	public String toString() {
		return "GuestVo [no=" + no + ", name=" + name + ", password=" + password + ", content=" + content + "]";
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
	
	
}
