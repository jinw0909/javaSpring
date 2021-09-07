<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- List<Map> 사용하기 -->
	<c:forEach var="user" items="${users }" varStatus="status">
		<h3>${status.count}번째 사람 정보 }</h3>
		<ul>
			<li></li>
		</ul>
	</c:forEach>

</body>
</html>