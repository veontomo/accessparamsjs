<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<title>Access Spring MVC params</title>
<script>
	var arr = ${array};
	var item = ${item};
	var number =  <c:out value="${number}"></c:out>;
	var message = "<c:out value="${message}"></c:out>";
</script>
<script src="/js/script.js"></script>
</head>
<body>
	array:
	<c:out value="${array}"></c:out>
	item: <c:out value="${item}"></c:out>
	number: <c:out value="${number}"></c:out>
	message: <c:out value="${message}"></c:out>
</body>
</html>