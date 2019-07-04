package br.com.matheusmenezesdacosta.calendario;

import br.com.matheusmenezesdacosta.core.Display;
import br.com.matheusmenezesdacosta.core.Formatter;

public class CalendarioDisplay extends Display<Calendario>{

	private Calendario calendario;
	Formatter<Calendario> formatacaocalendario;
	
	public CalendarioDisplay(Calendario calendario, Formatter<Calendario> formatacaocalendario) {
		super();
		this.calendario = calendario;
		this.formatacaocalendario = formatacaocalendario;
	}

	public void show() {
		System.out.println("Calendário:");
		System.out.println("DIA" + " MES " + "ANO");
		String sentence = formatacaocalendario.formatter(calendario);
		System.out.println(sentence);
	}
}
