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
		

		
	
		
	}

}
