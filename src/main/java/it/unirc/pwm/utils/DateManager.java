//classe che gestisce le date.
package it.unirc.pwm.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class DateManager {
	
//QUESTO METODO MI RESTITUISCE LA DATA
	public static Date getToday() throws ParseException {

    	 long millis = System.currentTimeMillis();
	     java.sql.Date date = new java.sql.Date(millis);	     
		return date;  
	 } 	
	 
	 
    

    
     
	 
	

	public static boolean confrontoDate(String dataIn) {								///////////////////////////////////////////////////////////////////////////////
	boolean confronto = false;															///////SE LA DATA SCELTA E' DOPO OGGI, O UGUALE AD OGGI////////////////////////
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");   			    	//////////////ALLORA CONFRONTO DARA'1(QUINDI VERO)/////////////////////////////
	try {																				///////////E SARA' POSSIBILE UTILIZZARE LA ////////////////////////////////////
		Date dataselezionata = formatter.parse(dataIn);									///////////// DATA SCELTA PER UN EVENTO////////////////////////////////////////
		//Date dataoggiD = formatter.parse(getToday());									////////////////O UN VIAGGIO///////////////////////////////////////////////////
		Date dataoggiD = getToday();	
		if(dataselezionata.after(dataoggiD)||dataselezionata.equals(dataoggiD)) 
			confronto = true;
	}catch (ParseException e) {
				e.printStackTrace();
	}
	return confronto;
	 }
	
	public static boolean confrontodateIn (String data1, String data2) {
		boolean confronto = false;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
		try {	
			Date dataD1 = formatter.parse(data1);	//STRASFOMRO LA STRING DATA1, IN UNA DATA!!!!!!IN UNA VARIABILE DI TIPO DATA!!!
			Date dataD2 = formatter.parse(data2);
			if (!(dataD1.before(dataD2))) 
				confronto=true;
		}catch (ParseException e) {
			e.printStackTrace();
		}
		return confronto;
		}
	
	
	
	public static boolean confrontoOrari(String orario1, String orario2) {
		boolean confronto = false;
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm"); 
		try {
			Date orarioO1 = formatter.parse(orario1);
			Date orarioO2 = formatter.parse(orario2);
			if(!(orarioO1.before(orarioO2)))	
					confronto=true;
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		return confronto;
	}
	
}
