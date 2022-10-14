package br.com.alura.gerenciador.modelo;

import java.math.BigDecimal;

public class Aluno {
	
	private Integer id;
	private String campus;
	private String curso;
	private Integer anoIngresso;
	private BigDecimal rendaBruta;
	private double ira;
	private String modalidade;
	private Integer idade;
	private Integer qtdFilhos;
	private boolean trabalha;
	
	public Aluno(Integer id, String campus, String curso, Integer anoIngresso, BigDecimal rendaBruta, double ira,
			String modalidade, Integer idade, Integer qtdFilhos, boolean trabalha) {
		super();
		this.id = id;
		this.campus = campus;
		this.curso = curso;
		this.anoIngresso = anoIngresso;
		this.rendaBruta = rendaBruta;
		this.ira = ira;
		this.modalidade = modalidade;
		this.idade = idade;
		this.qtdFilhos = qtdFilhos;
		this.trabalha = trabalha;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Integer getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(Integer anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	public BigDecimal getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(BigDecimal rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	public double getIra() {
		return ira;
	}
	public void setIra(double ira) {
		this.ira = ira;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getQtdFilhos() {
		return qtdFilhos;
	}
	public void setQtdFilhos(Integer qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}
	public boolean isTrabalha() {
		return trabalha;
	}
	public void setTrabalha(boolean trabalha) {
		this.trabalha = trabalha;
	}
	
}
