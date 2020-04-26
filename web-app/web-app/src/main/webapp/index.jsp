<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=UTF-8">
<title>Login</title>
</head>

<!-- Java -->
<%

	String erro = null; //Diferente de null, ou seja, erro !=null
	
	// Verifica de user e senha estão corretos
	if ("POST".equalsIgnoreCase(request.getMethod()) && request.getParameter("submit") != null){
		
		// User clicou em entrar
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		// Usuario precisa ser admin, senha precisa ser admin
		if ("admin".equalsIgnoreCase(usuario) && "admin".equalsIgnoreCase(senha)){
			out.print("Bem vindo, " + usuario);
			// Return ã exibe o restante da página
			return;
			} else {
				erro = "Usuário ou senha incorretos. Tente Novamente!";
			}
				
	}
%>
<body>
	<h2>Login</h2>
	<!-- Checa se o usuário foi validado -->
	<%
	
	if (erro != null){
	%>
		<span style="color:red;"><% out.print(erro); %></span>	
	<% 
	}
	%>
	
	<form method="post">
		<span>
			<label>Usuário:</label>
			<input type="text" name="usuario">
		</span><br>  
		<span>
			<label>Senha:</label>
			<input type="password" name="senha">
		</span><br>
		<span>
			<button type="submit" name="submit">Entrar</button>
			 <button type="reset">Reset</button>
		</span>
	</form>
</body>
</html>