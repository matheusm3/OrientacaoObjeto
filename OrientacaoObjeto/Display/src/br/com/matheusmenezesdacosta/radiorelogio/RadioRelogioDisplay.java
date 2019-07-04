package br.com.matheusmenezesdacosta.radiorelogio;
import br.com.matheusmenezesdacosta.core.Display;
import br.com.matheusmenezesdacosta.core.Formatter;

public class RadioRelogioDisplay extends Display<RadioRelogio> {

	private RadioRelogio rr;
	Formatter<RadioRelogio> formatacao;
	
	public RadioRelogioDisplay(RadioRelogio rr, Formatter<RadioRelogio> formatacao) {
		this.rr = rr;
		this.formatacao = formatacao;
	}

	public void show() {
		String sentence = formatacao.formatter(rr);
		System.out.println(sentence);
	}

}
