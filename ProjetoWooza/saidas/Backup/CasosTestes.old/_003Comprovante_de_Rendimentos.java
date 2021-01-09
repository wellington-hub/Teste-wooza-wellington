/**
 * Script Name	 : <b> ScriptComprovante de Rendimentos</b>
 * Generated	 : <b>25/06/2020 13:00</b>
 * Description	 : Functional Test Script
 * Original Host : Win10 version xx Build xxx (s)
 * 
 * @since  2020/06/25
 * @author f912629
 * 
 */

package CasosTestes;

import org.junit.Test;

import ftor_junit.ConfigureExecution;
import ftor_junit.SIGPMUtils;

public class _003Comprovante_de_Rendimentos extends SIGPMUtils {

	// Caso de Teste
	@Test
	public void testar003() throws Exception {

		ConfigureExecution.configurarExecucaoCasosTeste("003");
	}

	// Método de Teste
	public void test003Comprovante_de_Rendimentos() throws Exception {

		/**********************
		 * Teste
		 ********************/
		acessarURLSIGPM();
		preencherCPF();
		clicarBotaoProximo();
		preencherSenha();
		clicarBotaoEntrar();
		comprovanteRendimentos();
		//consultar();

		/************************************************
		 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o
		 * relatório.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
	}

}
