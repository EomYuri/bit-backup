function checkForm(obj){
//	alert("폼 전송");
	var id = obj.id.value;
	var userName = obj.userName.value;
	var password = obj.password.value;
	var chk=document.joinForm.check.checked;
	
	if(userName.trim().length == 0){
		alert("이름을 입력해 주세요");
	}else if(id.trim().length == 0){
		alert("아이디를 입력해주세요");
	}else if(password.trim().length == 0){
		alert("비밀번호를 입력해주세요");
	}else if(chk==false){
		arlert("약관에 동의해 주세요");
	}else{
		return true;
	}
	return false;
}

