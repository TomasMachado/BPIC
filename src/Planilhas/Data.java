package Planilhas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	
	private Date date;
	private String stringDate;
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
	
	public Data(String s) {
		stringDate = s;
		try {
			date = formatter.parse(stringDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStringDate() {
		return stringDate;
	}

	public void setStringDate(String stringDate) {
		this.stringDate = stringDate;
	}
	
	public static String substrairDatas(Data d1, Data d2){
		long dif = d1.getDate().getTime() - d2.getDate().getTime();
		
		return Long.toString(dif);
		
	}
	
	
	//incompleto
	private String miliDays(long ms) {
		StringBuilder builder = new StringBuilder();
		long dias = ms/86400000;
		long restoDias = ms%86400000;
		long horas = restoDias/3600000;
		long restoHoras = restoDias%3600000;
		long minutos = restoHoras/60000;
		long restominutos = restoHoras%60000;
		
		builder.append(ms/86400000);

		return builder.toString();
	}

}
