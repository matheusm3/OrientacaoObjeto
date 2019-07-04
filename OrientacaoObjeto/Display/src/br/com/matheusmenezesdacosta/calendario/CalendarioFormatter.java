package br.com.matheusmenezesdacosta.calendario;
import br.com.matheusmenezesdacosta.core.Formatter;

public class CalendarioFormatter implements Formatter<Calendario>{

	public String formatter(Calendario value) {
		return value.getDia() + " " + value.getMes() + " " + value.getAno();
	}
	
}
