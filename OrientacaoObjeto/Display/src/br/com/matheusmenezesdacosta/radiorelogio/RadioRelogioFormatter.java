package br.com.matheusmenezesdacosta.radiorelogio;
import br.com.matheusmenezesdacosta.core.Formatter;

public class RadioRelogioFormatter implements Formatter<RadioRelogio> {
	
	public String formatter(RadioRelogio value) {
		return "Rádio Relógio => || " + value.getHora() + ":" + value.getMinuto() + " ||";
	}

}
