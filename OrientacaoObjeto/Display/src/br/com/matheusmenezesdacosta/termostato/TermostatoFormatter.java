package br.com.matheusmenezesdacosta.termostato;

import br.com.matheusmenezesdacosta.core.Formatter;

public class TermostatoFormatter implements Formatter<Termostato>{

	public String formatter(Termostato value) {
		return "Termostato => || " + value.getGrau() + value.getTerminacao() + " ||";
	}
}