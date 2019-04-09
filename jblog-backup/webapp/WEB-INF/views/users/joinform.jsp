<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<!-- TODO: 현재 페이지에 적절한 CSS를 임포트하십시오. -->
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/css/users.css" />
<script type="text/javascript"
	src="${pageContext.servletContext.contextPath }/javascript/jquery/jquery-1.9.0.js"></script>
<script type="text/javascript"
	src="${pageContext.servletContext.contextPath }/javascript/form.js"></script>
<script type="text/javascript">
	function checkId(btn) {
		//   id 필드 체크
		if (btn.form.id.value.trim().length == 0) { // 만약 btn이 소속된 form에서 id이란 이름을 가진 객체의 value 값이 공백을 제거하고 난 뒤 길이가
			alert("아이디를 입력해주세요.") // 0과 같다면 입력이 되지 않은 상태이므로 alert를 띄운다
			return;
		}
		//   JQuery Ajax 수행
		$.ajax({
			url : "${pageContext.servletContext.contextPath }/users/idcheck", // 사용할 컨트롤러 매핑 url
			type : "get", // 메소드 수행 방식
			dataType : "json", // 넘겨받을 데이터 타입
			data : {
				id : btn.form.id.value
			},
			success : function(response) { // 응답값: response HashMap 형태로 넘긴 그것
				if (response.data == "exists") {
					alert("이미 등록된 아이디입니다.");
				} else {
					alert("사용 가능합니다.");
				}
			},
			error : function(xhr, status, err) { // ajax 요청 객체 : xhr, 상태값: status, 에러값: err
				alert(status);
				alert(err);
			}
		});
	}
</script>

</head>
<body>
	<div id="container">
		<%--HEADER영역--%>
		<jsp:include page="../includes/header.jsp" />

		<div id="wrapper">
			<div id="content">
				<!-- Content 영역 -->
				<div id="user">
					<!-- form id="join-form" name="joinform" method="post"
						action="<%=request.getContextPath()%>/users/join"-->
					<form:form modelAttribute="userVo" id="join-form" name="joinForm"
						method="POST"
						action="${pageContext.servletContext.contextPath }/users/join"
						onsubmit="return checkForm(this)">
						<%--입력폼--%>

						<label class="block-label" for="userName">이름</label>
						<!-- input type="text" name="name" id="name"-->
						<form:input path="userName" />
						<br />
						<spring:hasBindErrors name="userVo">
							<c:if test="${errors.hasFieldErrors('userName') }">
								<strong>${errors.getFieldErrors('userName')[0].defaultMessage }</strong>
							</c:if>
						</spring:hasBindErrors>

						<label class="block-label" for="id">아이디</label>
						<!--input type="text" name="id" id="id"-->
						<form:input path="id" />

						<input type="button" value="중복 체크" onclick="checkId(this)">
						<spring:hasBindErrors name="userVo">
							<c:if test="${errors.hasFieldErrors('id') }">
								<spring:message code="${errors.getFieldError('id').codes[0] }"
									text="${errors.getFieldError('id').defaultMessage }" />
							</c:if>
						</spring:hasBindErrors>
						<br />
						<label class="block-label" for="password">비밀번호</label>
						<input type="password" name="password">

						<input type="hidden" name="a" value="join">
						<br />

						<fieldset>
							<legend>약관동의</legend>
							<input type="checkbox" name="check"/>서비스 약관에
							동의합니다.
						</fieldset>

						<input type="submit" value="회원가입">

					</form:form>
				</div>

			</div>
		</div>

	</div>

</body>
</html>