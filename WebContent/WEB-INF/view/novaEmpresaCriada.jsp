<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<body>

	<c:import url="logout-partial.jsp"></c:import>
	
	<c:if test="${not empty empresa}">
    		Empresa ${ empresa } cadastrada com sucesso!
    	</c:if>

	<br />

	<c:if test="${not empty empresas}">
		Lista de empresas cadastradas: <br />

		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<li>${empresa.nome} - <fmt:formatDate
						value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />
				</li>
			</c:forEach>
		</ul>
	</c:if>

	<c:if test="${empty empresas}">
    	Não há empresas cadastradas!
    </c:if>
</body>
</html>