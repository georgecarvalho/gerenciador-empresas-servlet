package br.com.alura.gerenciador.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static List<Aluno> listaAlunos = new ArrayList<Aluno>();
	private static Integer chaveSequencial = 1;
	private static Integer idAluno = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa2);

		Usuario u1 = new Usuario();
		u1.setLogin("george");
		u1.setSenha("12345");

		Usuario u2 = new Usuario();
		u2.setLogin("ana");
		u2.setSenha("12345");

		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		
		Aluno a1 = new Aluno(idAluno++, "Monte Castelo", "Bacharelado em Sistemas de Informacao", 2017, new BigDecimal(2000) , 8.25, "Presencial", 27, 0, false);
		//Aluno a2 = new Aluno(idAluno++, "Monte Castelo", "Bacharelado em Sistemas de Informacao", 2016, new BigDecimal(5000) , 9, "Presencial", 28, 0, true);
		
		listaAlunos.add(a1);
		//listaAlunos.add(a2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void remove(Integer id) {

		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa empresa = it.next();

			if (empresa.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPorId(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario : listaUsuarios) {
			if (usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}

	public List<Aluno> getAlunos() {
		return Banco.listaAlunos;
	}
}
