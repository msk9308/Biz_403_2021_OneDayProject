<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<p>======================================<br/>
<c:forEach items="${FDLIST}" var="FD"  >
<p> ${FD.f_fcode}

</c:forEach>

	
 


</body>
</html>