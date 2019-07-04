package br.com.matheusmenezesdacosta.radiorelogio;
import br.com.matheusmenezesdacosta.core.Formatter;

public class RadioRelogioFormatter implements Formatter<RadioRelogio> {
	
	public String formatter(RadioRelogio value) {
		return "R�dio Rel�gio => || " + value.getHora() + ":" + value.getMinuto() + " ||";
	}

}
