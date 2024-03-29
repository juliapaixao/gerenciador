package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaUsuarios
 */
@WebServlet(description = "lista com usuários cadastrados", urlPatterns = {"/listaUsuarios"})
public class ListaUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  Banco banco = new Banco();
	  List<Usuario> lista = banco.getUsuarios();
	  
	  request.setAttribute("usuarios", lista);
	  
	  RequestDispatcher rd = request.getRequestDispatcher("/listaUsuarios.jsp");
	  rd.forward(request, response);
	  
	}

}
