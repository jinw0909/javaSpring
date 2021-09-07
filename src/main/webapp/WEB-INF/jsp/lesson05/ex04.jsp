<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="str1" value="No pain, No gain" />
	<h3>길이 구하기</h3>
	${fn:length(str1) }
	
	<h2>특정 문자열이 있는지 확인</h2>
	${fn:contains(str1, pain)}
	
	<h2>문자열 치환</h2>
	<c:set var="str2" value="I love chicken" />
	${str2 }
	${fn:replace(str2, 'chicken', 'bread') }
	
	<h2>문자열을 구분자로 쪼개기</h2>
	${fn:split(str2, " ")[0] }
	${fn:split(str2, " ")[1] }
	${fn:split(str2, " ")[2] }
	
	<h2>문자열을 자르기</h2>
	${fn:substring(str2, 2, 6) }
	
	<h2>모두 소문자로 변환</h2>
	${fn:toLowerCase(str2) }
	
	<h2>모두 대문자로 변환</h2>
	${fn:toUpperCase(str2) }
	
	<h2>앞 뒤 공백 자르기</h2>
	<c:set var="str3" value="       hello       " />
	<pre>${str3 }</pre>
	<pre>${fn:trim(str3) }</pre>
	
	
	
</body>
</html>