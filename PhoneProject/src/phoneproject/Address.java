package phoneproject;

public class Address {

	private String name;
	private String hp;
	private String company;

	public Address (String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void Member() {
		System.out.println(name+hp+company);
	}

	//생성자 작성


}





