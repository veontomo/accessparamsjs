<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<title>Hello</title>
<script>
var x = <c:out value="${name}"></c:out>;
</script>
</head>
<body>
	JSP PAGE: Hello
	<c:out value="${name}"></c:out>
</body>
</html>