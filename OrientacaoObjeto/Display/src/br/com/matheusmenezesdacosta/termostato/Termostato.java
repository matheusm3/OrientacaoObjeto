package br.com.matheusmenezesdacosta.termostato;

public class Termostato {
	
	private double grau;
	private String terminacao;
	
	public Termostato(double grau, String terminacao) {
		this.grau = grau;
		this.terminacao = terminacao;
	}

	public double getGrau() {
		return grau;
	}

	public void setGrau(double grau) {
		this.grau = grau;
	}

	public String getTerminacao() {
		return terminacao;
	}

	public void setTerminacao(String terminacao) {
		this.terminacao = terminacao;
	}
	
	
}
