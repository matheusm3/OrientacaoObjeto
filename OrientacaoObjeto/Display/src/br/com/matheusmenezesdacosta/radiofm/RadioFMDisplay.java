package br.com.matheusmenezesdacosta.radiofm;
import br.com.matheusmenezesdacosta.core.Display;
import br.com.matheusmenezesdacosta.core.Formatter;

public class RadioFMDisplay extends Display<RadioFM> {

	private RadioFM radio_fm;
	Formatter<RadioFM> formatacao_radiofm;
	
	public RadioFMDisplay(RadioFM radio_fm, Formatter<RadioFM> formatacao_radiofm) {
		this.radio_fm = radio_fm;
		this.formatacao_radiofm = formatacao_radiofm;
	}

	public void show() {
		String sentence = formatacao_radiofm.formatter(radio_fm);
		System.out.println(sentence);
	}
	
}
