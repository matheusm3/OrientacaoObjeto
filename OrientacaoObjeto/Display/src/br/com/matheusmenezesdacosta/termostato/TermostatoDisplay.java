package br.com.matheusmenezesdacosta.termostato;
import br.com.matheusmenezesdacosta.core.Display;
import br.com.matheusmenezesdacosta.core.Formatter;

public class TermostatoDisplay extends Display<Termostato> {

	private Termostato termostato;
	Formatter<Termostato> formatacao;
	
	public TermostatoDisplay(Termostato termostato, Formatter<Termostato> formatacaotermostato) {
		this.termostato = termostato;
		this.formatacao = formatacaotermostato;
	}

	public void show() {
		// atribui-se à uma variável a formatação final em forma de texto (String)
		String sentence = formatacao.formatter(termostato);
		System.out.println(sentence);
	}
	

}
