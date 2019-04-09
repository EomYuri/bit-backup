package com.bitacademy.phonebook.vo;

public class PhoneBookVo {
	// 필드
	private Long id;
	private String name;
	private String hp;
	private String tel;

	// 생성자
	public PhoneBookVo(Long id, String name, String hp, String tel) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}
	
	public PhoneBookVo(String name, String hp, String tel) {
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}
	
	// getter/ setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// 출력용 오버라이드
	@Override
	public String toString() {
		return "PhoneBookVO [id=" + id + ", name=" + name + ", hp=" + hp + ", tel=" + tel + "]";
	}

}
