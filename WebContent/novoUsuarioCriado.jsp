<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<body>
		<c:if test="${not empty usuario}">
			<!--  Parabens = nomeUsuario , seu cadastro foi realizado com sucesso! -->
			 Parabens ${ usuario }, seu cadastro foi realizado com sucesso!
		</c:if>
		
		<c:if test="${empty usuario }">
			Nenhum usuário cadastrado!
		</c:if>
	</body>
</html>