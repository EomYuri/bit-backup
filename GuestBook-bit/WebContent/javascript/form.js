function checkForm(obj){
//	alert("폼 전송");
	var name = obj.name.value;
	var password = obj.password.value;
	var content = obj.content.value;
	
	if(name.trim().length == 0){
		alert("이름을 입력해주세요.");
	}else if(password.trim().length == 0){
		alert("비밀번호을 입력해주세요.");
	}else if(content.trim().length == 0){
		alert("내용을 입력해주세요.");
	}else{
		return true;
	}
	return false;
}

function delete_email(obj){
	// 삭제할 것인지 확인
	// confirm
	var result = confirm("정말로 삭제하시겠습니까?");
	if(result){
		// 확인
		return true;
	}else{
		return false;
	}
}
