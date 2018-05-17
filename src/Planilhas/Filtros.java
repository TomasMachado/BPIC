package Planilhas;

import java.util.ArrayList;
import java.util.Date;

public class Filtros {

	public static ArrayList<String> filtroOutcome1(ArrayList<String[]> p) {
		ArrayList<String> resultado = new ArrayList<String>();
		String id;
		Data data;
		int ano;
		int tamanho = p.size();

		for (int i = 0; i < tamanho; i++) {
			int inicio = i;
			id = p.get(i)[0];
			data = new Data(p.get(i)[2]);
			ano = data.getDate().getYear();
			int k = 0;
			while (i + 1 < tamanho && p.get(i)[0].equals(id)) {
				if ((new Data(p.get(i)[2]).getDate().getYear() == ano)) {
					k = i;// última linha com o ano igual ao inicio
				}
				if (p.get(i + 1)[0].equals(id))
					i++;
				else
					break;
			}
			int fim = i;// última linha do ID

			int j = k;
			while (j >= inicio && !((p.get(j)[1].equals("Payment application-Application-begin payment")
					&& new Data(p.get(j)[2]).getDate().getYear() == ano))) {
				j--;
			}
			; // ao fim do loop, j vai ser o ultimo begin payment do ano
			if (p.get(j)[1].equals("Payment application-Application-begin payment")) {
				while (j < fim) {
					if (p.get(j)[1].equals("Payment application-Application-abort payment")
							|| p.get(j)[1].equals("Payment application-Application-abort payment")
							|| p.get(j)[1].equals("Payment application-Application-abort payment")

					) {
						System.out.println(ano);
						resultado.add(p.get(j)[0]);
						System.out.println(p.get(j)[0]);
						break;
					}
					j++;

				}
			}

			i = fim;

		}
		System.out.println(resultado.size());
		return resultado;

	}

}
