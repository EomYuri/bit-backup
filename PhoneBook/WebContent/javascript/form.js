function checkForm(obj){
//	alert("폼 전송");
	var name = obj.name.value;
	var hp = obj.hp.value;
	var tel = obj.tel.value;
	
	if(name.trim().length == 0){
		alert("이름을 입력해 주세요.");
	}else if(hp.trim().length == 0){
		alert("휴대전화 번호를 입력해주세요.");
	}else if(tel.trim().length == 0){
		alert("전화번호를 입력해주세요.");
	}else{
		return true;
	}
	return false;
}

function delete_id(obj){
	// 삭제할 것인지 확인
	// confirm
	var result = confirm("삭제하시겠습니까?");
	if(result){
		// 확인
		return true;
	}else{
		return false;
	}
}

function search(obj){
	var name = obj.name.value;
	
	if(name.trim().length == 0){
		alert("검색어를 입력해 주세요.");
	}else{
		return true;
	}
	return false;
}
