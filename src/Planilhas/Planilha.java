package Planilhas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Planilha {

	public Planilha() {
	}

	public ArrayList<String[]> planilhaIn(String local) {
		ArrayList<String[]> valores = new ArrayList<String[]>();
		File file = new File(local);
		
		try {
			Scanner inputStream = new Scanner(file);
			inputStream.nextLine();
			while (inputStream.hasNext()) {
				String data = inputStream.nextLine();
				String[] values = data.split(",");
				valores.add(values);
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("Not found");
		}

		catch (Exception s) {
			s.printStackTrace();
		}
		return valores;
	}
	
	public ArrayList<String> getCasesID(ArrayList<String[]> planilha){
		ArrayList<String> cases = new ArrayList<String>();
		for (int i = 0; i < planilha.size(); i++) {
			String id = planilha.get(i)[0];
			if(!cases.contains(id)) {
				cases.add(id);
			}	
		}
		return cases;
	
	}
	
	
	public ArrayList<String> commonIDS(ArrayList<String> ID1, ArrayList<String> ID2){
		ArrayList<String> commonIDS = new ArrayList<String>();
		for (int i = 0; i < ID1.size(); i++) {
			if(ID2.contains(ID1.get(i))) {
				commonIDS.add(ID1.get(i));
			}
		}
		
		return commonIDS;
	}
	
	public ArrayList<String[]> removerIntersecoes
	(ArrayList<String[]> planilha1, ArrayList<String[]> planilha2, ArrayList<String> common){
		ArrayList<String[]> uniao = planilha1;
		uniao.addAll(planilha2);
		for (int i = 0; i < uniao.size(); i++) {
			if(common.contains(uniao.get(i)[0])) {
				uniao.remove(i);
			}
		}
		return uniao;
	}
	
	public void planilhaOut(ArrayList<String[]> dados, String local) {
		try {
			FileWriter fw = new FileWriter(local, false);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			for (int i = 0; i < dados.size(); i++) {
				String[] temp = dados.get(i);
				StringBuilder linha = new StringBuilder();
				for (int j = 0; j < temp.length; j++) {
					if(j == temp.length -1) linha.append(temp[j]);
					else linha.append(temp[j]+",");
					
				}
				pw.println(linha.toString());
				pw.flush();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void uniaoIds(String local1, String local2,String localSaida) {
		ArrayList<String[]> planilha1 = planilhaIn(local1);
		ArrayList<String[]> planilha2 = planilhaIn(local2);
		ArrayList<String> planilha1Ids = getCasesID(planilha1);
		ArrayList<String> planilha2Ids = getCasesID(planilha2);
		ArrayList<String> commonIds = commonIDS(planilha1Ids, planilha2Ids);
		ArrayList<String[]> uniao = removerIntersecoes(planilha1, planilha2, commonIds);
		planilhaOut(uniao, localSaida);
		
	}

}
