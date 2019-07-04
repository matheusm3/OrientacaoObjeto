package br.com.matheusmenezesdacosta.radiofm;
import br.com.matheusmenezesdacosta.core.Formatter;

public class RadioFMFormatter implements Formatter<RadioFM> {

	public String formatter(RadioFM value) {
		return "R�dio FM => || " + value.getFrequencia() + " " + value.getEstacao() + value.getTerminacao() + " ||";
	}
	
}
