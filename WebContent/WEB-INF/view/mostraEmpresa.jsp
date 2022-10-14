<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada?acao=EditaEmpresa" var="linkEditaEmpresa"></c:url>

<!DOCTYPE hmtl>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alura</title>
</head>
<body>
	
	<c:import url="logout-partial.jsp"></c:import>

	<form action="${ linkEditaEmpresa }" method="post">
	
		<input type="hidden" name="id" value="${empresa.id}">
	
		Nome: <input type="text" name="nome" value="${empresa.nome}" />
		Data de Abertura: <input type="text" name="dataAbertura" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />" />
	
		<input type="submit" value="Enviar"/>
	</form>


</body>
</html>