<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
	<div id="navigation">
      <ul>
      	<li><img src="${pageContext.servletContext.contextPath }/${blogVo.logoFile}" style="width:150px">
        <li><a href="<%= request.getContextPath() %>/${blogUser.id}/category/total">카테고리</a></li>
        <c:forEach items="${cateList}" var="cateVo" >
  			<li><a href="<%=request.getContextPath() %>/${blogUser.id}/category/${cateVo.cateNo}">${cateVo.cateName }</a>  </li>    	
 
        </c:forEach>
      </ul>
	</div>