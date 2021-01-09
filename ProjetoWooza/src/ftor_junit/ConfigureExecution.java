package ftor_junit;

import CasosTestes._001LogarSistema;
import CasosTestes._002DescontosExclusivos;
import CasosTestes._003PesquisaDeProduto;
import CasosTestes._004CadastrarEmailValido;
import CasosTestes._005CadastrarEmailInvalido;
import CasosTestes._006AcessoMenuAcessibilidade;

/***************************************************************************************
 * ConfigureExecution: Classe responsável por possuir os objetos, atributos e
 * métodos de configuração da execução dos casos de teste
 ***************************************************************************************/
public class ConfigureExecution {

	// Atributos
	public static String cCaso = "";
	public static int nLin = 0;
	public static int nLin2 = 0;

	// Objetos das classes de teste
	static ReportLog reportlog = new ReportLog();

	static _001LogarSistema ct001 = new _001LogarSistema();
	static _002DescontosExclusivos ct002 = new _002DescontosExclusivos();
	static _003PesquisaDeProduto ct003 = new _003PesquisaDeProduto();
	static _004CadastrarEmailValido ct004 = new _004CadastrarEmailValido();
	static _005CadastrarEmailInvalido ct005 = new _005CadastrarEmailInvalido();
	static _006AcessoMenuAcessibilidade ct006 = new _006AcessoMenuAcessibilidade();

	/*********************************************************
	 * ->Seta o ID do Caso de Teste; ->Ler o CSV; ->Chama o método
	 * processarCasosTeste,referente ao Caso de Teste;
	 *********************************************************/
	public static void configurarExecucaoCasosTeste(String idCaso) throws Exception {
		switch (idCaso) {

		case "001":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_001LogarSistema");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;

		case "002":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_002DescontosExclusivos");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;

		case "003":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_003PesquisaDeProduto");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;

		case "004":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_004CadastrarEmailValido");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;

		case "005":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_005CadastrarEmailInvalido");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;

		case "006":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_006AcessoMenuAcessibilidade");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;

		}
	}

	/****************************************************************************************
	 * ->Verifica a linha que será lida do .csv pelo Id do caso; ->Executa
	 * método 'lerRegistro' (GET do Array) com os campos do .csv; ->Inicia a
	 * gravação do relatório em vídeo; ->Realiza a chamada ao método de teste.
	 * Primeiro break interno for, externo do case
	 ****************************************************************************************/
	public static void processarCasosTeste(String idCaso) throws Exception {
		switch (idCaso) {

		case "001":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct001.test001LogarSistema();
					break;
				}
			}

			break;

		case "002":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct002.test002DescontosExclusivos();
					break;
				}

			}

			break;

		case "003":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct003.test003Comprovante_de_Rendimentos();
					break;
				}
			}

			break;

		case "004":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct004.test004Dependentes();
					break;
				}

			}

			break;

		case "005":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct005.test005Atestado_Medico();
					break;
				}
			}

			break;

		case "006":

			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();
					ct006.test006Licenca_Maternidade_Paternidade();
					break;
				}
			}
			break;

		}
	}
}
