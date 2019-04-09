/*java.util.Scanner 클래스를 이용하여 친구정보를 입력받아 Friend 객체를 생성하고 이들을 Friend 객체 배열에 저장하세요. 
친구 즉, 친구(Friend)객체를 3개 입력 받으면 이들을 모두 화면에 출력하세요*/

package com.javaex.problem02;

public class Friend {

    private String name;
    private String hp;
    private String school;

    
    //필요한 메소드 작성
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }


	public void setName(String name) {
		this.name = name;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	public void setSchool(String school) {
		this.school = school;
	}

}
