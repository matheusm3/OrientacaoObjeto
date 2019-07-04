package br.com.matheusmenezesdacosta.main;
import br.com.matheusmenezesdacosta.calendario.Calendario;
import br.com.matheusmenezesdacosta.calendario.CalendarioDisplay;
import br.com.matheusmenezesdacosta.calendario.CalendarioFormatter;
import br.com.matheusmenezesdacosta.core.Display;
import br.com.matheusmenezesdacosta.core.Formatter;
import br.com.matheusmenezesdacosta.radiofm.RadioFM;
import br.com.matheusmenezesdacosta.radiofm.RadioFMDisplay;
import br.com.matheusmenezesdacosta.radiofm.RadioFMFormatter;
import br.com.matheusmenezesdacosta.radiorelogio.RadioRelogio;
import br.com.matheusmenezesdacosta.radiorelogio.RadioRelogioDisplay;
import br.com.matheusmenezesdacosta.radiorelogio.RadioRelogioFormatter;
import br.com.matheusmenezesdacosta.termostato.Termostato;
import br.com.matheusmenezesdacosta.termostato.TermostatoDisplay;
import br.com.matheusmenezesdacosta.termostato.TermostatoFormatter;

public class Main {

    public static void main(String[] args) {
    	
    	System.out.println("DISPLAY:");    	
    	System.out.println(" ");

    	// atribui��es
    	Termostato termostato = new Termostato (22.5, "�F");
    	RadioRelogio rr = new RadioRelogio (12, 30);
    	RadioFM fm = new RadioFM ("FM", 88.9, "Mhz");
    	Calendario cal = new Calendario (25, 7, 2019);

    	Formatter<Termostato> formatacaotermostato = new TermostatoFormatter();
    	Display<Termostato> termostatodisplay = new TermostatoDisplay(termostato, formatacaotermostato);
    	termostatodisplay.show();
    	
    	System.out.println(" ");
    	Formatter<RadioRelogio> formatacaorr = new RadioRelogioFormatter();
    	Display<RadioRelogio> rrdisplay = new RadioRelogioDisplay(rr, formatacaorr);
    	rrdisplay.show();

    	System.out.println(" ");
    	Formatter<RadioFM> formatacaofm = new RadioFMFormatter();
    	Display<RadioFM> fmdisplay = new RadioFMDisplay(fm, formatacaofm);
    	fmdisplay.show();
    	
    	System.out.println(" ");
    	Formatter<Calendario> formatacaocal = new CalendarioFormatter();
    	Display<Calendario> caldisplay = new CalendarioDisplay(cal, formatacaocal);
    	caldisplay.show();
    	
    }

}