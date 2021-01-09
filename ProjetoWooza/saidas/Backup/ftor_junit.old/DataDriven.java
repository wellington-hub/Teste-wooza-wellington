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
	public static String url = "https://des.central.mobilidade.caixa.gov.br/sigpm";
	public static String nomeSistema = "Sistema SIGPM";
	public static String nomeSuite = "SIGPM";

	public static String idCaso = null;
	public static String usuario = null;
	public static String senha = null;
	// public static String projeto = null;
	public static String mes1 = null;
	public static String mes2 = null;
	public static String mes3 = null;
	public static String mes4 = null;
	public static String ano1 = null;
	public static String ano2 = null;
	public static String ano3 = null;
	public static String matricula = null;
	public static String ddd = null;
	public static String telefone = null;
	public static String ncompleto = null;
	public static String dtnascimento = null;
	public static String cpf = null;
	public static String inclusao = null;
	public static String tipodepende = null;
	public static String dtferias = null;
	public static String diasgozo = null;
	public static String qtdabonop = null;
	public static String parcela = null;
	
	public static String funcionalidade = null;
	public static String dtfunc = null;
	
	public static String matriculac = null;
	public static String periodo = null;

	public static ArrayList<String> aLinha = new ArrayList<String>();
	public static ArrayList<String> aidCaso = new ArrayList<String>();
	public static ArrayList<String> aUrl = new ArrayList<String>();

	public static ArrayList<String> ausuario = new ArrayList<String>();
	public static ArrayList<String> asenha = new ArrayList<String>();
	public static ArrayList<String> amatricula = new ArrayList<String>();
	public static ArrayList<String> ames1 = new ArrayList<String>();//set
	public static ArrayList<String> ames2 = new ArrayList<String>();//out
	public static ArrayList<String> ames3 = new ArrayList<String>();//nov
	public static ArrayList<String> ames4 = new ArrayList<String>();//dez
	public static ArrayList<String> aano1 = new ArrayList<String>();//2018
	public static ArrayList<String> aano2 = new ArrayList<String>();//2019
	public static ArrayList<String> aano3 = new ArrayList<String>(); //2020
	public static ArrayList<String> addd = new ArrayList<String>();
	public static ArrayList<String> atelefone = new ArrayList<String>();
	public static ArrayList<String> ancompleto = new ArrayList<String>();
	public static ArrayList<String> adtnascimento = new ArrayList<String>();
	public static ArrayList<String> acpf = new ArrayList<String>();
	public static ArrayList<String> ainclusao = new ArrayList<String>();
	public static ArrayList<String> atipodepende = new ArrayList<String>();
	public static ArrayList<String> adtferias = new ArrayList<String>();
	public static ArrayList<String> adiasgozo = new ArrayList<String>();
	public static ArrayList<String> aqtdabonop = new ArrayList<String>();
	public static ArrayList<String> aparcela = new ArrayList<String>();
	
	public static ArrayList<String> afuncionalidade = new ArrayList<String>();
	public static ArrayList<String> adtfunc = new ArrayList<String>();
	
	public static ArrayList<String> amatriculac = new ArrayList<String>();
	public static ArrayList<String> aperiodo = new ArrayList<String>();
	
	// public static ArrayList<String> aprojeto = new ArrayList<String>();

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
					ausuario.add(campos[0]);
					asenha.add(campos[1]);
					amatricula.add(campos[2]);
					ames1.add(campos[3]);
					ames2.add(campos[4]);
					ames3.add(campos[5]);
					ames4.add(campos[6]);
					aano1.add(campos[7]);
					aano2.add(campos[8]);
					aano3.add(campos[9]);
					addd.add(campos[10]);
					atelefone.add(campos[11]);
					ancompleto.add(campos[12]);
					adtnascimento.add(campos[13]);
					acpf.add(campos[14]);
					ainclusao.add(campos[15]);
					atipodepende.add(campos[16]);
					adtferias.add(campos[17]);					
					adiasgozo.add(campos[18]);
					aqtdabonop.add(campos[19]);
					aparcela.add(campos[20]);
					afuncionalidade.add(campos[21]);
					adtfunc.add(campos[22]);
					amatriculac.add(campos[23]);
					aperiodo.add(campos[24]);
					aidCaso.add(campos[25]);
					

					// aprojeto.add(campos[2]);

					// ate caso 20

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
		usuario = ausuario.get(nLin);
		senha = asenha.get(nLin);
		matricula = amatricula.get(nLin);
		mes1 = ames1.get(nLin);
		mes2 = ames2.get(nLin);
		mes3 = ames3.get(nLin);
		mes4 = ames4.get(nLin);
		ano1 = aano1.get(nLin);
		ano2 = aano2.get(nLin);
		ano3= aano3.get(nLin);
		ddd = addd.get(nLin);
		telefone = atelefone.get(nLin);
		ncompleto = ancompleto.get(nLin);
		dtnascimento = adtnascimento.get(nLin);
		cpf = acpf.get(nLin);
		inclusao = ainclusao.get(nLin);
		tipodepende = atipodepende.get(nLin);
		dtferias = adtferias.get(nLin);
		diasgozo = adiasgozo.get(nLin);
		qtdabonop = aqtdabonop.get(nLin);
		parcela = aparcela.get(nLin);
		funcionalidade = afuncionalidade.get(nLin);
		dtfunc = adtfunc.get(nLin);
		
		matriculac = amatriculac.get(nLin);
		periodo = aperiodo.get(nLin);

		// projeto = aprojeto.get(nLin);

	}
}
