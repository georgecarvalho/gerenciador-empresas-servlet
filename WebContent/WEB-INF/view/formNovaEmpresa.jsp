<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"></c:url>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastre uma empresa</title>
</head>
<body>

	<c:import url="logout-partial.jsp"></c:import>

	<form action="${ linkEntradaServlet }" method="post">
	
		Nome: <input type="text" name="nome" />
		Data de Abertura: <input type="text" name="dataAbertura" />
		<input type="hidden" name="acao" value="NovaEmpresa">
	
		<input type="submit" value="Confirmar"/>
	</form>

</body>
</html>