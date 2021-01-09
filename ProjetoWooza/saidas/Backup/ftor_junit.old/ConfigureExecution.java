package ftor_junit;

import CasosTestes._001LogarSistema;
import CasosTestes._002ContraCheque;
import CasosTestes._003Comprovante_de_Rendimentos;
import CasosTestes._004Dependentes;
import CasosTestes._005Atestado_Medico;
import CasosTestes._006Licenca_Maternidade_Paternidade;
import CasosTestes._007Dados_Cadastrais;
import CasosTestes._008APIP_LP;
import CasosTestes._009Auxilio_Alimentacao;
import CasosTestes._010Simular_Ferias;
import CasosTestes._011Alter_Prev_Priv;
import CasosTestes._012Calendario_Afastamentos;
import CasosTestes._013Aviso_Ferias_Digital;
import CasosTestes._014Consultas;
import CasosTestes._015Mensagens;
import CasosTestes._016Fica_Dica;
import CasosTestes._017Administracao;
import CasosTestes._0171LogErros;
import CasosTestes._0172Usuarios;
import CasosTestes._0173AtualizarUsuarios;
import CasosTestes._0174ArquivoFunc;
import CasosTestes._0175TabelaParametros;
import CasosTestes._0176ExclusaoComprovanteRendimentos;
import CasosTestes._0177ExcluirContraCheque;
import CasosTestes._0178ExcluirBonusCaixa;
import CasosTestes._0179DesabilitarFuncionalidades;
import CasosTestes._0180TermoUso;
import CasosTestes._0181AlterTermoUso;
import CasosTestes._018Cracha;
import CasosTestes._019Requerimento_Pessoal;
import CasosTestes._020Fique_Bem;





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
	static _002ContraCheque ct002 = new _002ContraCheque();
	static _003Comprovante_de_Rendimentos ct003 = new _003Comprovante_de_Rendimentos();
	static _004Dependentes ct004 = new _004Dependentes();
	static _005Atestado_Medico ct005 = new _005Atestado_Medico();
	static _006Licenca_Maternidade_Paternidade ct006 = new _006Licenca_Maternidade_Paternidade();
	static _007Dados_Cadastrais ct007 =  new _007Dados_Cadastrais();
	static _008APIP_LP ct008 =  new _008APIP_LP();
	static _009Auxilio_Alimentacao ct009 =  new _009Auxilio_Alimentacao();
	static _010Simular_Ferias ct010 =  new _010Simular_Ferias();
	static _011Alter_Prev_Priv ct011 = new _011Alter_Prev_Priv();
	static _012Calendario_Afastamentos ct012 = new _012Calendario_Afastamentos();
	
	static _013Aviso_Ferias_Digital ct013 = new _013Aviso_Ferias_Digital();
	static _014Consultas ct014 = new _014Consultas();
	static _015Mensagens ct015 = new _015Mensagens();
	static _016Fica_Dica ct016 = new _016Fica_Dica();
	static _017Administracao ct017 = new _017Administracao();
	static _0171LogErros ct0171 = new _0171LogErros();
	static _0172Usuarios ct0172 = new _0172Usuarios();
	static _0173AtualizarUsuarios ct0173 = new _0173AtualizarUsuarios();
	static _0174ArquivoFunc ct0174 = new _0174ArquivoFunc();
	static _0175TabelaParametros ct0175 = new _0175TabelaParametros();
	static _0176ExclusaoComprovanteRendimentos ct0176 = new _0176ExclusaoComprovanteRendimentos();
	static _0177ExcluirContraCheque ct0177 = new _0177ExcluirContraCheque();
	static _0178ExcluirBonusCaixa ct0178 = new _0178ExcluirBonusCaixa();
	static _0179DesabilitarFuncionalidades ct0179 = new _0179DesabilitarFuncionalidades();
	static _0180TermoUso ct0180 = new _0180TermoUso();
	static _0181AlterTermoUso ct0181 = new _0181AlterTermoUso();
	
	
	
	static _018Cracha ct018 = new _018Cracha();
	static _019Requerimento_Pessoal ct019 = new _019Requerimento_Pessoal();
	static _020Fique_Bem ct020 = new _020Fique_Bem();
	
	
	
	

	
	

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
				reportlog.apontarRelatorioHtml("_002ContraCheque");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;

		case "003":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_003Comprovante_de_Rendimentos");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "004":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_004Dependentes");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
			
		case "005":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_005Atestado_Medico");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "006":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_006Licenca_Maternidade_Paternidade");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
			
			
		case "007":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_007Dados_Cadastrais");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "008":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_008APIP_LP");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "009":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_009Auxilio_Alimentacao");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "010":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_010Simular_Ferias");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
			
		case "011":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_011Alter_Prev_Priv");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "012":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_012Calendario_Afastamentos");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "013":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_013Aviso_Ferias_Digital");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "014":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_014Consultas");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "015":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_015Mensagens");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "016":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_016Fica_Dica");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "017":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_017Administracao");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "018":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_018Cracha");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "019":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_019Requerimento_Pessoal");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "020":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_020Fique_Bem");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "0171":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_0171LogErros");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "0172":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_0172Usuarios");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "0173":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_0173AtualizarUsuarios");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "0174":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_0174ArquivoFunc");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "0175":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_0175TabelaParametros");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "0176":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_0176ExclusaoComprovanteRendimentos");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "0177":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_0177ExcluirContraCheque");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "0178":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_0178ExcluirBonusCaixa");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "0179":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_0179DesabilitarFuncionalidades");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "0180":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_0180TermoUso");
				processarCasosTeste(idCaso);
			} catch (final Exception e) {

				throw new Exception();
			}

			break;
			
		case "0181":

			cCaso = idCaso;

			DataDriven.lerCSV();

			try {
				reportlog.apontarRelatorioHtml("_0181AlterTermoUso");
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
					ct002.test002ContraCheque();
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
			
		case "007":

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
					ct007.test007Dados_Cadastrais();
					break;
				}
			}
			break;
			
		case "008":

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
					ct008.test008APIP_LP();
					break;
				}
				
			}
			
			break;
			
		case "009":

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
					ct009.test009Auxilio_Alimentacao();
					break;
				}
			}
			break;
			
		case "010":

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
					ct010.test010Simular_Ferias();
					break;
				}
			}
			break;
			
		case "011":

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
					ct011.test011Alter_Prev_Priv();
					break;
				}
			}
			break;
			
		case "012":

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
					ct012.test012Calendario_Afastamentos();
					break;
				}
			}
			break;
			
			
		case "013":

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
					ct013.test013Aviso_Ferias_Digital();
					break;
				}
			}
			break;
			
			
		case "014":

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
					ct014.test014Consultas();
					break;
				}
			}
			break;
			
		case "015":

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
					ct015.test015Mensagens();
					break;
				}
			}
			break;
			
			
		case "016":

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
					ct016.test016Fica_Dica();
					break;
				}
			}
			break;
			
		case "017":

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
					ct017.test017Administracao();
					break;
				}
			}
			break;
			
		case "018":

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
					ct018.test018Cracha();
					break;
				}
			}
			break;
			
			
		case "019":

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
					ct019.test019Requerimento_Pessoal();
					break;
				}
			}
			break;
			
			
		case "020":

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
					ct020.test020Fique_Bem();
					break;
				}
			}
			break;
			
		case "0171":

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
					ct0171.test0171LogErros();
					break;
				}
			}
			break;
			
		case "0172":

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
					ct0172.test0172Usuarios();
					break;
				}
			}
			break;
			
			
		case "0173":

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
					ct0173.test0173AtualizarUsuarios();
					break;
				}
			}
			break;
			
			
		case "0174":

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
					ct0174.test0174ArquivoFunc();
					break;
				}
			}
			break;
			
		case "0175":

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
					ct0175.test0175TabelaParametros();
					break;
				}
			}
			break;
			
		case "0176":

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
					ct0176.test0176ExclusaoComprovanteRendimentos();
					break;
				}
			}
			break;
			
		case "0177":

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
					ct0177.test0177ExcluirContraCheque();
					break;
				}
			}
			break;
			
			
		case "0178":

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
					ct0178.test0178ExcluirBonusCaixa();
					break;
				}
			}
			break;
			
		case "0179":

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
					ct0179.test0179DesabilitarFuncionalidades();
					break;
				}
			}
			break;
			
		case "0180":

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
					ct0180.test0180TermoUso();
					break;
				}
			}
			break;
			
		case "0181":

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
					ct0181.test0181AlterTermoUso();
					break;
				}
			}
			break;
			
			
			
			
			
			
		}
	}
}


