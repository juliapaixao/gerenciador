package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class NovoUsuario
 */
@WebServlet(description = "Adiciona um novo usuário", urlPatterns = { "/novoUsuario" })
public class NovoUsuarioServlet extends HttpServlet {
	
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando novo usuário");
		
		String nomeUsuario = request.getParameter("nome");
		String paramData = request.getParameter("data");
		
		Date dataNascimento = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataNascimento = sdf.parse(paramData);
        } catch (ParseException e) {
            throw new ServletException(e);
        }
		
		Usuario usuario = new Usuario();
		usuario.setNome(nomeUsuario);
		usuario.setDataNascimento(dataNascimento);
		
		Banco banco = new Banco();
		banco.adiciona(usuario);
		
		request.setAttribute("usuario", usuario.getNome());
		response.sendRedirect("listaUsuarios");
		
		//chamando página JSP
//		RequestDispatcher rd = request.getRequestDispatcher("/novoUsuarioCriado.jsp");
//		request.setAttribute("usuario", usuario.getNome());
//		rd.forward(request, response);
	}

}
