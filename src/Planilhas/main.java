package Planilhas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class main {

	public static void main(String[] args) {
//		ArrayList<String[]> objection = Planilha.lerPlanilha("Objection.csv");
//		ArrayList<String> obid = Planilha.getCasesID(objection);
//		ArrayList<String[]> change = Planilha.lerPlanilha("Change.csv");
//		ArrayList<String> chid = Planilha.getCasesID(change);
//		ArrayList<String> commonIDS = Planilha.commonIDS(chid, obid);
//		ArrayList<String[]> uniao = Planilha.removerIntersecoes(objection, change, commonIDS);
//		Planilha.planilhaOut(uniao, "C:\\Users\\Tomas\\Desktop\\teste.csv");
		
//		Planilha p = new Planilha();
//		p.uniaoIds("Change.csv", "Objection.csv", "ok.csv");
		
//		new Janela();
		
		Planilha p = new Planilha();
		ArrayList<String[]> change = p.planilhaIn("Change.csv");
		
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		 System.out.println(change.get(3)[3]);
		   try {

	            Date date = formatter.parse(change.get(3)[3]);
	            System.out.println(date);
	            System.out.println(formatter.format(date));

	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		
		
	
		
	}

}
