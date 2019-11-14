<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.gerenciador.servlet.Usuario" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>



<!DOCTYPE html>
<html>
<head>
<meta charset=ISO-8859-1">
<title>Usuários Cadastrados</title>
</head>
<body>

	Lista de Usuários Cadastrados:
	
	<ul>
	<!-- o c da linha abaixo, vem do prefix da taglib -->
		<c:forEach items="${usuarios}" var="usuario">
			<li>${usuario.nome } - <fmt:formatDate value="${usuario.dataNascimento }" pattern="dd/MM/yyyy"/></li>
		</c:forEach>	
	</ul>
	
	


</body>
</html>