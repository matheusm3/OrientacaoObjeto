package br.com.matheusmenezesdacosta.radiofm;

public class RadioFM {
	
	private String frequencia;
	private double estacao;
	private String terminacao;
	
	public RadioFM(String frequencia, double estacao, String terminacao) {
		this.frequencia = frequencia;
		this.estacao = estacao;
		this.terminacao = terminacao;
	}
	
	public String getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	public double getEstacao() {
		return estacao;
	}
	public void setEstacao(double estacao) {
		this.estacao = estacao;
	}
	public String getTerminacao() {
		return terminacao;
	}
	public void setTerminacao(String terminacao) {
		this.terminacao = terminacao;
	}

}
