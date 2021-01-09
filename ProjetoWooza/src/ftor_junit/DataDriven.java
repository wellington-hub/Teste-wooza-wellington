package ftor_junit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/***********************************************************************************************
 * DataDriven -> Classe responsável pela manipulação da massa de dados (CSV).
 ***********************************************************************************************/
public class DataDriven {

	public static String cCaso = null;
	public static String nomeCaso = null;
	public static String cLinha = null;
	public static int nLin = 0;
	public static int nLin2 = 0;
	public static String url = "https://lojaonlineclaro.com.br/";
	public static String nomeSistema = "Loja OnLine Claro";
	public static String nomeSuite = "Wooza";

	public static String idCaso = null;
	public static String areacod = null;
	public static String telefone = null;
	public static String produto = null;
	public static String email = null;

	public static ArrayList<String> aLinha = new ArrayList<String>();
	public static ArrayList<String> aidCaso = new ArrayList<String>();
	public static ArrayList<String> aUrl = new ArrayList<String>();
	public static ArrayList<String> aareacod = new ArrayList<String>();
	public static ArrayList<String> atelefone = new ArrayList<String>();
	public static ArrayList<String> aproduto = new ArrayList<String>();
	public static ArrayList<String> aemail = new ArrayList<String>();

	public static void lerCSV() throws Exception {

		// Leitura do CSV
		File arquivoCSV = new File("dados/MASSA_SIGPM.csv");
		FileInputStream arquivoStream = new FileInputStream(arquivoCSV);
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(arquivoStream, "ISO-8859-1"));
			while (in.ready()) {
				cLinha = in.readLine();

				if (cLinha != null) {
					String[] campos = cLinha.split(";");

					aLinha.add(cLinha);
					aareacod.add(campos[0]);
					atelefone.add(campos[1]);
					aproduto.add(campos[2]);
					aemail.add(campos[3]);
					aidCaso.add(campos[4]);

				}
			}

			in.close();
		}

		catch (final Exception e) {

			System.out.println("Não foi possível ler a planilha .csv");
			throw new Exception();
		}
	}

	public static void lerRegistro() {
		// LER REGISTRO (get do array)
		idCaso = aidCaso.get(nLin);
		areacod = aareacod.get(nLin);
		telefone = atelefone.get(nLin);
		produto = aproduto.get(nLin);
		email = aemail.get(nLin);

	}
}
