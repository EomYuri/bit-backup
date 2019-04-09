<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 파라미터로 r, c를 받아서 테이블을 동적 생성: r행 c열의 테이블을 만들어 봅시다 -->
<%--
// 파라미터 r과 c를 받아와 봅시다
String row = request.getParameter("r");
String col = request.getParameter("c");

int nRow;
if (row == null) {
	nRow = 3;
} else {
	nRow = Integer.valueOf(row);
}

int nCol;
if (col == null) {
	nCol = 3;
} else {
	nCol = Integer.valueOf(col);
}
--%>
<!-- r 파라미터 확인 -->
<c:choose>
	<c:when test="${empty param.r }">
		<c:set var="nRow" value="3"/>
	</c:when>
	<c:otherwise>
		<c:set var="nRow" value="${param.r }"/>
	</c:otherwise>
</c:choose>
<!-- c 파라미터 확인 -->
<c:choose>
	<c:when test="${empty param.c }">
		<c:set var="nCol" value="3"/>
	</c:when>
	<c:otherwise>
		<c:set var="nCol" value="${param.c }"/>
	</c:otherwise>
</c:choose>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px" cellspacing="0"
		cellpadding="10px">
		<!-- nRow행, nCol열 테이블을 동적 생성 -->
		<c:forEach begin="1" end="${nRow }" var="row">
		<tr>
			<c:forEach begin="1" end="${nCol }" var="col">
			<td>cell(${row },${col })</td>
			</c:forEach>
		</tr>
		</c:forEach>
	</table>

</body>
</html>