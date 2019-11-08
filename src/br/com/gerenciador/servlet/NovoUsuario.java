package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoUsuario
 */
@WebServlet(description = "Adiciona um novo usuário", urlPatterns = { "/novoUsuario" })
public class NovoUsuario extends HttpServlet {
	
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando novo usuário");
		
		String nomeUsuario = request.getParameter("nome");
		//System.out.println(nomeUsuario);
		Usuario usuario = new Usuario();
		//usuario.setNome(nome);
		
		//inserindo dados no banco de dados
		Banco banco = new Banco();
		//banco.adiciona(usuario);
		
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
	    out.println("<body>");
	    out.println("cadastrado com sucesso!");
	    out.println("</body>");
	    out.println("</html>");
	}

}
