<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE hmtl>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Empresas</title>
</head>
<body>
	
	<c:import url="logout-partial.jsp"></c:import>

	Usuario Logado: ${usuarioLogado.login }

	<br>
	<br>
	<br>


	<c:if test="${not empty empresas}">
		Lista de empresas: <br />

		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<li>${empresa.nome}- <fmt:formatDate
						value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /> <a
					href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">Editar</a>
					<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">Remover</a>
				</li>
			</c:forEach>
		</ul>
	</c:if>

	<c:if test="${empty empresas}">
		<p>Não há empresas cadastradas!
	</c:if>


</body>
</html>