
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novoUsuario" var="linkServletNovoUsuario"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastre-se</title>
</head>
<body>



	<fieldset style="width: 70%; background-color: #ffe4e1;">
	
		 <form action="/gerenciador/novoUsuario" method="post"> 
						<label for="nome"> Nome Completo:</label> 
							<input type="text" name="nome" id="nome" placeholder="Digite seu nome"  pattern="[A-Za-z]+$" style="width: 65%;" required autofocus> <br> <br>
						
						<label for="data"> Data de nascimento </label> 
							<input type="text" name="data" id="data"> <br> <br>
						
						<label for="sexo">Sexo</label>
							<input type="radio" name="sexo" id="m">M
							<input type="radio" name="sexo" id="f">F
							<input type="radio" name="sexo" id="outro">Outro<br> <br>
				
							
						<input type="submit" value="Salvar">
						
		</form>
	</fieldset>



</body>
</html>