package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.alura.gerenciador.modelo.Aluno;
import br.com.alura.gerenciador.modelo.Banco;

@WebServlet("/alunos")
public class AlunosService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Aluno> lista = new Banco().getAlunos();
		
		//Java object to XML string
//	    XStream xstream = new XStream();
//	    xstream.alias("empresa", Empresa.class);
//	    String xml = xstream.toXML(empresas);
//	    
//	    response.setContentType("application/xml");
//	    response.getWriter().print(xml);

	    //Java object to JSON string
	    Gson gson = new Gson();
	    String json = gson.toJson(lista);
	    
	    response.setContentType("application/json");
	    response.getWriter().print(json);
	}

}
