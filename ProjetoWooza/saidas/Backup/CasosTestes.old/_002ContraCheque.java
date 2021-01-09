/**
 * Script Name	 : <b> ScriptContraCheque</b>
 * Generated	 : <b>24/06/2020 16:00</b>
 * Description	 : Functional Test Script
 * Original Host : Win10 version xx Build xxx (s)
 * 
 * @since  2020/06/24
 * @author f912629
 * 
 */

package CasosTestes;

import org.junit.Test;

import ftor_junit.ConfigureExecution;
import ftor_junit.SIGPMUtils;

public class _002ContraCheque extends SIGPMUtils {
	// Caso de Teste
	@Test
	public void testar002() throws Exception {

		ConfigureExecution.configurarExecucaoCasosTeste("002");
	}

	// Método de Teste
	public void test002ContraCheque() throws Exception {

		/**********************
		 * Teste
		 ********************/
		acessarURLSIGPM();
		preencherCPF();
		clicarBotaoProximo();
		preencherSenha();
		clicarBotaoEntrar();
		clicarMenuContraCheque2018();
		clicarMenuContraCheque2019();
		//consultar();

		/************************************************
		 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
		 * relatório.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
	}

}
