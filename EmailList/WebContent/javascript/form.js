function checkForm(obj){
//	alert("폼 전송");
	var last_name = obj.last_name.value;
	var first_name = obj.first_name.value;
	var email = obj.email.value;
	
	if(last_name.trim().length == 0){
		alert("성을 입력해주세요.");
	}else if(first_name.trim().length == 0){
		alert("이름을 입력해주세요.");
	}else if(email.trim().length == 0){
		alert("이메일을 입력해주세요.");
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
