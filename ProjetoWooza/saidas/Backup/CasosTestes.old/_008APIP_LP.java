/**
 * Script Name	 : <b> ScriptLogarSistema</b>
 * Generated	 : <b>11/03/2020 16:00</b>
 * Description	 : Functional Test Script
 * Original Host : Win10 version xx Build xxx (s)
 * 
 * @since  2020/03/11
 * @author f912629
 * 
 */

package CasosTestes;

import org.junit.Test;

import ftor_junit.ConfigureExecution;
import ftor_junit.SIGPMUtils;

public class _008APIP_LP extends SIGPMUtils {

	// Caso de Teste
	@Test
	public void testar008() throws Exception {

		ConfigureExecution.configurarExecucaoCasosTeste("008");
	}

	// Método de Teste
	public void test008APIP_LP() throws Exception {

		/**********************
		 * Teste
		 ********************/
		acessarURLSIGPM();
		preencherCPF();
		clicarBotaoProximo();
		preencherSenha();
		clicarBotaoEntrar();
		//APPIP_LP
		clicarMenuAPIP_LP();
		escolhaOpcaoAPIP_LP();
		enviarApip();
		// LP
		clicarMenuLP();
		escolhaOpcaoLP();
		enviarLP();
		
		

		/************************************************
		 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
		 * relatório.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
	}

}