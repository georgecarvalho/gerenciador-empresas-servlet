package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramNomeEmpresa = request.getParameter("nome");
		String paramDataAbertura = request.getParameter("dataAbertura");

		Date dataAbertura = null;

		try {
			dataAbertura = new SimpleDateFormat("dd/MM/yyyy").parse(paramDataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		Empresa empresa = new Empresa();
		empresa.setNome(paramNomeEmpresa);
		empresa.setDataAbertura(dataAbertura);

		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		request.setAttribute("empresa", empresa.getNome());
		return "redirect:entrada?acao=ListaEmpresas";
	}

}
